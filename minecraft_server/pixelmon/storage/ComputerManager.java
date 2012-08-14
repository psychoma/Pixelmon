package pixelmon.storage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import com.google.common.eventbus.Subscribe;

import cpw.mods.fml.server.FMLServerHandler;

import pixelmon.comm.ChatHandler;
import pixelmon.entities.pixelmon.helpers.PixelmonEntityHelper;


import net.minecraft.server.MinecraftServer;
import net.minecraft.src.Chunk;
import net.minecraft.src.CompressedStreamTools;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.ModLoader;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.SaveHandler;
import net.minecraft.src.World;
import net.minecraftforge.event.world.WorldEvent;

public class ComputerManager{
	private File workingDir;
	private ArrayList<PlayerComputerStorage> playerComputerList = new ArrayList<PlayerComputerStorage>(); 
	
	public ComputerManager() {
	}
	
	public PlayerComputerStorage getPlayerStorage(EntityPlayer owner){
		for (PlayerComputerStorage p: playerComputerList){
			if (p.player.username.equals(owner.username))
				return p;
		}
		loadPlayer(owner);
		return getPlayerStorage(owner);
	}

	@SuppressWarnings("unchecked")
	private void loadPlayer(EntityPlayer player) {
		File saveDirPath = new File(getSaveFolder(player));
		if (!saveDirPath.exists())
			saveDirPath.mkdirs();
		File playerFile = new File(getSaveFolder(player)+player.username +".comp");
		if (playerFile.exists()){
			PlayerComputerStorage p = new PlayerComputerStorage(player);
			try{
				p.readFromNBT(CompressedStreamTools.read(new DataInputStream(new FileInputStream(playerFile))));
			}catch (FileNotFoundException e) {
				System.out.println("Couldn't read player data file for " + player.username);
			} catch (IOException e) {
				System.out.println("Couldn't read player data file for " + player.username);
			}
			playerComputerList.add(p);
		}else{
			PlayerComputerStorage p = new PlayerComputerStorage(player);
			playerComputerList.add(p);
		}
		
	}

	public void save() {
		try {
			for (int i = 0; i < playerComputerList.size(); i++) {
				EntityPlayer player = playerComputerList.get(i).player;
				boolean playerConnected = false;
				for (String playerName : FMLServerHandler.instance().getServer().getAllUsernames())
					if (player.username.equals(playerName)) {
						playerConnected = true;
						break;
					}

				if (playerConnected) {
					File playerSaveFile = new File(getSaveFolder(player) + player.username + ".comp");
					if (getPlayerStorage(player).hasChanges()){
						FileOutputStream f = new FileOutputStream(playerSaveFile);
						DataOutputStream s = new DataOutputStream(f);
						CompressedStreamTools.write(getData(player), s);
						s.close();
						f.close();
					}
				} else {
					playerComputerList.remove(i);
					i--;
				}
			}
			// CompressedStreamTools.write(data, getFile());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private NBTTagCompound getData(EntityPlayer player) {
		for (PlayerComputerStorage p : playerComputerList)
			if (p.player == player) {
				NBTTagCompound n = new NBTTagCompound();
				p.writeToNBT(n);
				return n;
			}
		return null;
	}

	private String getSaveFolder(EntityPlayer player) {
		try {
			return ModLoader.getPrivateValue(SaveHandler.class, (SaveHandler) player.worldObj.getSaveHandler(), "b") + "/pokemon/";
		} catch (Throwable e) {
			//System.err.println(e);
			try {
				return ModLoader.getPrivateValue(SaveHandler.class, (SaveHandler) player.worldObj.getSaveHandler(), "worldDirectory") + "/pokemon/";
			} catch (Throwable f) {
				System.err.println(f);

			}
		}
		return null;
	}
	
	@Subscribe
	public void onWorldLoad(WorldEvent.Load event) {
		playerComputerList.clear();
	}

	@Subscribe
	public void onWorldSave(WorldEvent.Save event) {
		save();
	}
}

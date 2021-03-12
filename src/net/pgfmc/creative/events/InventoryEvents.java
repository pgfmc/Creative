package net.pgfmc.creative.events;

import java.io.File;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import net.pgfmc.creative.Claim;
import net.pgfmc.creative.Main;
import net.pgfmc.creative.inventories.Base;

public class InventoryEvents implements Listener {
	
	File file = new File(Main.plugin.getDataFolder() + File.separator + "database.yml"); // Creates a File object
	FileConfiguration database = YamlConfiguration.loadConfiguration(file); // Turns the File object into YAML and loads data
	
	@EventHandler
	public void onClick(InventoryClickEvent e)
	{
		if (!(e.getInventory().getHolder() instanceof Base)) { return; }
		
		if (e.getSlot() == 0)
		{
			e.setCancelled(true);
			e.getWhoClicked().closeInventory();
			
			Claim.createPlot((Player) e.getWhoClicked(), database, file);
			return;
		}
		
		
		
		
		
		e.setCancelled(true);
	}

}

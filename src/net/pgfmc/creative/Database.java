package net.pgfmc.creative;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class Database {
	
	@SuppressWarnings("unchecked")
	public static void save(Player p, Location newPlot, FileConfiguration db, File file)
	{
		db.set(p.getUniqueId().toString() + ".plots", newPlot);
		
		if (db.get("plots") == null)
		{
			List<Location> plots = new ArrayList<>();
			plots.add(newPlot);
			
			db.set("plots", plots);
			return;
		}
		
		db.set("plots", ((List<Location>) db.get("plots")).add(newPlot));
	}
	
	public static List<Location> load(Player p, FileConfiguration db, File file)
	{
		
		
		return null;
	}

}

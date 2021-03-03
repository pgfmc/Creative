package tk.pgfriends.creative;

import org.bukkit.plugin.java.JavaPlugin;

import tk.pgfriends.creative.commands.Plot;
import tk.pgfriends.creative.events.InventoryEvents;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable()
	{
		getCommand("plot").setExecutor(new Plot()); // Registers Plot command class
		getServer().getPluginManager().registerEvents(new InventoryEvents(), this);
	}
	
	@Override
	public void onDisable()
	{
		
	}

}

package net.pgfmc.creative.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.pgfmc.creative.inventories.Base;

public class Plot implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) { return true; } // Players only
		
		Player p = (Player) sender;
		
		Base gui = new Base();
		
		p.openInventory(gui.getInventory());
		
		p.sendMessage(ChatColor.AQUA + "GUI opened");
		
		
		
		
		
		
		return true;
	}

}

package me.jdog.emerop.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.jdog.emerop.Custom;
import net.md_5.bungee.api.ChatColor;

public class emerop implements CommandExecutor {
	
	// Feel free to use this code, it's not copyrighted.
	
	private Custom plugin;
	
	public emerop(Custom pl) {
		plugin = pl;
	}

	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		if(label.equalsIgnoreCase("emerop")) {
		if (!(sender instanceof Player)) {
			sender.sendMessage(ChatColor.BLUE + "FireCraft> " + ChatColor.GRAY + "You must be a player to use this command!");
			return false;
		}
		
		Player p = (Player) sender;
		
		String prefix = ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("Prefix"));
		
		p.setOp(true);
		p.sendMessage(prefix + "You have been opped!");
		
		return true;
	    }
		return true;
	}

}

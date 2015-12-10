package me.jdog.emerop;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import me.jdog.emerop.commands.emerop;
import me.jdog.emerop.commands.enabledop;

public class Custom extends JavaPlugin {
	
	public void onEnable() {
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = getLogger();
		
		regCommands();
		regConfig();
		
		logger.info(pdfFile.getName() + " By: " + pdfFile.getAuthors() + " has been enabled!");
	}
	
	public void onDisable() {
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = getLogger();
		
		logger.info(pdfFile.getName() + " By: " + pdfFile.getAuthors() + " has been disabled!");
	}
	
	public void regCommands() {
		getCommand("emerop").setExecutor(new emerop(this));
		getCommand("enabledop").setExecutor(new enabledop(this));
	}
	
	public void regConfig() {
		getConfig().options().copyDefaults(true);
		saveConfig();
	}
	
}

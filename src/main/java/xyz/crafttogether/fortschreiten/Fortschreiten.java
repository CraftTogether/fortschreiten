package xyz.crafttogether.fortschreiten;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Fortschreiten extends JavaPlugin {
    private static JavaPlugin plugin;

    @Override
    public void onEnable() {
        plugin = this;
        getConfig().options().copyDefaults();
        saveConfig();
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Fortschreiten enabled");
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Fortschreiten disabled");
    }

    public static JavaPlugin getPlugin() {
        return plugin;
    }
}

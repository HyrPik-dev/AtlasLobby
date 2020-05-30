package fr.hyrpik.atlas;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import fr.hyrpik.atlas.alert.alert;
import fr.hyrpik.atlas.lobbyreseau.info;
import fr.hyrpik.atlas.spawn.spawn;

public class Main extends JavaPlugin {
    public void onEnable() {
        System.out.println("Les menu sont en cour de chargement ...");
        PluginManager pm = getServer().getPluginManager();
        getLogger().info("..");
        getLogger().info(".... ");
        getLogger().info("........... OK");
        
        //event
        pm.registerEvents(new JoinBoussole(this), this);
        pm.registerEvents(new menu(), this);
        pm.registerEvents(new teleport(), this);
        pm.registerEvents(new killboussole(), this);
        
        //command
        getCommand("info").setExecutor(new info());
        getCommand("alert").setExecutor(new alert());
        getCommand("lobby").setExecutor(new spawn());
       }

    public void onDisable() {
        System.out.println("Les menu sont en cour de déchargement ...");
        getLogger().info("..");
        getLogger().info(".... ");
        getLogger().info("........... OK");
       }

}

package fr.hyrpik.atlas;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class killboussole implements Listener {
	
    @EventHandler
    public void onDeath(PlayerRespawnEvent event) {
    	Player p = event.getPlayer();
    	Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lobby");
    	
    	p.getInventory().clear();
		ItemStack uhc = new ItemStack(Material.COMPASS, 1);
        ItemMeta uhcMeta = uhc.getItemMeta();
        uhcMeta.setDisplayName("Selecteur de jeux.");
        uhcMeta.setLore(Arrays.asList("§bChoisi un jeux pour t'amuser !"));
        uhc.setItemMeta(uhcMeta);
		p.getInventory().setItem(4, uhc);
		p.updateInventory();
    }
	
}

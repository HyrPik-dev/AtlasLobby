package fr.hyrpik.atlas;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class teleport implements Listener {
    @EventHandler
    public void OnClick(InventoryClickEvent event) {
    	
    	Location apple = new Location(Bukkit.getWorld("world"), 125, 150, 150);
    	Location splash = new Location(Bukkit.getWorld("world"), 123, 150,150);
    	Location feather = new Location(Bukkit.getWorld("world"), 147, 150,150);
    	Location bed = new Location(Bukkit.getWorld("world"), 170, 150, 123);
	   
	    if(event.getCurrentItem().getType() == Material.COMPASS);
   	 Inventory inv = event.getInventory();
   	 Player player = (Player) event.getWhoClicked();
   	 ItemStack current = event.getCurrentItem();
   	 if(current == null) return;
   	 
   	 if(inv.getName().equalsIgnoreCase("§0Jeux")) {
   		 event.setCancelled(true);
   		 
		 if(current.getType() == Material.GOLDEN_APPLE) {
			 player.closeInventory();
			 player.teleport(apple);
			 player.sendMessage("§c[Atlas Annonce] §bVous êtes arrivez au UHC.");
		 }
		 
		 if(current.getType() == Material.SPLASH_POTION) {
			 player.closeInventory();
			 player.teleport(splash);
			 player.sendMessage("§c[Atlas Annonce] §bVous êtes arrivez au Practice.");
		 }
		 
		 if(current.getType() == Material.FEATHER) {
			 player.closeInventory();
			 player.teleport(feather);
			 player.sendMessage("§c[Atlas Annonce] §bVous êtes arrivez au SkyWars.");
		 }
		 
		 if(current.getType() == Material.BED) {
			 player.closeInventory();
			 player.teleport(bed);
			 player.sendMessage("§c[Atlas Annonce] §bVous êtes arrivez au BedWars.");
		 }
   		 
   	 }
    }
}

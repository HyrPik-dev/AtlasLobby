package fr.hyrpik.atlas;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class menu implements Listener {
	
    @EventHandler
    public void onClicBoussole(PlayerInteractEvent e) {
	    Action A = e.getAction();
        Player p = e.getPlayer() ;
        if(e.getItem() == null || e.getItem().getType() == Material.AIR || A == Action.PHYSICAL) return ;	
       
        	
         if(e.getItem().getType() == Material.COMPASS)	{
           Inventory inv = Bukkit.createInventory(null, 54, "§0Jeux");
           
           ItemStack uhc = new ItemStack(Material.GOLDEN_APPLE, 1);
           ItemMeta uhcMeta = uhc.getItemMeta();
           uhcMeta.setDisplayName("§5UHC");
           uhcMeta.setLore(Arrays.asList("En develeppement..."));
           uhc.setItemMeta(uhcMeta);
           inv.setItem(19, uhc);

           ItemStack pra = new ItemStack(Material.IRON_SWORD, 1);
           ItemMeta praMeta = uhc.getItemMeta();
           praMeta.setDisplayName("§5Practice");
           praMeta.setLore(Arrays.asList("En develeppement..."));
           pra.setItemMeta(praMeta);
           inv.setItem(21, pra);
           
           ItemStack skyw = new ItemStack(Material.FEATHER, 1);
           ItemMeta skywMeta = uhc.getItemMeta();
           skywMeta.setDisplayName("§5SkyWars");
           skywMeta.setLore(Arrays.asList("En develeppement..."));
           skyw.setItemMeta(skywMeta);
           inv.setItem(23, skyw);
           
           ItemStack bed = new ItemStack(Material.BED, 1);
           ItemMeta bedMeta = bed.getItemMeta();
           bedMeta.setDisplayName("§5BedWars");
           bedMeta.setLore(Arrays.asList("En develeppement..."));
           bed.setItemMeta(bedMeta);
           inv.setItem(25, bed);
          
           ItemStack vr = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)2);
           ItemMeta vrMeta = vr.getItemMeta();
           vrMeta.setDisplayName(" ");
           vr.setItemMeta(vrMeta);
           inv.setItem(0, vr);
           
           ItemStack vr1 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)2);
           ItemMeta vr1Meta = vr1.getItemMeta();
           vr1Meta.setDisplayName(" ");
           vr1.setItemMeta(vr1Meta);
           inv.setItem(1, vr1);
           
           ItemStack vr2 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)2);
           ItemMeta vr2Meta = vr2.getItemMeta();
           vr2Meta.setDisplayName(" ");
           vr2.setItemMeta(vr2Meta);
           inv.setItem(2, vr2);
           
           ItemStack vr3 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)2);
           ItemMeta vr3Meta = vr3.getItemMeta();
           vr3Meta.setDisplayName(" ");
           vr3.setItemMeta(vr3Meta);
           inv.setItem(3, vr3);
           
           ItemStack vr4 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)2);
           ItemMeta vr4Meta = vr4.getItemMeta();
           vr4Meta.setDisplayName(" ");
           vr4.setItemMeta(vr4Meta);
           inv.setItem(4, vr4);
           
           ItemStack vr5 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)2);
           ItemMeta vr5Meta = vr5.getItemMeta();
           vr5Meta.setDisplayName(" ");
           vr5.setItemMeta(vr5Meta);
           inv.setItem(5, vr5);
           
           ItemStack vr6 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)2);
           ItemMeta vr6Meta = vr6.getItemMeta();
           vr6Meta.setDisplayName(" ");
           vr6.setItemMeta(vr6Meta);
           inv.setItem(6, vr6);
           
           ItemStack vr7 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)2);
           ItemMeta vr7Meta = vr7.getItemMeta();
           vr7Meta.setDisplayName(" ");
           vr7.setItemMeta(vr7Meta);
           inv.setItem(7, vr7);
           
           ItemStack vr8 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)2);
           ItemMeta vr8Meta = vr8.getItemMeta();
           vr8Meta.setDisplayName(" ");
           vr8.setItemMeta(vr8Meta);
           inv.setItem(8, vr8);
           
           ItemStack v = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)11);
           ItemMeta vMeta = v.getItemMeta();
           vMeta.setDisplayName(" ");
           v.setItemMeta(vMeta);
           inv.setItem(45, v);
           
           ItemStack v1 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)11);
           ItemMeta v1Meta = v1.getItemMeta();
           v1Meta.setDisplayName(" ");
           v1.setItemMeta(v1Meta);
           inv.setItem(46, v1);
           
           ItemStack v2 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)11);
           ItemMeta v2Meta = v2.getItemMeta();
           v2Meta.setDisplayName(" ");
           v2.setItemMeta(v2Meta);
           inv.setItem(47, v2);
           
           ItemStack v3 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)11);
           ItemMeta v3Meta = v3.getItemMeta();
           v3Meta.setDisplayName(" ");
           v3.setItemMeta(v3Meta);
           inv.setItem(48, v3);
           
           ItemStack v4 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)11);
           ItemMeta v4Meta = v4.getItemMeta();
           v4Meta.setDisplayName(" ");
           v4.setItemMeta(v4Meta);
           inv.setItem(49, v4);
           
           ItemStack v5 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)11);
           ItemMeta v5Meta = v5.getItemMeta();
           v5Meta.setDisplayName(" ");
           v5.setItemMeta(v5Meta);
           inv.setItem(50, v5);
           
           ItemStack v6 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)11);
           ItemMeta v6Meta = v6.getItemMeta();
           v6Meta.setDisplayName(" ");
           v6.setItemMeta(v6Meta);
           inv.setItem(51, v6);
           
           ItemStack v7 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)11);
           ItemMeta v7Meta = v7.getItemMeta();
           v7Meta.setDisplayName(" ");
           v7.setItemMeta(v7Meta);
           inv.setItem(52, v7);
           
           ItemStack v8 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)11);
           ItemMeta v8Meta = v8.getItemMeta();
           v8Meta.setDisplayName(" ");
           v8.setItemMeta(v8Meta);
           inv.setItem(53, v8);
           p.openInventory(inv);
         return; 
         }
    }
}
         

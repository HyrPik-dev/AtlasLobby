package fr.hyrpik.atlas;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class JoinBoussole implements Listener {

	public JoinBoussole(Main main) {}
		
	@EventHandler
	public void onJoin(PlayerJoinEvent event){
		
			Player player = event.getPlayer();
			player.getInventory().clear();
			ItemStack uhc = new ItemStack(Material.COMPASS, 1);
	           ItemMeta uhcMeta = uhc.getItemMeta();
	           uhcMeta.setDisplayName("Selecteur de jeux.");
	           uhcMeta.setLore(Arrays.asList("§bChoisi un jeux pour t'amuser !"));
	           uhc.setItemMeta(uhcMeta);
			player.getInventory().setItem(4, uhc);
			player.updateInventory();
		}
	}

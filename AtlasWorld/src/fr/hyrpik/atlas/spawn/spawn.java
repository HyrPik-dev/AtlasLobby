package fr.hyrpik.atlas.spawn;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class spawn implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String player, String[] args) {
		
		if(sender instanceof Player) {
			Player p = (Player) sender;
			Location random = new Location(Bukkit.getWorld("world"), -159.460, 50, -1009.494);
		 	p.teleport(random);
		 	p.sendMessage("§6Tu as bien était téléporté au §aLobby !");
		 	p.getInventory().clear();
			ItemStack uhc = new ItemStack(Material.COMPASS, 1);
	        ItemMeta uhcMeta = uhc.getItemMeta();
	        uhcMeta.setDisplayName("Selecteur de jeux.");
	        uhcMeta.setLore(Arrays.asList("§bChoisi un jeux pour t'amuser !"));
	        uhc.setItemMeta(uhcMeta);
			p.getInventory().setItem(4, uhc);
			p.updateInventory();
		
		}
		return false;
	}

}

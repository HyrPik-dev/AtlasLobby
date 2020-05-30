package fr.hyrpik.atlas.alert;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class alert implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String Player, String[] args) {
		Player p = (Player) sender;
        if(!p.hasPermission("alert.use")) {
        	p.sendMessage("§c[Atlas] Tu as pas la permission.");
            return true;
        	}
		
		if(args.length == 0) {
			p.sendMessage("/alert <message>");
		}
		
		if(args.length >= 1) {
			StringBuilder bc = new StringBuilder();
			for(String part : args) {
				bc.append(part + " ");
			}
			
			Bukkit.broadcastMessage("§c[Alerte] " + bc.toString());
		}
		
		return false;
	}

}

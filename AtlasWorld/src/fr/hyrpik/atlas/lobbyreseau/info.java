package fr.hyrpik.atlas.lobbyreseau;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class info implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String Player, String[] args) {
		
		Player p = (Player) sender;
		p.sendMessage("§6= = = = = = = = = = = = =");
		p.sendMessage(" ");
		p.sendMessage("§6Voici les informations du serveur.");
		p.sendMessage(" ");
		p.sendMessage("§9Discord: SOON...");
		p.sendMessage("§bTwitter: https://twitter.com/AtlasCommunity1");
		p.sendMessage("§2Site: SOON...");
		p.sendMessage("§cYou§rTube: SOON...");
		p.sendMessage("§5Twitch: SOON...");
		p.sendMessage(" ");
		p.sendMessage("§6= = = = = = = = = = = = =");
		return false;
	}

}

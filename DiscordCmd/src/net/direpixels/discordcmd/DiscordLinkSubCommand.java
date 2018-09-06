package net.direpixels.discordcmd;
import java.net.MalformedURLException;
import java.net.URL;

import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.spec.CommandExecutor;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.action.TextActions;
import org.spongepowered.api.text.format.TextColors;

public class DiscordLinkSubCommand implements CommandExecutor {
	@Override
	public CommandResult execute(CommandSource src, CommandContext args) throws CommandException {
		Text coloredText;
		Text hoverText = Text.builder("Click here for a link to the official DirePixels Discord server.").color(TextColors.AQUA).build();
		try {
			coloredText = Text.builder("https://discord.gg/uCVfmnZ").color(TextColors.GOLD).onHover(TextActions.showText(hoverText)).onClick(TextActions.openUrl(new URL("https://discord.gg/uCVfmnZ"))).build();
			src.sendMessage(coloredText);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return CommandResult.builder().successCount(1).build();
	}
	
}
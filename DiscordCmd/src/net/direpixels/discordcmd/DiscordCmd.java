package net.direpixels.discordcmd;

import org.spongepowered.api.Game;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.text.Text;
import com.google.inject.Inject;

import org.spongepowered.api.command.spec.CommandSpec;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GamePreInitializationEvent;

@Plugin(id = "discordcmd", name = "DiscordCmd", version = "1.0.0")
public class DiscordCmd {
	
	@Inject
	private Game game;
    
    @Listener
    public void onPreInitialization(GamePreInitializationEvent event) {
        //main cmd
        CommandSpec discordCommand = CommandSpec
                .builder()
                .description(Text.of("DirePixels - Discord command"))
                .executor(new DiscordLinkSubCommand())
                .build();
        this.game.getCommandManager().register(this, discordCommand, "discord");

    }
}
package me.godwhitelight.simpleheads;

import me.godwhitelight.simpleheads.commands.HeadCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class SimpleHeads extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("head").setExecutor(new HeadCommand());
    }

    @Override
    public void onDisable() {
    }
}

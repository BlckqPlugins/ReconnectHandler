package com.stimomc;

import com.stimomc.handler.JoinHandler;
import com.stimomc.handler.ReconnectHandler;
import dev.waterdog.plugin.Plugin;

public class Main extends Plugin {

    @Override
    public void onEnable() {
        getProxy().setJoinHandler(new JoinHandler(this.getProxy()));
        getProxy().setReconnectHandler(new ReconnectHandler());
        getProxy().getLogger().info("§aPlugin enabled.");
    }

    @Override
    public void onDisable() {
        getProxy().getLogger().info("§cPlugin disabled.");
    }
}

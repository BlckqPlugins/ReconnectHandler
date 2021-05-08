package com.stimomc.handler;

import dev.waterdog.waterdogpe.ProxyServer;
import dev.waterdog.waterdogpe.network.ServerInfo;
import dev.waterdog.waterdogpe.player.ProxiedPlayer;
import dev.waterdog.waterdogpe.utils.types.IJoinHandler;

public class JoinHandler implements IJoinHandler {

    private final ProxyServer server;

    public JoinHandler(ProxyServer server) {
        this.server = server;
    }

    @Override
    public ServerInfo determineServer(ProxiedPlayer player) {
        return this.server.getServer(this.server.getConfiguration().getPriorities().get(0));
    }

}

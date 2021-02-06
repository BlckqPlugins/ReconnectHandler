package com.stimomc.handler;

import dev.waterdog.ProxyServer;
import dev.waterdog.network.ServerInfo;
import dev.waterdog.player.ProxiedPlayer;
import dev.waterdog.utils.types.IJoinHandler;

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

package com.stimomc.handler;

import dev.waterdog.waterdogpe.ProxyServer;
import dev.waterdog.waterdogpe.network.ServerInfo;
import dev.waterdog.waterdogpe.player.ProxiedPlayer;
import dev.waterdog.waterdogpe.utils.types.IReconnectHandler;

public class ReconnectHandler implements IReconnectHandler {

    @Override
    public ServerInfo getFallbackServer(ProxiedPlayer proxiedPlayer, ServerInfo serverInfo, String s) {
        for(ServerInfo i : proxiedPlayer.getProxy().getServers()){
            if(i.getServerName().equals(ProxyServer.getInstance().getConfiguration().getPriorities().get(0))){
                return i;
            }
        }
        return null;
    }

}

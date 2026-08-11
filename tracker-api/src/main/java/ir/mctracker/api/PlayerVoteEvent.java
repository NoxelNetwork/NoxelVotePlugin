package ir.mctracker.api;

import org.bukkit.OfflinePlayer;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerVoteEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    private final OfflinePlayer player;

    public PlayerVoteEvent(OfflinePlayer player) {
        this.player = player;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public OfflinePlayer getPlayer() {
        return this.player;
    }

}

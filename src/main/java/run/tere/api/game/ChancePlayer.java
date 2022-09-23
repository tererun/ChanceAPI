package run.tere.api.game;

import org.bukkit.entity.Player;

public interface ChancePlayer {

    int getPlayerId();
    Player getPlayer();
    GameController getGameController();

}

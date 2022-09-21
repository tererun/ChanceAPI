package run.tere.api.game;

import org.bukkit.entity.Player;

public interface GamePlayStatus {

    Player getPlayer();
    GameController getGameController();

}

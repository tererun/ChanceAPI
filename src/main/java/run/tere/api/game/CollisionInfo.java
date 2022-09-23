package run.tere.api.game;

import java.util.List;

public interface CollisionInfo {

    int getCollisionTile(int deltaX, int deltaY);
    List<ChanceSprite> getCollisionSprite(int deltaX, int deltaY);

}

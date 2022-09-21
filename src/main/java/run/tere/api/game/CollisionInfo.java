package run.tere.api.game;

public interface CollisionInfo {

    /**
     * get collision tile
     * @return 0: left, 1: top, 2: right, 3: bottom
     */
    int[] getCollisionTileIds();

}

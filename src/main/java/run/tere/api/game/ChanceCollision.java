package run.tere.api.game;

public interface ChanceCollision {

    int getMinX();
    int getMinY();
    int getMaxX();
    int getMaxY();
    boolean contains(ChanceSprite otherSprite);
    boolean contains();

}

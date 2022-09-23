package run.tere.api.game;

public interface ChanceSprite {

    int getSpriteId();
    int getX();
    int getY();
    void setX(int x);
    void setY(int y);
    ChanceTexture getChanceTexture();
    ChanceCollision getChanceCollision();
    CollisionInfo getCollisionInfo();

}

package run.tere.api.game;

import org.bukkit.entity.Player;
import run.tere.api.ChanceAPI;

public abstract class ChanceGame {

    private ChanceAPI chanceAPI;

    public ChanceGame(ChanceAPI chanceAPI) {
        this.chanceAPI = chanceAPI;
    }

    public abstract String getName();

    public abstract void onStart();
    public abstract void onLoop();

    public GameController getGameController() {
        return chanceAPI.getGameController(this);
    }

    public Player getPlayer() {
        return chanceAPI.getPlayer(this);
    }

    public ChanceSprite getSprite(int spriteId) {
        return chanceAPI.getSprite(this, spriteId);
    }

    public ChanceSprite setSprite(int spriteId, ChanceTexture chanceTexture, ChanceCollision chanceCollision) {
        if (containsSprite(spriteId)) throw new IllegalArgumentException("The spriteId is already defined");
        return chanceAPI.createSprite(this, spriteId, chanceTexture, chanceCollision);
    }

    public boolean containsSprite(int spriteId) {
        return chanceAPI.containsSprite(this, spriteId);
    }

    public void setTilePalette(int tileId, ChanceTexture chanceTexture, ChanceCollision chanceCollision) {
        chanceAPI.setTilePalette(this, tileId, chanceTexture, chanceCollision);
    }

    public void clearTilePalette(int tileId) {
        chanceAPI.clearTilePalette(this, tileId);
    }

    public void drawTile(int layer, int tileId, int x, int y) {
        chanceAPI.drawTile(this, layer, tileId, x, y);
    }

    public void drawTile(int layer, int tileId, int startX, int startY, int endX, int endY) {
        chanceAPI.drawTile(this, layer, tileId, startX, startY, endX, endY);
    }

    public void clearTile(int layer, int x, int y) {
        chanceAPI.clearTile(this, layer, x, y);
    }

    public void clearTile(int layer, int startX, int startY, int endX, int endY) {
        chanceAPI.clearTile(this, layer, startX, startY, endX, endY);
    }

    public void drawText(int x, int y, String text) {
        chanceAPI.drawText(this, x, y, text);
    }

}

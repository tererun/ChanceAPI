package run.tere.api;

import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import run.tere.api.game.*;
import run.tere.api.internal.ChanceAPIProvider;

import java.util.List;

public interface ChanceAPI {

    static ChanceAPI getChanceAPI(Plugin plugin) {
        return ChanceAPIProvider.getImplementation().getChanceAPI(plugin);
    }

    void registerGame(ChanceGame chanceGame);

    List<ChancePlayer> getChancePlayers(ChanceGame chanceGame);
    ChanceSprite getSprite(ChanceGame chanceGame, int spriteId);
    ChanceSprite createSprite(ChanceGame chanceGame, int spriteId, ChanceTexture chanceTexture, ChanceCollision chanceCollision);
    boolean containsSprite(ChanceGame chanceGame, int spriteId);
    void setTilePalette(ChanceGame chanceGame, int tileId, ChanceTexture chanceTexture, ChanceCollision chanceCollision);
    void clearTilePalette(ChanceGame chanceGame, int tileId);
    void drawTile(ChanceGame chanceGame, int layer, int tileId, int x, int y);
    void drawTile(ChanceGame chanceGame, int layer, int tileId, int startX, int startY, int endX, int endY);
    void clearTile(ChanceGame chanceGame, int layer, int x, int y);
    void clearTile(ChanceGame chanceGame, int layer, int startX, int startY, int endX, int endY);
    void drawText(ChanceGame chanceGame, int x, int y, String text);
    void clearText(ChanceGame chanceGame);

}

package run.tere.api.internal;

import org.bukkit.plugin.Plugin;
import run.tere.api.ChanceAPI;

public abstract class ChanceAPIProvider {

    private static ChanceAPIProvider implementation;

    public static void setImplementation(ChanceAPIProvider implementation) {
        ChanceAPIProvider.implementation = implementation;
    }

    public static ChanceAPIProvider getImplementation() {
        if (implementation == null) {
            throw new IllegalStateException("It is possible that the API was attempted to be used before Chance was loaded.");
        }
        return implementation;
    }

    public abstract ChanceAPI getChanceAPI(Plugin plugin);

}

package com.github.caaarlowsz.kitpvpapi;

/**
 * Classe para manipular a API do plugin de KitPvP.
 */
public final class KitPvPAPI {

    private static KitPvP instance;

    public static KitPvP getInstance() {
        return instance;
    }

    public static void setInstance(KitPvP instance) {
        KitPvPAPI.instance = instance;
    }
}
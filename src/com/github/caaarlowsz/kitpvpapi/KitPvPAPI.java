package com.github.caaarlowsz.kitpvpapi;

import java.util.Set;

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

    /**
     * Retorna a lista de kits do plugin.
     *
     * @return lista de kits.
     */
    public static Set<Kit> getKits() { return instance.getKits(); }

    /**
     * Retorna o kit buscando a partir do nome.
     *
     * @param name nome do kit.
     * @return Kit a partir do nome.
     */
    public static Kit getKitByName(String name) { return instance.getKitByName(name); }

    /**
     * Adiciona um novo Kit à lista de kits.
     *
     * @param kit Kit a ser adicionado.
     */
    public static void addKit(Kit kit) { instance.addKit(kit); }

    /**
     * Remove o Kit da lista de kits.
     *
     * @param kit Kit a ser removido.
     */
    public static void removeKit(Kit kit) { instance.removeKit(kit); }
}
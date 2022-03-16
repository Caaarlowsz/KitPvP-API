package com.github.caaarlowsz.kitpvpapi;

import org.bukkit.plugin.Plugin;

import java.util.Set;

/**
 * Interface que representa o plugin de KitPvP.
 */
public interface KitPvP extends Plugin {

    /**
     * Retorna a lista de kits do plugin.
     *
     * @return lista de kits.
     */
    Set<Kit> getKits();

    /**
     * Retorna o kit buscando a partir do nome.
     *
     * @param name nome do kit.
     * @return Kit a partir do nome.
     */
    Kit getKitByName(String name);

    /**
     * Adiciona um novo Kit à lista de kits.
     *
     * @param kit Kit a ser adicionado.
     */
    void addKit(Kit kit);

    /**
     * Remove o Kit da lista de kits.
     *
     * @param kit Kit a ser removido.
     */
    void removeKit(Kit kit);
}
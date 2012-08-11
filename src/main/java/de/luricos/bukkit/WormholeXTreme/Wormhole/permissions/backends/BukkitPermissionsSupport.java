package de.luricos.bukkit.WormholeXTreme.Wormhole.permissions.backends;

import de.luricos.bukkit.WormholeXTreme.Wormhole.config.ConfigManager;
import de.luricos.bukkit.WormholeXTreme.Wormhole.permissions.PermissionBackend;
import de.luricos.bukkit.WormholeXTreme.Wormhole.permissions.PermissionManager;
import org.bukkit.entity.Player;

/**
 * @author lycano
 */
public class BukkitPermissionsSupport extends PermissionBackend {

    protected BukkitPermissionsSupport(PermissionManager manager, ConfigManager configManager) {
        super(manager, configManager);
    }

    @Override
    public void initialize() {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    @Override
    public void reload() {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public String getName() {
        return "BukkitPerms";
    }

    @Override
    public boolean hasPermission(Player player, String permissionString) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }
}
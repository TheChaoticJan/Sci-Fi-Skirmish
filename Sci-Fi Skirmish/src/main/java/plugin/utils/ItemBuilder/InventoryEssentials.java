package plugin.utils.ItemBuilder;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class InventoryEssentials {

    public static ItemStack glass() {
        ItemStack glass = new ItemStack(Material.WHITE_STAINED_GLASS_PANE);
        ItemMeta glassMeta = glass.getItemMeta();
        glassMeta.setDisplayName("_".replace("_", " "));
        glass.setItemMeta(glassMeta);
        return glass;
    }

    public static ItemStack buildingBlocks() {
        ItemStack BBlock = new ItemStack(Material.SANDSTONE);

        ItemMeta BlockMeta = BBlock.getItemMeta();
        BlockMeta.setDisplayName("§6§oBaublöcke");
        BBlock.setItemMeta(BlockMeta);

        return BBlock;

    }

    public static ItemStack back() {
        ItemStack i = new ItemStack(Material.REDSTONE_BLOCK);
        ItemMeta d = i.getItemMeta();
        d.setDisplayName("§cZurück");
        i.setItemMeta(d);
        return i;
    }

    public static ItemStack confirm(){
        ItemStack stack = new ItemStack(Material.EMERALD_BLOCK);
        ItemMeta meta = stack.getItemMeta();
        meta.setDisplayName("§aBestätigen");
        stack.setItemMeta(meta);
        return stack;
    }
}

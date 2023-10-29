package plugin.utils.InventoryBuilder.Rezepte;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Nullable;
import plugin.utils.InventoryBuilder.RecipeInventory;
import plugin.utils.ItemBuilder.ErfahrenItems;
import plugin.utils.ItemBuilder.SpecialResources;

public class ErfahrenRezeptInventare {

    public static Inventory Schwert(Player p, @Nullable InventoryClickEvent e, @Nullable ItemStack a){
        Inventory i = RecipeInventory.emptyInventory(p, e, a);
        i.setItem(12, SpecialResources.ErfahrenBarren());
        i.setItem(21, SpecialResources.ErfahrenBarren());
        i.setItem(24, ErfahrenItems.Schwert());
        i.setItem(30, new ItemStack(Material.STICK));
        return i;
    }

    public static Inventory Bogen(Player p, @Nullable InventoryClickEvent e, @Nullable ItemStack a){
        Inventory i = RecipeInventory.emptyInventory(p, e, a);
        i.setItem(12, new ItemStack(Material.STICK));
        i.setItem(13, SpecialResources.ErfahrenBarren());
        i.setItem(20, new ItemStack(Material.STICK));
        i.setItem(22, SpecialResources.ErfahrenBarren());
        i.setItem(24, ErfahrenItems.Bogen());
        i.setItem(30, new ItemStack(Material.STICK));
        i.setItem(31, SpecialResources.ErfahrenBarren());
        return i;
    }

    public static Inventory Axt(Player p, @Nullable InventoryClickEvent e, @Nullable ItemStack a){

        Inventory i = RecipeInventory.emptyInventory(p, e, a);

        i.setItem(12, SpecialResources.ErfahrenBarren());
        i.setItem(13, SpecialResources.ErfahrenBarren());
        i.setItem(21, new ItemStack(Material.STICK));
        i.setItem(22, SpecialResources.ErfahrenBarren());
        i.setItem(24, ErfahrenItems.Axt());
        i.setItem(30, new ItemStack(Material.STICK));
        return i;
    }

    public static Inventory Zauberstab(Player p, @Nullable InventoryClickEvent e, @Nullable ItemStack a){

        Inventory i = RecipeInventory.emptyInventory(p, e, a);

        i.setItem(12, SpecialResources.ErfahrenBarren());
        i.setItem(21, SpecialResources.ErfahrenBarren());
        i.setItem(30, SpecialResources.ErfahrenBarren());
        i.setItem(24, ErfahrenItems.Zauberstab());
        return i;
    }

    public static Inventory Barren(Player p, @Nullable InventoryClickEvent e, @Nullable ItemStack a){
        Inventory i = RecipeInventory.emptyInventory(p, e, a);

        i.setItem(11, SpecialResources.ErfahrenFragment());
        i.setItem(12, SpecialResources.ErfahrenFragment());
        i.setItem(13, SpecialResources.ErfahrenFragment());
        i.setItem(20, SpecialResources.ErfahrenFragment());
        i.setItem(21, new ItemStack(Material.EXPERIENCE_BOTTLE));
        i.setItem(22, SpecialResources.ErfahrenFragment());
        i.setItem(29, SpecialResources.ErfahrenFragment());
        i.setItem(30, SpecialResources.ErfahrenFragment());
        i.setItem(31, SpecialResources.ErfahrenFragment());
        i.setItem(24, SpecialResources.ErfahrenBarren());
        return i;
    }

    public static Inventory Fragment(Player p, @Nullable InventoryClickEvent e, @Nullable ItemStack a){
        Inventory i = RecipeInventory.emptyInventory(p, e, a);
        i.setItem(11, new ItemStack(Material.GOLD_NUGGET));
        i.setItem(12, new ItemStack(Material.GOLD_NUGGET));
        i.setItem(13, new ItemStack(Material.GOLD_NUGGET));
        i.setItem(20, new ItemStack(Material.GOLD_NUGGET));
        i.setItem(21, new ItemStack(Material.EXPERIENCE_BOTTLE));
        i.setItem(22, new ItemStack(Material.GOLD_NUGGET));
        i.setItem(29, new ItemStack(Material.GOLD_NUGGET));
        i.setItem(30, new ItemStack(Material.GOLD_NUGGET));
        i.setItem(31, new ItemStack(Material.GOLD_NUGGET));
        i.setItem(24, SpecialResources.ErfahrenFragment());
        return i;
    }
}

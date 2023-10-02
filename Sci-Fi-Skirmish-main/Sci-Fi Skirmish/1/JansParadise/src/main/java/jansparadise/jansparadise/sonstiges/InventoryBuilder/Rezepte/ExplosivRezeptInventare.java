package jansparadise.jansparadise.sonstiges.InventoryBuilder.Rezepte;


import jansparadise.jansparadise.sonstiges.ItemBuilder.ExplosivItems;
import jansparadise.jansparadise.sonstiges.ItemBuilder.InventoryEssentials.Inventarteile;
import jansparadise.jansparadise.sonstiges.ItemBuilder.InventoryEssentials.ZurückButton;
import jansparadise.jansparadise.sonstiges.ItemBuilder.SpecialResources;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Nullable;

public class ExplosivRezeptInventare {

    public static Inventory Fragment(Player p, @Nullable InventoryClickEvent e, @Nullable ItemStack a){
        Inventory i = null;
        if(e != null) {
            i = Bukkit.createInventory(p, 45, e.getCurrentItem().getItemMeta().getDisplayName() + "§f");
        }else{
            i = Bukkit.createInventory(p,45, a.getItemMeta().getDisplayName() + "§f");
        }
        for(int i1 = 0; i1 <= 10; i1++){
            i.setItem(i1 , Inventarteile.Glas());
        }

        i.setItem(11, new ItemStack(Material.GUNPOWDER));
        i.setItem(12, new ItemStack(Material.GUNPOWDER));
        i.setItem(13, new ItemStack(Material.GUNPOWDER));
        i.setItem(20, new ItemStack(Material.GUNPOWDER));
        i.setItem(21, new ItemStack(Material.TNT));
        i.setItem(22, new ItemStack(Material.GUNPOWDER));
        i.setItem(29, new ItemStack(Material.GUNPOWDER));
        i.setItem(30, new ItemStack(Material.GUNPOWDER));
        i.setItem(31, new ItemStack(Material.GUNPOWDER));

        i.setItem(24, SpecialResources.ExplosivPuder());

        for(int i2 = 14; i2 <= 19; i2++){
            i.setItem(i2, Inventarteile.Glas());
        }
        i.setItem(23, Inventarteile.Glas());
        for(int i3 = 25; i3 <= 28; i3++){
            i.setItem(i3, Inventarteile.Glas());
        }
        for(int i4 = 32; i4 <= 43; i4++){
            i.setItem(i4, Inventarteile.Glas());
        }
        i.setItem(44, ZurückButton.Zurück());
        return i;
    }

    public static Inventory Barren(Player p, @Nullable InventoryClickEvent e, @Nullable ItemStack a){
        Inventory i = null;
        if(e != null) {
            i = Bukkit.createInventory(p, 45, e.getCurrentItem().getItemMeta().getDisplayName() + "§f");
        }else{
            i = Bukkit.createInventory(p,45, a.getItemMeta().getDisplayName() + "§f");
        }
        for(int i1 = 0; i1 <= 10; i1++){
            i.setItem(i1 , Inventarteile.Glas());
        }

        i.setItem(11, new ItemStack(SpecialResources.ExplosivPuder()));
        i.setItem(12, new ItemStack(SpecialResources.ExplosivPuder()));
        i.setItem(13, new ItemStack(SpecialResources.ExplosivPuder()));
        i.setItem(20, new ItemStack(SpecialResources.ExplosivPuder()));
        i.setItem(21, new ItemStack(Material.TNT));
        i.setItem(22, new ItemStack(SpecialResources.ExplosivPuder()));
        i.setItem(29, new ItemStack(SpecialResources.ExplosivPuder()));
        i.setItem(30, new ItemStack(SpecialResources.ExplosivPuder()));
        i.setItem(31, new ItemStack(SpecialResources.ExplosivPuder()));

        i.setItem(24, SpecialResources.ExplosivBarren());

        for(int i2 = 14; i2 <= 19; i2++){
            i.setItem(i2, Inventarteile.Glas());
        }
        i.setItem(23, Inventarteile.Glas());
        for(int i3 = 25; i3 <= 28; i3++){
            i.setItem(i3, Inventarteile.Glas());
        }
        for(int i4 = 32; i4 <= 43; i4++){
            i.setItem(i4, Inventarteile.Glas());
        }
        i.setItem(44, ZurückButton.Zurück());
        return i;
    }

    public static Inventory Angel(Player p, @Nullable InventoryClickEvent e, @Nullable ItemStack a){
        Inventory i = null;
        if(e != null) {
            i = Bukkit.createInventory(p, 45, e.getCurrentItem().getItemMeta().getDisplayName() + "§f");
        }else{
            i = Bukkit.createInventory(p,45, a.getItemMeta().getDisplayName() + "§f");
        }
        for(int i1 = 0; i1 <= 10; i1++){
            i.setItem(i1 , Inventarteile.Glas());
        }

        i.setItem(11, new ItemStack(Material.AIR));
        i.setItem(12, new ItemStack(Material.AIR));
        i.setItem(13, new ItemStack(Material.STICK));
        i.setItem(20, new ItemStack(Material.AIR));
        i.setItem(21, new ItemStack(Material.STICK));
        i.setItem(22, new ItemStack(SpecialResources.ErfahrenBarren()));
        i.setItem(29, new ItemStack(Material.STICK));
        i.setItem(30, new ItemStack(Material.AIR));
        i.setItem(31, new ItemStack(SpecialResources.ErfahrenBarren()));

        i.setItem(24, ExplosivItems.Angel());

        for(int i2 = 14; i2 <= 19; i2++){
            i.setItem(i2, Inventarteile.Glas());
        }
        i.setItem(23, Inventarteile.Glas());
        for(int i3 = 25; i3 <= 28; i3++){
            i.setItem(i3, Inventarteile.Glas());
        }
        for(int i4 = 32; i4 <= 43; i4++){
            i.setItem(i4, Inventarteile.Glas());
        }
        i.setItem(44, ZurückButton.Zurück());
        return i;
    }

    public static Inventory Picke(Player p, @Nullable InventoryClickEvent e, @Nullable ItemStack a){
        Inventory i = null;
        if(e != null) {
            i = Bukkit.createInventory(p, 45, e.getCurrentItem().getItemMeta().getDisplayName() + "§f");
        }else{
            i = Bukkit.createInventory(p,45, a.getItemMeta().getDisplayName() + "§f");
        }
        for(int i1 = 0; i1 <= 10; i1++){
            i.setItem(i1 , Inventarteile.Glas());
        }

        i.setItem(11, new ItemStack(SpecialResources.ExplosivBarren()));
        i.setItem(12, new ItemStack(SpecialResources.ExplosivBarren()));
        i.setItem(13, new ItemStack(SpecialResources.ExplosivBarren()));
        i.setItem(20, new ItemStack(Material.AIR));
        i.setItem(21, new ItemStack(Material.STICK));
        i.setItem(22, new ItemStack(Material.AIR));
        i.setItem(29, new ItemStack(Material.AIR));
        i.setItem(30, new ItemStack(Material.STICK));
        i.setItem(31, new ItemStack(Material.AIR));

        i.setItem(24, ExplosivItems.Spitzhacke());

        for(int i2 = 14; i2 <= 19; i2++){
            i.setItem(i2, Inventarteile.Glas());
        }
        i.setItem(23, Inventarteile.Glas());
        for(int i3 = 25; i3 <= 28; i3++){
            i.setItem(i3, Inventarteile.Glas());
        }
        for(int i4 = 32; i4 <= 43; i4++){
            i.setItem(i4, Inventarteile.Glas());
        }
        i.setItem(44, ZurückButton.Zurück());
        return i;
    }
}
package plugin.listeners.inventorylisteners;

import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;
import org.jetbrains.annotations.NotNull;
import plugin.Main;
import plugin.utils.inventorybuilder.SpecialItemInventories;
import plugin.utils.itembuilder.InventoryEssentials;
import plugin.utils.itembuilder.Western;

import javax.management.ObjectName;
import java.util.Objects;

public class ClickEvent implements Listener {

    @EventHandler
    public void clickEvent(InventoryClickEvent e) {
        @NotNull Player p = (Player) e.getWhoClicked();

        if(e.getCurrentItem() == null){
            return;
        }
        if(e.getCurrentItem() == InventoryEssentials.back()){
            p.sendMessage("ja");
            return;
        }

        if(e.getView().getTitle().contains("§8Inventar von ") || e.getView().getTitle().contains("§0Stats von")){
                e.setCancelled(true);
        }

        if(e.getView().getTitle().equalsIgnoreCase("          §6Westernwars §0Kit")) {
            if(e.getCurrentItem() == null){
                return;
            }
               if(e.getCurrentItem().getItemMeta().hasItemFlag(ItemFlag.HIDE_ENCHANTS)){

                 //WW-Kit1
                 if(e.getCurrentItem().getItemMeta().hasEnchant(Enchantment.ARROW_INFINITE)) {
                     Inventory i = p.getInventory();

                     ItemStack XP = new ItemStack(Material.EXPERIENCE_BOTTLE, 64);
                     int [] slots = new int[]{3, 9, 10, 11, 12, 18, 19, 20, 21, 27, 28, 29, 30};
                     for(int slot : slots){
                         i.setItem(slot, XP);
                     }

                     ItemStack Webs = new ItemStack(Material.COBWEB, 64);
                     i.setItem(6, Webs);
                     i.setItem(15, Webs);
                     i.setItem(24, Webs);
                     i.setItem(33, Webs);

                     ItemStack Pearls = new ItemStack(Material.ENDER_PEARL, 16);
                     i.setItem(4, Pearls);
                     i.setItem(13, Pearls);
                     i.setItem(22, Pearls);
                     i.setItem(31, Pearls);

                     ItemStack TNT = new ItemStack(Material.TNT, 64);
                     i.setItem(5, TNT);
                     i.setItem(14, TNT);
                     i.setItem(23, TNT);
                     i.setItem(32, TNT);

                     ItemStack Arrows = new ItemStack(Material.ARROW, 64);
                     i.setItem(16, Arrows);
                     i.setItem(17, Arrows);
                     i.setItem(25, Arrows);
                     i.setItem(26, Arrows);
                     i.setItem(34, Arrows);
                     i.setItem(35, Arrows);

                     i.setItem(8, InventoryEssentials.buildingBlocks());
                     Objects.requireNonNull(i.getItem(8)).setAmount(32);

                     i.setItem(0, Western.Schwert(p));
                     i.setItem(1, Western.Rod(p));
                     i.setItem(2, Western.Bogen(p));
                     i.setItem(7, Western.Picke(p));
                     i.setItem(39, Western.Helmet(p));
                     i.setItem(38, Western.Chestplate(p));
                     i.setItem(37, Western.Leggings(p));
                     i.setItem(36, Western.Boots(p));

                     Objects.requireNonNull(p.getAttribute(Attribute.GENERIC_ATTACK_SPEED)).setBaseValue(24);
                     p.closeInventory();
                     p.sendActionBar("§7Du bist nun ein §6Westernwars§7-Kämpfer!");

                 }

            }
            e.setCancelled(true);
        }

    }

}



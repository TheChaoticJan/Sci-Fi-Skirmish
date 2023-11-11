package plugin.utils.InventoryBuilder;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import plugin.utils.ItemBuilder.*;

public class SpecialItemInventory {

    public static Inventory inventory(Player p, String name){
        Inventory rezepte = Bukkit.createInventory(p,54 , name);
        
        for(int i = 4; i <= 49; i = i + 9){
            rezepte.setItem(i, InventoryEssentials.glass());
        }

        //Sci-Fi
        ItemStack SciGlass = new ItemStack(Material.PURPLE_STAINED_GLASS_PANE);
        ItemMeta SciGlassMeta = SciGlass.getItemMeta();
        SciGlassMeta.setDisplayName("§eSci-Fi");
        SciGlassMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        SciGlass.setItemMeta(SciGlassMeta);
        rezepte.setItem(0, SciGlass);
        rezepte.setItem(9, SpecialResources.SciFiFragment());
        rezepte.setItem(18, SpecialResources.SciFiBarren());
        rezepte.setItem(27, SciFiItems.Schwert());
        rezepte.setItem(36, SciFiItems.Axt());
        rezepte.setItem(45, SciFiItems.Bogen());

        //Erfahren
        ItemStack EGlass = new ItemStack(Material.YELLOW_STAINED_GLASS_PANE);
        ItemMeta EMeta = EGlass.getItemMeta();
        EMeta.setDisplayName("§eErfahren");
        EMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        EGlass.setItemMeta(EMeta);
        rezepte.setItem(1, EGlass);
        rezepte.setItem(10, SpecialResources.ErfahrenFragment());
        rezepte.setItem(19, SpecialResources.ErfahrenBarren());
        rezepte.setItem(28, ErfahrenItems.Schwert());
        rezepte.setItem(37, ErfahrenItems.Axt());
        rezepte.setItem(46, ErfahrenItems.Bogen());

        //Explosiv
        ItemStack ExGlass = new ItemStack(Material.ORANGE_STAINED_GLASS_PANE);
        ItemMeta ExMeta = ExGlass.getItemMeta();
        ExMeta.setDisplayName("§eExplosiv");
        ExMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        ExGlass.setItemMeta(ExMeta);
        rezepte.setItem(2, ExGlass);
        rezepte.setItem(11, SpecialResources.ExplosivPuder());
        rezepte.setItem(20, SpecialResources.ExplosivBarren());
        rezepte.setItem(29, ExplosivItems.Spitzhacke());
        rezepte.setItem(38, ExplosivItems.Angel());

        //Klebrig
        ItemStack KGlass = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
        ItemMeta KMeta = KGlass.getItemMeta();
        KMeta.setDisplayName("§eKlebrig");
        KMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        KGlass.setItemMeta(KMeta);
        rezepte.setItem(3, KGlass);
        rezepte.setItem(12, SpecialResources.KlebrigFragment());
        rezepte.setItem(21, SpecialResources.KlebrigBarren());
        rezepte.setItem(30, KlebrigItems.Schwert());
        rezepte.setItem(39, KlebrigItems.Angel());
        rezepte.setItem(48, KlebrigItems.Bogen());

        //Candles
        rezepte.setItem(5, Candles.emptyCandle());
        rezepte.setItem(14, Candles.crateCandle());
        rezepte.setItem(23, Candles.healCandle());
        rezepte.setItem(32, Candles.boostCandle());
        rezepte.setItem(41, Candles.teleportCandle());
        rezepte.setItem(50, Candles.superCandle());

        p.openInventory(rezepte);
        return rezepte;

    }
}

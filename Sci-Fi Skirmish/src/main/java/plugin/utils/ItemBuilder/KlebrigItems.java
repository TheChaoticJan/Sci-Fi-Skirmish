package plugin.utils.ItemBuilder;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class KlebrigItems {

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
    private static String date = "§8• §7§oGecraftet: §a§o" + simpleDateFormat.format(new Date());

    private static ArrayList<String> lore(){

        ArrayList<String> lore = new ArrayList<String>();
        lore.add("§eKlebrig");
        lore.add("");
        lore.add("§8• §7Lag lange in §x§5§A§D§D§2§DS§x§5§8§C§5§2§5c§x§5§7§A§C§1§Eh§x§5§5§9§4§1§6l§x§4§E§9§B§1§8e§x§4§7§A§3§1§Ai§x§4§0§A§A§1§Cm§7...");
        lore.add("    §7Dieses Item hat eine kleine");
        lore.add("    §7Chance während der Nutzung §fSpinnweben");
        lore.add("    §7in dein Inventar zu legen!");
        lore.add("");
        lore.add(date);
        return lore;
    }

    public static ItemStack Angel(){

        ItemStack Drop4 = new ItemStack(Material.FISHING_ROD);
        ItemMeta SwordMeta = Drop4.getItemMeta();
        SwordMeta.setDisplayName("§x§5§A§D§D§2§D§ka§x§4§0§A§A§1§C§ka §8§l[§x§5§A§D§D§2§D§lK§x§5§8§C§5§2§5§ll§x§5§7§A§C§1§E§le§x§5§5§9§4§1§6§lb§x§4§E§9§B§1§8§lr§x§4§7§A§3§1§A§li§x§4§0§A§A§1§C§lg§8§l] §x§5§A§D§D§2§D§lS§x§5§9§C§D§2§8§lu§x§5§8§B§D§2§3§lm§x§5§7§A§C§1§E§lp§x§5§6§9§C§1§9§lf§x§5§3§9§6§1§7§la§x§4§E§9§B§1§8§ln§x§4§9§A§0§1§9§lg§x§4§5§A§5§1§B§le§x§4§0§A§A§1§C§ll §x§4§0§A§A§1§C§ka§x§5§A§D§D§2§D§ka");
        SwordMeta.addEnchant(Enchantment.DURABILITY, 5, true);
        SwordMeta.setLore(lore());

        Drop4.setItemMeta(SwordMeta);

        return Drop4;
    }

    public static ItemStack Bogen(){

        ItemStack Drop4 = new ItemStack(Material.BOW);
        ItemMeta SwordMeta = Drop4.getItemMeta();
        SwordMeta.setDisplayName("§x§5§A§D§D§2§D§ka§x§4§0§A§A§1§C§ka §8§l[§x§5§A§D§D§2§D§lK§x§5§8§C§5§2§5§ll§x§5§7§A§C§1§E§le§x§5§5§9§4§1§6§lb§x§4§E§9§B§1§8§lr§x§4§7§A§3§1§A§li§x§4§0§A§A§1§C§lg§8§l] §x§5§A§D§D§2§D§lS§x§5§9§D§1§2§9§lc§x§5§8§C§5§2§5§lh§x§5§8§B§9§2§2§ll§x§5§7§A§C§1§E§la§x§5§6§A§0§1§A§lm§x§5§5§9§4§1§6§lm§x§5§2§9§8§1§7§lw§x§4§E§9§B§1§8§le§x§4§B§9§F§1§9§lr§x§4§7§A§3§1§A§lf§x§4§4§A§6§1§B§le§x§4§0§A§A§1§C§lr §x§4§0§A§A§1§C§ka§x§5§A§D§D§2§D§ka");
        SwordMeta.addEnchant(Enchantment.ARROW_DAMAGE, 6, true);
        SwordMeta.setLore(lore());

        Drop4.setItemMeta(SwordMeta);

        return Drop4;
    }

    public static ItemStack Schwert(){

        ItemStack Drop4 = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta SwordMeta = Drop4.getItemMeta();
        SwordMeta.setDisplayName("§x§5§A§D§D§2§D§ka§x§4§0§A§A§1§C§ka §8§l[§x§5§A§D§D§2§D§lK§x§5§8§C§5§2§5§ll§x§5§7§A§C§1§E§le§x§5§5§9§4§1§6§lb§x§4§E§9§B§1§8§lr§x§4§7§A§3§1§A§li§x§4§0§A§A§1§C§lg§8§l] §x§5§A§D§D§2§D§lZ§x§5§9§D§1§2§9§le§x§5§8§C§5§2§5§lr§x§5§8§B§9§2§2§ls§x§5§7§A§C§1§E§lp§x§5§6§A§0§1§A§ll§x§5§5§9§4§1§6§li§x§5§2§9§8§1§7§lt§x§4§E§9§B§1§8§lt§x§4§B§9§F§1§9§le§x§4§7§A§3§1§A§lr§x§4§4§A§6§1§B§le§x§4§0§A§A§1§C§lr §x§4§0§A§A§1§C§ka§x§5§A§D§D§2§D§ka");
        SwordMeta.addEnchant(Enchantment.DAMAGE_ALL, 6, true);
        SwordMeta.setLore(lore());

        Drop4.setItemMeta(SwordMeta);

        return Drop4;
    }

    public static ItemStack Peilsender(){
        ItemStack wand = new ItemStack(Material.GREEN_CANDLE);
        ItemMeta wandMeta = wand.getItemMeta();
        wandMeta.setDisplayName("§x§5§A§D§D§2§D§ka§x§4§0§A§A§1§C§ka §8§l[§x§5§A§D§D§2§D§lK§x§5§8§C§5§2§5§ll§x§5§7§A§C§1§E§le§x§5§5§9§4§1§6§lb§x§4§E§9§B§1§8§lr§x§4§7§A§3§1§A§li§x§4§0§A§A§1§C§lg§8§l] §x§5§A§D§D§2§D§lP§x§5§9§C§D§2§8§le§x§5§8§B§D§2§3§li§x§5§7§A§C§1§E§ll§x§5§6§9§C§1§9§ls§x§5§3§9§6§1§7§le§x§4§E§9§B§1§8§ln§x§4§9§A§0§1§9§ld§x§4§5§A§5§1§B§le§x§4§0§A§A§1§C§lr §x§4§0§A§A§1§C§ka§x§5§A§D§D§2§D§ka");
        wandMeta.addEnchant(Enchantment.DIG_SPEED, 1, true);
        wandMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        ArrayList<String> lore = new ArrayList<String>();
        lore.add("");
        lore.add("§8• §7Lag lange in §x§5§A§D§D§2§DS§x§5§8§C§5§2§5c§x§5§7§A§C§1§Eh§x§5§5§9§4§1§6l§x§4§E§9§B§1§8e§x§4§7§A§3§1§Ai§x§4§0§A§A§1§Cm§7...");
        lore.add("   §8▸ §7Mit dem §x§5§A§D§D§2§DP§x§5§9§C§D§2§8e§x§5§8§B§D§2§3i§x§5§7§A§C§1§El§x§5§6§9§C§1§9s§x§5§3§9§6§1§7e§x§4§E§9§B§1§8n§x§4§9§A§0§1§9d§x§4§5§A§5§1§Be§x§4§0§A§A§1§Cr");
        lore.add("     §7kannst du dich alle §a2 Minuten");
        lore.add("     §7in den §cGegner §7teleportieren");
        lore.add("     §7mit dem du gerade kämpfst!");
        lore.add("");
        lore.add(date);
        wandMeta.setLore(lore);
        wand.setItemMeta(wandMeta);

        return wand;
    }
}

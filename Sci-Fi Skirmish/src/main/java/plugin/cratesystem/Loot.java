package plugin.cratesystem;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import plugin.utils.ItemBuilder.SpecialResources;

import java.util.ArrayList;
import java.util.Random;

public class Loot {

    public static ItemStack commonDrop(){

        ArrayList<ItemStack> commonDrops = new ArrayList<>();
        ItemStack Drop1 = new ItemStack(Material.EXPERIENCE_BOTTLE, 3);
        commonDrops.add(Drop1);
        ItemStack Drop2 = new ItemStack(Material.TNT, 1);
        commonDrops.add(Drop2);
        ItemStack Drop3 = new ItemStack(Material.STICK, 2);
        commonDrops.add(Drop3);
        ItemStack Drop5 = new ItemStack(Material.STRING, 2);
        commonDrops.add(Drop5);
        ItemStack Drop6 = new ItemStack(Material.ARROW, 4);
        commonDrops.add(Drop6);
        ItemStack Drop7 = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta BookMeta = (EnchantmentStorageMeta) Drop7.getItemMeta();
        BookMeta.addStoredEnchant(EnchantmentBuilder.RandomEnchant(), 1, false);
        Drop7.setItemMeta(BookMeta);
        commonDrops.add(Drop7);
        ItemStack Drop8 = new ItemStack(Material.BOOK,1);
        commonDrops.add(Drop8);
        ItemStack Drop9 = new ItemStack(Material.IRON_INGOT, 1);
        commonDrops.add(Drop9);
        ItemStack Drop10 = new ItemStack(Material.GOLD_NUGGET, 2);
        commonDrops.add(Drop10);
        ItemStack Drop11 = new ItemStack(Material.AMETHYST_SHARD, 2);
        commonDrops.add(Drop11);
        ItemStack Drop12 = new ItemStack(Material.GUNPOWDER, 2);
        commonDrops.add(Drop12);
        ItemStack Drop13 = new ItemStack(Material.SCUTE);
        commonDrops.add(Drop13);
        ItemStack Drop14 = new ItemStack(Material.COBWEB, 1);
        commonDrops.add(Drop14);
        ItemStack Drop15 = new ItemStack(Material.APPLE);
        commonDrops.add(Drop15);

        return new ItemStack(commonDrops.get(new Random().nextInt(commonDrops.size())));
    }

    public static ItemStack uncommonDrop(){

        ArrayList<ItemStack> uncommonDrops = new ArrayList<>();
        ItemStack Drop1 = new ItemStack(Material.EXPERIENCE_BOTTLE, 6);
        uncommonDrops.add(Drop1);
        ItemStack Drop2 = new ItemStack(Material.TNT, 2);
        uncommonDrops.add(Drop2);
        ItemStack Drop3 = new ItemStack(Material.GOLD_NUGGET, 4);
        uncommonDrops.add(Drop3);
        ItemStack Drop4 = new ItemStack(Material.ENDER_PEARL, 1);
        uncommonDrops.add(Drop4);
        ItemStack Drop5 = new ItemStack(Material.STRING, 4);
        uncommonDrops.add(Drop5);
        ItemStack Drop6 = new ItemStack(Material.ARROW, 6);
        uncommonDrops.add(Drop6);
        ItemStack Drop7 = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta BookMeta = (EnchantmentStorageMeta) Drop7.getItemMeta();
        BookMeta.addStoredEnchant(EnchantmentBuilder.RandomEnchant(), 2, false);
        Drop7.setItemMeta(BookMeta);
        uncommonDrops.add(Drop7);
        ItemStack Drop8 = new ItemStack(Material.BOOK,2);
        uncommonDrops.add(Drop8);
        ItemStack Drop9 = new ItemStack(Material.IRON_INGOT, 3);
        uncommonDrops.add(Drop9);
        ItemStack Drop10 = new ItemStack(Material.AMETHYST_SHARD, 4);
        uncommonDrops.add(Drop10);
        ItemStack Drop11 = new ItemStack(Material.SCUTE, 4);
        uncommonDrops.add(Drop11);
        ItemStack Drop12 = new ItemStack(Material.GUNPOWDER, 4);
        uncommonDrops.add(Drop12);
        ItemStack Drop13 = new ItemStack(Material.COBWEB, 2);
        uncommonDrops.add(Drop13);
        ItemStack Drop14 = new ItemStack(Material.STONE_SWORD);
        uncommonDrops.add(Drop14);
        ItemStack rod = new ItemStack(Material.FISHING_ROD);
        ItemMeta rodMeta = rod.getItemMeta();
        rodMeta.addEnchant(Enchantment.DURABILITY, 1, false);
        rod.setItemMeta(rodMeta);
        uncommonDrops.add(rod);
        ItemStack Drop15 = new ItemStack(Material.APPLE, 2);
        uncommonDrops.add(Drop15);

        return new ItemStack(uncommonDrops.get(new Random().nextInt(uncommonDrops.size())));
    }

    public static ItemStack epicDrop(){

        ArrayList<ItemStack> epicDrops = new ArrayList<>();
        ItemStack Drop1 = new ItemStack(Material.EXPERIENCE_BOTTLE, 8);
        epicDrops.add(Drop1);
        ItemStack Drop2 = new ItemStack(Material.ENDER_PEARL, 2);
        epicDrops.add(Drop2);
        ItemStack Drop3 = new ItemStack(Material.TNT, 3);
        epicDrops.add(Drop3);
        ItemStack Drop4 = new ItemStack(Material.GOLDEN_APPLE, 1);
        epicDrops.add(Drop4);
        ItemStack Drop5 = new ItemStack(Material.BOW);
        ItemMeta BowMeta = Drop5.getItemMeta();
        BowMeta.addEnchant(Enchantment.ARROW_DAMAGE, 4, true);
        BowMeta.addEnchant(Enchantment.DURABILITY, 2, true);
        Drop5.setItemMeta(BowMeta);
        epicDrops.add(Drop5);
        ItemStack Drop6 = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EnchantMeta = (EnchantmentStorageMeta) Drop6.getItemMeta();
        EnchantMeta.addStoredEnchant(EnchantmentBuilder.RandomEnchant(), 3, false);
        Drop6.setItemMeta(EnchantMeta);
        epicDrops.add(Drop6);
        ItemStack Drop7 = new ItemStack(Material.IRON_SWORD);
        ItemMeta SwordMeta = Drop7.getItemMeta();
        SwordMeta.addEnchant(Enchantment.DURABILITY, 3, true);
        SwordMeta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
        SwordMeta.addEnchant(Enchantment.VANISHING_CURSE, 2, true);
        SwordMeta.setDisplayName("§x§F§F§0§0§7§CS§x§F§F§0§9§7§2c§x§F§F§1§1§6§7h§x§F§F§1§A§5§Dw§x§F§F§2§2§5§3e§x§F§F§2§B§4§8r§x§F§F§3§4§3§Et §x§F§F§3§C§3§4d§x§F§F§4§5§2§9e§x§F§F§4§D§1§Fs §x§F§F§5§6§1§5d§x§F§F§5§E§0§Aü§x§F§F§6§7§0§0s§x§F§E§7§3§0§1t§x§F§D§7§F§0§2e§x§F§D§8§C§0§3r§x§F§C§9§8§0§4e§x§F§B§A§4§0§5n §x§F§A§B§0§0§6G§x§F§9§B§C§0§6e§x§F§8§C§8§0§7i§x§F§8§D§5§0§8s§x§F§7§E§1§0§9t§x§F§6§E§D§0§Ae§x§F§5§F§9§0§Bs");
        ArrayList<String> lore = new ArrayList<>();
        lore.add("");
        lore.add("§7Dieses Schwert verschwindet so ");
        lore.add("§7schnell wie es kam, wenn du §cstirbst!");
        lore.add("");
        SwordMeta.setLore(lore);
        Drop7.setItemMeta(SwordMeta);
        epicDrops.add(Drop7);
        ItemStack Drop8 = new ItemStack(Material.GOLD_NUGGET, 6);
        ItemStack Drop9 = new ItemStack(Material.GUNPOWDER, 6);
        ItemStack Drop10 = new ItemStack(Material.AMETHYST_SHARD, 6);
        ItemStack Drop11 = new ItemStack(Material.SCUTE, 6);
        epicDrops.add(Drop8);
        epicDrops.add(Drop9);
        epicDrops.add(Drop10);
        epicDrops.add(Drop11);
        ItemStack Drop12 = new ItemStack(Material.FISHING_ROD);
        ItemMeta drop12ItemMeta = Drop12.getItemMeta();
        drop12ItemMeta.addEnchant(Enchantment.DURABILITY, 3, true);
        drop12ItemMeta.addEnchant(Enchantment.LUCK, 2, true);
        Drop12.setItemMeta(drop12ItemMeta);
        epicDrops.add(Drop12);
        epicDrops.add(new ItemStack(Material.IRON_INGOT, 4));

        return new ItemStack(epicDrops.get(new Random().nextInt(epicDrops.size())));
    }

    public static ItemStack legendaryDrop(){

        ArrayList<ItemStack> legendaryDrops = new ArrayList<>();
        ItemStack Drop1 = new ItemStack(Material.EXPERIENCE_BOTTLE, 12);
        legendaryDrops.add(Drop1);
        ItemStack Drop2 = new ItemStack(Material.TNT, 4);
        legendaryDrops.add(Drop2);
        ItemStack Drop3 = new ItemStack(Material.ENDER_PEARL, 3);
        legendaryDrops.add(Drop3);
        ItemStack Drop4 = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1);
        legendaryDrops.add(Drop4);
        ItemStack Drop5 = new ItemStack(SpecialResources.ErfahrenFragment());
        ItemStack Drop6 = new ItemStack(SpecialResources.SciFiFragment());
        ItemStack Drop7 = new ItemStack(SpecialResources.KlebrigFragment());
        ItemStack Drop8 = new ItemStack(SpecialResources.ExplosivPuder());
        legendaryDrops.add(Drop5);
        legendaryDrops.add(Drop6);
        legendaryDrops.add(Drop7);
        legendaryDrops.add(Drop8);
        legendaryDrops.add(new ItemStack(Material.APPLE, 3));
        legendaryDrops.add(new ItemStack(Material.COBWEB, 6));
        legendaryDrops.add(new ItemStack(Material.BOOK, 5));

        ItemStack Drop9 = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EnchantMeta = (EnchantmentStorageMeta) Drop9.getItemMeta();
        EnchantMeta.addStoredEnchant(EnchantmentBuilder.RandomEnchant(), 3, false);
        Drop9.setItemMeta(EnchantMeta);
        legendaryDrops.add(Drop9);

        ItemStack Drop10 = new ItemStack(Material.POTION);
        PotionMeta potionMeta = (PotionMeta) Drop10.getItemMeta();
        potionMeta.setDisplayName("§bSpeed");
        potionMeta.setColor(Color.AQUA);
        PotionEffect potionEffect = new PotionEffect(PotionEffectType.SPEED, 3600, 1);
        potionMeta.addCustomEffect(potionEffect, true);
        Drop10.setItemMeta(potionMeta);
        legendaryDrops.add(Drop10);

        legendaryDrops.add(new ItemStack(Material.DIAMOND, 2));

        return new ItemStack(legendaryDrops.get(new Random().nextInt(legendaryDrops.size())));
    }

    public static ItemStack mythicDrop(){

        ArrayList<ItemStack> mythicDrops = new ArrayList<>();
        ItemStack Drop1 = new ItemStack(Material.EXPERIENCE_BOTTLE, 32);
        mythicDrops.add(Drop1);
        ItemStack Drop2 = new ItemStack(Material.TNT, 6);
        mythicDrops.add(Drop2);
        ItemStack Drop3 = new ItemStack(Material.ENDER_PEARL, 4);
        mythicDrops.add(Drop3);
        ItemStack Drop4 = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 3);
        mythicDrops.add(Drop4);
        ItemStack Drop5 = new ItemStack(SpecialResources.ErfahrenFragment().getType(), 3);
        ItemStack Drop6 = new ItemStack(SpecialResources.SciFiFragment().getType(), 3);
        ItemStack Drop7 = new ItemStack(SpecialResources.KlebrigFragment().getType(), 3);
        ItemStack Drop8 = new ItemStack(SpecialResources.ExplosivPuder().getType(), 3);
        mythicDrops.add(Drop5);
        mythicDrops.add(Drop6);
        mythicDrops.add(Drop7);
        mythicDrops.add(Drop8);
        ItemStack Drop9 = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta EnchantMeta = (EnchantmentStorageMeta) Drop9.getItemMeta();
        EnchantMeta.addStoredEnchant(EnchantmentBuilder.RandomMythicEnchant(), 5, false);
        Drop9.setItemMeta(EnchantMeta);
        mythicDrops.add(Drop9);
        ItemStack Drop10 = new ItemStack(Material.POTION);
        PotionMeta potionMeta = (PotionMeta) Drop10.getItemMeta();
        potionMeta.setDisplayName("§5Stärke");
        potionMeta.setColor(Color.PURPLE);
        PotionEffect potionEffect = new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 2400, 1);
        potionMeta.addCustomEffect(potionEffect, true);
        Drop10.setItemMeta(potionMeta);
        mythicDrops.add(Drop10);
        ItemStack Drop11 = new ItemStack(Material.COBWEB, 12);
        mythicDrops.add(Drop11);
        ItemStack Drop12 = new ItemStack(Material.GRAY_CANDLE);

        return new ItemStack(mythicDrops.get(new Random().nextInt(mythicDrops.size())));
    }
}

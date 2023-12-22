package plugin.utils.ItemBuilder;

import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;
import plugin.Main;

import java.util.ArrayList;

public class Vampirisch {

    public static ItemStack ComboHoe(Player player){
        ItemStack stack = new ItemStack(Material.IRON_HOE);
        ItemMeta meta = stack.getItemMeta();
        if(player.getName().endsWith("s")) {
            meta.displayName(MiniMessage.miniMessage().deserialize("<i:false><#ffffff><obf>aa</obf> <bold><gradient:#824622:#b5185c>" + player.getName() + "'</gradient><#b5185c> Vampirsense</bold> <#ffffff><obf>aa"));
        }else{
            meta.displayName(MiniMessage.miniMessage().deserialize("<i:false><#ffffff><obf>aa</obf> <bold><gradient:#824622:#b5185c>" + player.getName() + "'s</gradient><#b5185c> Vampirsense</bold> <#ffffff><obf>aa"));
        }
        meta.getPersistentDataContainer().set(new NamespacedKey(Main.getInstance(), "Combohoe"), PersistentDataType.INTEGER, 1);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setUnbreakable(true);
        meta.addEnchant(Enchantment.MENDING, 1, true);
        ArrayList<String> list = new ArrayList<>();
        list.add("§x§8§2§4§6§2§2Vampirisch");
        list.add("");
        list.add("§8▸ §x§b§5§1§8§5§cSchlage deine Gegner zu Brei...");
        list.add("   §7· §fDiese Sense wurde geschmiedet");
        list.add("   §7  §fum deine Gegner zu combo'n und");
        list.add("   §7  §fdir dadurch Stärke zu verleihen");
        list.add("");
        list.add("   §7· §fMaximales Stärkelevel: §c7");
        meta.setLore(list);
        stack.setItemMeta(meta);
        return stack;
    }

    public static ItemStack EssenceBow(Player player){
        ItemStack stack = new ItemStack(Material.BOW);
        ItemMeta meta = stack.getItemMeta();
        if(player.getName().endsWith("s")) {
            meta.displayName(MiniMessage.miniMessage().deserialize("<i:false><#ffffff><obf>aa</obf> <bold><gradient:#824622:#b5185c>" + player.getName() + "'</gradient><#b5185c> Essenzbogen</bold> <#ffffff><obf>aa"));
        }else{
            meta.displayName(MiniMessage.miniMessage().deserialize("<i:false><#ffffff><obf>aa</obf> <bold><gradient:#824622:#b5185c>" + player.getName() + "'s</gradient><#b5185c> Essenzbogen</bold> <#ffffff><obf>aa"));
        }
        meta.getPersistentDataContainer().set(new NamespacedKey(Main.getInstance(), "EssenceBow"), PersistentDataType.INTEGER, 1);
        meta.addEnchant(Enchantment.MENDING, 1, true);
        meta.addEnchant(Enchantment.ARROW_DAMAGE, 6, true);
        meta.addEnchant(Enchantment.DURABILITY, 4, true);
        ArrayList<String> list = new ArrayList<>();
        list.add("§x§8§2§4§6§2§2Vampirisch");
        list.add("");
        list.add("§8▸ §x§b§5§1§8§5§cEnziehe deinen Gegnern das Blut...");
        list.add("   §7· §fDieser Bogen wurde geschaffen um ");
        list.add("   §7  §fdeinen Gegnern für jeden Treffer XP");
        list.add("   §7  §fzu entziehen. Es dauert lange ihn");
        list.add("   §7  §fnachzuladen...");
        list.add("");
        list.add("   §7· §fEntzogene XP pro Treffer: §a3");
        list.add("   §7· §fCooldown zum nächsten Schuss: §c5sek.");
        meta.setLore(list);
        stack.setItemMeta(meta);
        return stack;
    }
}

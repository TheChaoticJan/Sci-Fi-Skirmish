package plugin.utils.essentials;

import org.bukkit.Material;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Objects;

public class Count {

    public static ArrayList<Integer> countValues(Player p){

        ArrayList<Integer> count = new ArrayList<>();
        int xp = 0;
        int pearls = 0;
        int webs = 0;
        int tnt = 0;
        for(int m = 0; m <= 35; m++){
            if(p.getInventory().getItem(m) != null){
                if(Objects.requireNonNull(p.getInventory().getItem(m)).getType().equals(Material.EXPERIENCE_BOTTLE)){
                    xp = xp + Objects.requireNonNull(p.getInventory().getItem(m)).getAmount();
                }
                if(Objects.requireNonNull(p.getInventory().getItem(m)).getType().equals(Material.ENDER_PEARL)){
                    pearls = pearls + Objects.requireNonNull(p.getInventory().getItem(m)).getAmount();
                }
                if(Objects.requireNonNull(p.getInventory().getItem(m)).getType().equals(Material.TNT)){
                    tnt = tnt + Objects.requireNonNull(p.getInventory().getItem(m)).getAmount();
                }
                if(Objects.requireNonNull(p.getInventory().getItem(m)).getType().equals(Material.COBWEB)){
                    webs = webs + Objects.requireNonNull(p.getInventory().getItem(m)).getAmount();
                }
            }
        }

        int HelmetDura = 0;
        int BootsDura = 0;
        int ChestDura = 0;
        int LeggingsDura = 0;
        if(!(p.getInventory().getHelmet() == null)){
            HelmetDura = p.getInventory().getHelmet().getType().getMaxDurability() - p.getInventory().getHelmet().getDurability();
            if(HelmetDura == p.getInventory().getHelmet().getType().getMaxDurability()){
                HelmetDura = 10000;
            }
        }

        if(!(p.getInventory().getBoots() == null)){
            BootsDura = p.getInventory().getBoots().getType().getMaxDurability() - p.getInventory().getBoots().getDurability();
            if(BootsDura == p.getInventory().getBoots().getType().getMaxDurability()){
                BootsDura = 10000;
            }
        }

        if(!(p.getInventory().getChestplate() == null)){
            ChestDura = p.getInventory().getChestplate().getType().getMaxDurability() - p.getInventory().getChestplate().getDurability();
            if(ChestDura == p.getInventory().getChestplate().getType().getMaxDurability()){
                ChestDura = 10000;
            }
        }

        if(!(p.getInventory().getLeggings() == null)){
            LeggingsDura = p.getInventory().getLeggings().getType().getMaxDurability() - p.getInventory().getLeggings().getDurability();
            if(LeggingsDura == p.getInventory().getLeggings().getType().getMaxDurability()){
                LeggingsDura = 10000;
            }
        }

        int mainHandDura;
        if(p.getItemInHand().getType().equals(Material.AIR)){
            mainHandDura = 0;
        }else{
            mainHandDura = p.getInventory().getItemInMainHand().getType().getMaxDurability() - p.getInventory().getItemInMainHand().getDurability();
        }

        count.add(xp);
        count.add(pearls);
        count.add(webs);
        count.add(tnt);
        count.add(HelmetDura);
        count.add(ChestDura);
        count.add(LeggingsDura);
        count.add(BootsDura);
        count.add(mainHandDura);
        return count;
    }
}

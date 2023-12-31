package plugin.commands.ModerationsCommands;

import plugin.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.List;

public class VanishCommand implements CommandExecutor, TabCompleter {

    Main plugin;
    public VanishCommand(Main plugin) {
        this.plugin = plugin;
    }

        @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

                if(sender instanceof Player p){
            if(plugin.VanishList.contains(p.getUniqueId())){
                for(Player people : Bukkit.getOnlinePlayers()){
                    people.showPlayer(plugin, p);
                }
                p.setInvulnerable(false);
                p.setAllowFlight(false);
                plugin.VanishList.remove(p.getUniqueId());
                p.sendActionBar("§7Vanish §8» §cDeaktiviert");
                p.setPlayerListName(p.getDisplayName());
                p.setCustomNameVisible(true);
            }else{
                for(Player people : Bukkit.getOnlinePlayers()){
                    if(!people.isOp()){
                        people.hidePlayer(plugin, p);
                    }
                }
                p.setInvulnerable(true);
                p.setAllowFlight(true);
                plugin.VanishList.add(p.getUniqueId());
                p.sendActionBar("§7Vanish §8» §aAktiviert");
                p.setPlayerListName(" §x§7§0§3§4§E§6§lM§x§7§9§3§B§E§7§lo§x§8§2§4§3§E§8§ld§x§8§B§4§A§E§8§le§x§9§4§5§1§E§9§lr§x§9§C§5§8§E§A§la§x§A§5§6§0§E§B§lt§x§A§E§6§7§E§B§lo§x§B§7§6§E§E§C§lr §8| §7"+p.getPlayerListName() + " §5§lV");
                p.setCustomNameVisible(true);
            }

        }


        return true;
    }

    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        return Collections.singletonList("");
    }
}

package plugin.commands.DatabaseUsing;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import plugin.Main;
import plugin.models.PlayerStats;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class CrateStatsCommand implements CommandExecutor, TabCompleter{

    Main plugin;

    public CrateStatsCommand(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        if(commandSender instanceof Player p){

            try {
               PlayerStats stats = this.plugin.getDatabase().findPlayerStatsByUUID(p.getUniqueId().toString());

                if (stats == null) {

                    stats = new PlayerStats(p.getUniqueId().toString(), p.getName(), "", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "", false, false, false, false, false, false, 1, 2, 3);

                    this.plugin.getDatabase().createPlayerStats(stats);

                }
                //Gathering Cratestats
                int c = stats.getCommon_crates();
                int u = stats.getUncommon_crates();
                int e = stats.getEpic_crates();
                int r = stats.getRare_crates();
                int m = stats.getMythic_crates();

                int all = c + u + e + r + m;

                p.sendMessage("\n§f" + "§3  Deine Cratestats:  " +
                        "\n§7Insgesamt geöffnet: §b" + all +
                        "\n§f" +
                        "\n§x§0§0§B§9§3§AG§x§0§4§B§0§3§4e§x§0§8§A§7§2§Ew§x§0§C§9§E§2§9ö§x§1§0§9§5§2§3h§x§1§4§8§D§1§Dn§x§1§8§8§4§1§7l§x§1§C§7§B§1§2i§x§2§0§7§2§0§Cc§x§2§4§6§9§0§6h§7: §2" + c  +" §7[ca. §a" + c * 100 / all + "%§7]" +
                        "\n§x§0§0§8§D§D§FS§x§0§1§7§F§C§7e§x§0§2§7§0§B§0l§x§0§4§6§2§9§8t§x§0§5§5§3§8§1e§x§0§6§4§5§6§9n§7: §1" + u + " §7[ca. §9" + u * 100 /all + "%§7]" +
                        "\n§x§7§8§0§0§D§FE§x§7§3§0§1§C§7p§x§6§E§0§2§B§0i§x§6§A§0§4§9§8s§x§6§5§0§5§8§1c§x§6§0§0§6§6§9h§7: §5" + e + " §7[ca. §d" + e * 100 /all + "%§7]" +
                        "\n§x§D§3§D§F§0§0L§x§D§7§D§2§0§1e§x§D§B§C§4§0§3g§x§D§F§B§7§0§4e§x§E§2§A§9§0§5n§x§E§6§9§C§0§6d§x§E§A§8§E§0§8ä§x§E§E§8§1§0§9r§7: §6" + r + " §7[ca. §e" + r * 100 /all + "%§7]" +
                        "\n§x§0§0§D§F§C§DM§x§0§1§D§1§B§By§x§0§3§C§4§A§9t§x§0§4§B§6§9§7h§x§0§6§A§9§8§6i§x§0§7§9§B§7§4s§x§0§9§8§E§6§2c§x§0§A§8§0§5§0h§7: §3" + m + " §7[ca. §b" + m * 100 /all + "%§7]" + "\n§f");

            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        return true;
    }

    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if(strings.length == 1) {
            return null;
        }
        return Collections.singletonList("");
    }
}

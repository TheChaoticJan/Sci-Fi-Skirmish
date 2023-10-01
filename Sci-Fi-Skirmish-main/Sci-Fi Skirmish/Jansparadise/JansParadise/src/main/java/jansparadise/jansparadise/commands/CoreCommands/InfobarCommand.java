package jansparadise.jansparadise.commands.CoreCommands;

import jansparadise.jansparadise.JansParadise;
import jansparadise.jansparadise.models.PlayerStats;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.sql.SQLException;
import java.util.List;

public class InfobarCommand implements CommandExecutor, TabCompleter {

    public InfobarCommand(JansParadise plugin) {
        this.plugin = plugin;
    }

    JansParadise plugin;

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        if(commandSender instanceof Player p){

            try{

                PlayerStats stats = this.plugin.getDatabase().findPlayerStatsByUUID(p.getUniqueId().toString());

                if(stats == null){

                    stats = new PlayerStats(p.getUniqueId().toString(), p.getName(), "", 0, 0, 0,0, 0, 0, 0, 0, 0, 0, "", false, false, false, false, false, 1, 2, 3);

                    this.plugin.getDatabase().createPlayerStats(stats);

                }

                if(!stats.getPerk5()){
                    p.sendMessage("\n§cDu musst erst das Perk §7'Spionagemeister' §ckaufen, um die Infobar bearbeiten zu können!\n§f");
                    return true;
                }else{

                    Inventory Configuration = Bukkit.createInventory(p, 54, "§6§lConfiguriere deine Infobar!");
                    p.openInventory(Configuration);

                }

            }catch (SQLException e){
                e.printStackTrace();
            }

        }

        return true;
    }

    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        return null;
    }
}
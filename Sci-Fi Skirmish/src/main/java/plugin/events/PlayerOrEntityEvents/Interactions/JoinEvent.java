package plugin.events.PlayerOrEntityEvents.Interactions;

import org.bukkit.Bukkit;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import plugin.cratesystem.CrateEntities.Crates;
import plugin.Main;
import plugin.models.PlayerStats;
import plugin.utils.Scores.ScoreBoardBuilder;

import java.sql.SQLException;
import java.util.Objects;

import static org.bukkit.Bukkit.getServer;


public class JoinEvent implements Listener {

    Main plugin;

    public JoinEvent(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void joinEvent(PlayerJoinEvent event){

        Player p = event.getPlayer();

        event.setJoinMessage(null);

        for (int i = 0; i < plugin.VanishList.size(); i++) {
            if (!p.isOp()) {

                p.hidePlayer(plugin, Objects.requireNonNull(Bukkit.getPlayer(plugin.VanishList.get(i))));
            }
        }
        if(plugin.VanishList.contains(p.getUniqueId())){
            p.setDisplayName("§x§7§0§3§4§E§6§lM§x§7§9§3§B§E§7§lo§x§8§2§4§3§E§8§ld§x§8§B§4§A§E§8§le§x§9§4§5§1§E§9§lr§x§9§C§5§8§E§A§la§x§A§5§6§0§E§B§lt§x§A§E§6§7§E§B§lo§x§B§7§6§E§E§C§lr §8| §7"+p.getPlayerListName() + " §5§lV");
        }

        if(Bukkit.getOnlinePlayers().size() == 1){

            getServer().getWorlds()
                    .forEach(world -> world.getEntitiesByClass(ArmorStand.class).stream()
                            .filter(entity -> (Objects.equals(entity.getCustomName(), "§x§F§F§E§2§5§9N§x§F§F§D§E§5§8a§x§F§F§D§A§5§8c§x§F§F§D§5§5§7h§x§F§F§D§1§5§7s§x§F§F§C§D§5§6c§x§F§F§C§9§5§6h§x§F§F§C§5§5§5u§x§F§F§C§0§5§4b§x§F§F§B§C§5§4s§x§F§F§B§8§5§3k§x§F§F§B§4§5§3i§x§F§F§A§F§5§2s§x§F§F§A§B§5§2t§x§F§F§A§7§5§1e §8» §7???")))
                            .forEach(Crates::startRotation)
                    );

        }

            try{
                PlayerStats stats = this.plugin.getDatabase().findPlayerStatsByUUID(p.getUniqueId().toString());

                if(stats == null){

                    stats = new PlayerStats(p.getUniqueId().toString(), p.getName(), "Spieler", 0, 0, 0,0, 0, 0, 0, 0, 0, 0, "", false, false, false, false, false, false, 1, 2, 3);

                    this.plugin.getDatabase().createPlayerStats(stats);



                }

                p.setScoreboard(ScoreBoardBuilder.Scoreboard(stats, p));
                Main.getInstance().getTablistManager().setTablist(p);
                Main.getInstance().getTablistManager().setAllPlayerTeams();

            }catch (SQLException e){
                e.printStackTrace();
            }


        }
    }



package plugin.events.PlayerOrEntityEvents.Interactions;

import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import plugin.Main;
import plugin.models.PlayerStats;
import plugin.utils.CombatLogger;
import plugin.utils.Text.Texts;

import java.sql.SQLException;
import java.util.ArrayList;

public class ChatEvent implements Listener{

    @EventHandler
    public void onCommandEvent(PlayerCommandPreprocessEvent event){
        Player player = event.getPlayer();

        if(CombatLogger.isInCombat(player)){
            event.setCancelled(true);
            player.sendActionBar("§c§lDu kannst keine Befehle ausführen, während du im Kampf bist!");
            player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_NO, 20 ,1);
        }
    }

    @EventHandler
    public void onChatEvent (PlayerChatEvent event){
        ArrayList<String> Boeslist = new ArrayList<>();
        Boeslist.add("hs");
        Boeslist.add("hurensohn");
        
        for (String s : Boeslist) {
            if (event.getMessage().toLowerCase().contains(s)) {
                Player p = event.getPlayer();
                event.setCancelled(true);
                p.sendMessage("§cDeine Nachricht wurde nicht abgesendet, da sie gegen unsere Regeln verstößt!");
                return;
            }
        }
        event.setMessage(Texts.stringToMiniMessage(event.getMessage()));

        if(event.getMessage().startsWith("7")){
            Player p = event.getPlayer();
            event.setCancelled(true);
            p.sendMessage("§cDeine Nachricht wurde nicht abgesendet! \n§7Wolltest du nicht: §e" + event.getMessage().replace("7", "/") + " §7schreiben?");
            return;
        }

        try {

            Player player = event.getPlayer();

            PlayerStats stats = Main.getInstance().getDatabase().findPlayerStatsByUUID(event.getPlayer().getUniqueId().toString());

            if(stats == null){
                stats = new PlayerStats(player.getUniqueId().toString(), player.getName(), "Spieler", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "", false, false, false, false, false, false, 1, 2, 3);
                Main.getInstance().getDatabase().createPlayerStats(stats);
            }

            event.setCancelled(true);
            switch (stats.getRank()) {
                default ->
                        Bukkit.broadcast(MiniMessage.miniMessage().deserialize("<gradient:#FFE259:#FFA751>" + event.getPlayer().getName() + " <gray>▸ <white>" + event.getMessage()));
                case "Moderator" ->
                        Bukkit.broadcast(MiniMessage.miniMessage().deserialize("<gradient:#7034E6:#b76eec>" + event.getPlayer().getName() + " <gray>▸ <white>" + event.getMessage()));
                case "Admin" ->
                        Bukkit.broadcast(MiniMessage.miniMessage().deserialize("<gradient:#FF0000:#ad0d34>" + event.getPlayer().getName() + " <gray>▸ <white>" + event.getMessage()));
            }

        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}

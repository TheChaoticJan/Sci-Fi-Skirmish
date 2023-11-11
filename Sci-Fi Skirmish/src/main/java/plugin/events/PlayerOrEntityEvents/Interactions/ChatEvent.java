package plugin.events.PlayerOrEntityEvents.Interactions;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import plugin.utils.CombatLogger;

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
        event.setMessage(event.getMessage().replace("&", "§"));

        if(event.getMessage().startsWith("7")){
            Player p = event.getPlayer();
            event.setCancelled(true);
            p.sendMessage("§cDeine Nachricht wurde nicht abgesendet! \n§7Wolltest du nicht: §e" + event.getMessage().replace("7", "/") + " §7schreiben?");
            return;
        }

        event.setCancelled(true);
        Bukkit.broadcast(Component.text("§f" + event.getPlayer().getName() + " §7▸ §f" + event.getMessage()));

    }
}

package jansparadise.jansparadise.events.ExplosionEvents;


import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ExplosionPrimeEvent;

public class ExplodePrimeEvent implements Listener{

    @EventHandler
    public void primeEvent(ExplosionPrimeEvent event){
        if(event.getEntity().getType() == EntityType.PRIMED_TNT){
            Entity tnt = (TNTPrimed) event.getEntity();
            event.setCancelled(true);
            tnt.getLocation().createExplosion(1);

            }
        }
    }
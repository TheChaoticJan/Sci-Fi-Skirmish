package plugin.commands.DatabaseUsing;

import plugin.Main;
import plugin.models.PlayerStats;
import plugin.utils.essentials.Count;
import plugin.utils.Scores.ScoreBoardBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class XPCommand implements CommandExecutor, TabCompleter {
    private final Main plugin;

    public XPCommand(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {

        if (sender instanceof Player p) {

            if (args.length == 0) {
                p.sendMessage("""
                        §cBitte verwende:\s
                        §f
                        §7Auszahlung: §e/xp auszahlen <Zahl>\s
                        §7Kontostand: §e/xp balance
                        §7Einzahlung: §e/xp einzahlen <Zahl>\s""");
            } else {

                try {
                    PlayerStats stats = this.plugin.getDatabase().findPlayerStatsByUUID(p.getUniqueId().toString());

                    if (stats == null) {

                        stats = new PlayerStats(p.getUniqueId().toString(), p.getName(), "", 0,   0, 0, 0, 0, 0, 0, 0, "", false, false, false, false, false, false, 1, 2, 3);

                        this.plugin.getDatabase().createPlayerStats(stats);
                    }

                    switch (args[0].toLowerCase()) {
                        case "auszahlen" -> {

                            if (args.length != 2) {
                                p.sendMessage("§cBitte benutze: §e/xp auszahlen <Zahl>");
                                return true;
                            }

                            int space = 0;

                            for (int i = 0; i <= 35; i++) {
                                if (p.getInventory().getItem(i) == null) {
                                    space = space + 64;
                                } else {
                                    if (Objects.requireNonNull(p.getInventory().getItem(i)).getType() == Material.EXPERIENCE_BOTTLE) {
                                        space = space + (64 - Objects.requireNonNull(p.getInventory().getItem(i)).getAmount());
                                    }
                                }
                            }

                            if (args[1].equals("max")) {
                                args[1] = String.valueOf(space);
                            }
                            int amount = Integer.parseInt(args[1]);

                            if (amount > stats.getXp()) {
                                p.sendMessage("§cTransaktion fehlgeschlagen §7<§c" + stats.getXp() + "§7/" + amount + ">");
                                p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 5, 1);
                            } else if (Integer.parseInt(args[1]) > space) {
                                p.sendMessage("§cDu hast nicht genug Platz im Inventar! §7(§c" + space + "§7/" + args[1] + ")");
                            } else {
                                int newxp = stats.getXp() - amount;
                                stats.setXp(newxp);
                                this.plugin.getDatabase().updatePlayerStats(stats);
                                p.getInventory().addItem(new ItemStack(Material.EXPERIENCE_BOTTLE, Integer.parseInt(args[1])));
                                p.sendMessage("§7Kontostand: §e" + stats.getXp() + "§6✧§7 <§c-" + amount + "§7>");
                                p.playSound(p.getLocation(), Sound.BLOCK_AMETHYST_BLOCK_BREAK, 5, 1);
                            }

                            p.setScoreboard(ScoreBoardBuilder.Scoreboard(stats, p));
                        }


                        case "balance" -> {
                            p.sendMessage("§7Kontostand: §e" + stats.getXp() + "§6✧");
                            p.playSound(p.getLocation(), Sound.BLOCK_AMETHYST_BLOCK_BREAK, 5, 1);
                            p.setScoreboard(ScoreBoardBuilder.Scoreboard(stats, p));
                        }

                        case "einzahlen" -> {
                            if (args.length != 2) {
                                p.sendMessage("§cBitte benutze: §e/xp einzahlen <Zahl>");
                                return true;
                            }

                            try {

                                int xp = new Count(p).getXp();
                                if (args[1].equals("max")) {
                                    args[1] = String.valueOf(xp);
                                }


                                int amount = Integer.parseInt(args[1]);

                                if (Integer.parseInt(args[1]) > xp) {
                                    p.sendMessage("§cTransaktion fehlgeschlagen §7<§c" + xp + "§7/" + amount + ">");
                                    p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 5, 1);
                                } else {
                                    int writeamount = amount;
                                    int newxp = stats.getXp() + amount;
                                    stats.setXp(newxp);
                                    this.plugin.getDatabase().updatePlayerStats(stats);
                                    for (int i = 0; i <= 35; i++) {
                                        if (p.getInventory().getItem(i) != null) {
                                            if (Objects.requireNonNull(p.getInventory().getItem(i)).getType() == Material.EXPERIENCE_BOTTLE) {
                                                if (amount > Objects.requireNonNull(p.getInventory().getItem(i)).getAmount()) {
                                                    amount = amount - Objects.requireNonNull(p.getInventory().getItem(i)).getAmount();
                                                    Objects.requireNonNull(p.getInventory().getItem(i)).setAmount(0);
                                                } else if (amount <= Objects.requireNonNull(p.getInventory().getItem(i)).getAmount()) {
                                                    Objects.requireNonNull(p.getInventory().getItem(i)).setAmount(Objects.requireNonNull(p.getInventory().getItem(i)).getAmount() - amount);
                                                    amount = 0;
                                                }
                                            }
                                        }
                                    }

                                    p.sendMessage("§7Kontostand: §e" + stats.getXp() + "§6✧ §7<§a+" + writeamount + "§7>");
                                    p.playSound(p.getLocation(), Sound.BLOCK_AMETHYST_BLOCK_BREAK, 5, 1);
                                }


                                p.setScoreboard(ScoreBoardBuilder.Scoreboard(stats, p));


                            } catch (NumberFormatException e) {
                                p.sendMessage("§c Dein 2. Argument muss eine §eZahl §csein!");
                            }

                        }

                        case "überweisen" -> {
                            String playername = args[1];
                            Player r = Bukkit.getPlayerExact(playername);
                            if (r == null) {
                                p.sendMessage("§cDer Spieler §7" + playername + " §cist nicht online!");
                                break;
                            } else if (r == p) {
                                p.sendMessage("§cDas ergibt keinen Sinn oder?");
                                p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 5, 1);
                                break;
                            }
                            PlayerStats stats1 = this.plugin.getDatabase().findPlayerStatsByUUID(r.getUniqueId().toString());

                            if (stats1 == null) {

                                stats1 = new PlayerStats(p.getUniqueId().toString(), r.getName(), "", 0,   0, 0, 0, 0, 0, 0, 0, "", false, false, false, false, false, false, 1, 2, 3);

                                this.plugin.getDatabase().createPlayerStats(stats1);

                            }

                            if (args.length != 3) {
                                p.sendMessage("§cBitte benutze: §e/xp überweisen <Spieler> <Betrag>");
                                break;
                            }
                            try {

                                int betrag = Integer.parseInt(args[2]);
                                if (betrag > stats.getXp()) {
                                    p.sendMessage("§cDu hast nicht genügend Xp auf dem Konto §7(§c" + stats.getXp() + "§7/" + betrag + ")");
                                    break;
                                }

                                stats.setXp(stats.getXp() - betrag);
                                stats1.setXp(stats1.getXp() + betrag);

                                this.plugin.getDatabase().updatePlayerStats(stats);
                                this.plugin.getDatabase().updatePlayerStats(stats1);

                                p.sendMessage("§7Kontostand: §e" + stats.getXp() + "§6✧ §7<§c-" + betrag + "§7 » " + r.getName() + ">");
                                p.playSound(p.getLocation(), Sound.BLOCK_AMETHYST_BLOCK_BREAK, 5, 1);
                                r.sendMessage("§7Kontostand: §e" + stats1.getXp() + "§6✧ §7<§a+" + betrag + "§7 » " + p.getName() + ">");
                                r.playSound(p.getLocation(), Sound.BLOCK_AMETHYST_BLOCK_BREAK, 5, 1);

                                p.setScoreboard(ScoreBoardBuilder.Scoreboard(stats, p));
                                r.setScoreboard(ScoreBoardBuilder.Scoreboard(stats1, r));

                            } catch (NumberFormatException e) {
                                p.sendMessage("§cBitte benutze: §e/xp überweisen <Spieler> <Betrag>");
                            }


                        }
                        default -> p.sendMessage("""
                                §cBitte verwende:\s
                                §f
                                §7Auszahlung: §e/xp auszahlen <Zahl>\s
                                §7Kontostand: §e/xp balance
                                §7Einzahlung: §e/xp einzahlen <Zahl>\s""");
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return true;
    }

    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        if(strings.length == 1) {
            ArrayList<String> subcommands = new ArrayList<>();

            subcommands.add("einzahlen");
            subcommands.add("balance");
            subcommands.add("auszahlen");
            subcommands.add("überweisen");

            return subcommands;
        }
        if(strings.length == 2){
                return Collections.singletonList("max");
        }
        return Collections.singletonList("");
    }
}


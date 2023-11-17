package plugin.utils.Text;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.jetbrains.annotations.NotNull;

public class Texts {

    public static String stringToMiniMessage(String s){
        return s.replace("&f", "<white>").replace("&d", "<light_purple>").replace("&1", "<dark_blue>").replace("&2", "<dark_green>").replace("&3", "<dark_aqua>").replace("&4", "<dark_red>").replace("&5", "<dark_purple>").replace("&6", "<gold>").replace("&7", "<gray>").replace("&8", "<dark_gray>").replace("&9", "<blue>").replace("&a", "<green>").replace("&c", "<red>").replace("&e", "<yellow>").replace("&b", "<aqua>").replace("&0", "<black>").replace("&m", "<st>").replace("&n", "<u>").replace("&l", "<b>").replace("&r", "<reset>").replace("&o", "<i>");
    }

    public static Component setRankGradient(String s){

        switch (s) {
            default ->
            {
                return (Component.text("<gradient:#FFE259:#FFA751>"));
            }
            case "Moderator" ->
            {
                return (Component.text("<gradient:#7034E6:#b76eec>"));
            }
            case "Admin" ->
            {
                return (Component.text("<gradient:#AD0D34:#FF0000>"));
            }
        }
    }

    public static @NotNull Component common(String string){
        return MiniMessage.miniMessage().deserialize("<gradient:#00b93a:#246906>" + string + "</gradient>");
    }
}

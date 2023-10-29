package plugin.utils.Text;

import org.jetbrains.annotations.NotNull;

public class setColorGrading {

    public static @NotNull String common(String string){
        String component = "<gradient:#00b93a:#246906>" + string + "</gradient>";
        return component;
    }
}

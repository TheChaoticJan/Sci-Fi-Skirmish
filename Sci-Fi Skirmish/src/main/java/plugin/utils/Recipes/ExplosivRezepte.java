package plugin.utils.Recipes;

import plugin.Main;
import plugin.utils.ItemBuilder.ExplosivItems;
import plugin.utils.ItemBuilder.SpecialResources;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;


public class ExplosivRezepte {

    Main plugin;

    public ExplosivRezepte(Main plugin) {
        this.plugin = plugin;
    }

    public static ShapedRecipe Recipe1(){
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), "superpowder"), SpecialResources.ExplosivPuder());
        recipe.shape("XXX","XFX","XXX");
        recipe.setIngredient('X', Material.GUNPOWDER);
        recipe.setIngredient('F',Material.TNT);
        return recipe;
    }

    public static ShapedRecipe Recipe2(){
        ShapedRecipe recipe2 = new ShapedRecipe(new NamespacedKey(Main.getInstance(), "superkelp"), SpecialResources.ExplosivBarren());
        recipe2.shape("xxx", "xFx", "xxx");
        recipe2.setIngredient('x', SpecialResources.ExplosivBarren());
        recipe2.setIngredient('F', Material.TNT);
        return recipe2;
    }

    public static ShapedRecipe Recipe3(){
        ShapedRecipe recipe3 = new ShapedRecipe(new NamespacedKey(Main.getInstance(), "ExplosivAngel"), ExplosivItems.Angel());
        recipe3.shape("xxS", "xSF", "SxF");
        recipe3.setIngredient('x', Material.AIR);
        recipe3.setIngredient('F', SpecialResources.ExplosivBarren());
        recipe3.setIngredient('S', Material.STICK);
        return recipe3;
    }
    public static ShapedRecipe Recipe4(){
        ShapedRecipe recipe4 = new ShapedRecipe(new NamespacedKey(Main.getInstance(), "ExplivPicke"), ExplosivItems.Spitzhacke());
        recipe4.shape("FFF", "xSx", "xSx");
        recipe4.setIngredient('x', Material.AIR);
        recipe4.setIngredient('F', SpecialResources.ExplosivBarren());
        recipe4.setIngredient('S', Material.STICK);
        return recipe4;
    }


}
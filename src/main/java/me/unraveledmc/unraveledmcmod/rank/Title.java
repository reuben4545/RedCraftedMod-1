package me.unraveledmc.unraveledmcmod.rank;

import lombok.Getter;
import org.bukkit.ChatColor;

public enum Title implements Displayable
{

    PRESIDENT("a", "President of the United States", ChatColor.DARK_BLUE, "President"),
    MASTER_BUILDER("a", "Master Builder", ChatColor.DARK_AQUA, "Master-Builder"),
    DEVELOPER("a", "TotalFreedom Developer", ChatColor.DARK_PURPLE, "TF-Dev"),
    RCDEV("an", "RedCrafted Developer", ChatColor.DARK_PURPLE, "RC-Dev"),
    EXEC("an", "Executive Admin", ChatColor.DARK_BLUE, "Executive"),
    COOWNER("a", "Co-Owner", ChatColor.DARK_RED, "Co-Owner"),
    OWNER("an", "Owner", ChatColor.BLUE, "Owner");

    @Getter
    private final String determiner;
    @Getter
    private final String name;
    @Getter
    private final String tag;
    @Getter
    private final String coloredTag;
    @Getter
    private final ChatColor color;

    private Title(String determiner, String name, ChatColor color, String tag)
    {
        this.determiner = determiner;
        this.name = name;
        this.tag = "[" + tag + "]";
        this.coloredTag = ChatColor.DARK_GRAY + "[" + color + tag + ChatColor.DARK_GRAY + "]" + color;
        this.color = color;
    }

    @Override
    public String getColoredName()
    {
        return color + name;
    }

    @Override
    public String getColoredLoginMessage()
    {
        return determiner + " " + color + ChatColor.ITALIC + name;
    }
    
    @Override
    public String getDeterminer()
    {
        return determiner;
    }
    
    @Override
    public String getItalicColoredName()
    {
        return color.toString() + ChatColor.ITALIC + name;
    }

}

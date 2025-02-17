package org.steve.hockeyware.util.client;

import com.mojang.realmsclient.gui.ChatFormatting;
import org.steve.hockeyware.features.module.modules.HUD;

import java.awt.*;

public class ColorUtil {
    public static ChatFormatting nameColorFromSetting;
    public static ChatFormatting nameBracketFromSetting;
    int r;
    int g;
    int b;
    int a;


    public static float[] toRGBA(int hex) {
        // r, g, b, a
        return new float[]{(hex >> 16 & 0xff) / 255.0f, (hex >> 8 & 0xff) / 255.0f, (hex & 0xff) / 255.0f, (hex >> 24 & 0xff) / 255.0f};
    }

    public static int toHex(int r, int g, int b) {
        return 0xFF000000 | (r & 0xFF) << 16 | (g & 0xFF) << 8 | b & 0xFF;
    }

    public static Color releasedDynamicRainbow(int delay, float saturation, float brightness) {
        double rainbowState = Math.ceil((double) (System.currentTimeMillis() + (long) delay) / 20.0);
        return Color.getHSBColor((float) (rainbowState % 360.0 / 360.0), saturation / 255.0f, brightness / 255.0f);
    }

    public static ChatFormatting getNameColorFromSetting(HUD.NameColor setting) {
        if (setting.equals(HUD.NameColor.DarkRed)) {
            nameColorFromSetting = ChatFormatting.DARK_RED;
        }
        if (setting.equals(HUD.NameColor.Red)) {
            nameColorFromSetting = ChatFormatting.RED;
        }
        if (setting.equals(HUD.NameColor.Gold)) {
            nameColorFromSetting = ChatFormatting.GOLD;
        }
        if (setting.equals(HUD.NameColor.Yellow)) {
            nameColorFromSetting = ChatFormatting.YELLOW;
        }
        if (setting.equals(HUD.NameColor.DarkGreen)) {
            nameColorFromSetting = ChatFormatting.DARK_GREEN;
        }
        if (setting.equals(HUD.NameColor.Green)) {
            nameColorFromSetting = ChatFormatting.GREEN;
        }
        if (setting.equals(HUD.NameColor.Aqua)) {
            nameColorFromSetting = ChatFormatting.AQUA;
        }
        if (setting.equals(HUD.NameColor.DarkAqua)) {
            nameColorFromSetting = ChatFormatting.DARK_AQUA;
        }
        if (setting.equals(HUD.NameColor.DarkBlue)) {
            nameColorFromSetting = ChatFormatting.DARK_BLUE;
        }
        if (setting.equals(HUD.NameColor.Blue)) {
            nameColorFromSetting = ChatFormatting.BLUE;
        }
        if (setting.equals(HUD.NameColor.LightPurple)) {
            nameColorFromSetting = ChatFormatting.LIGHT_PURPLE;
        }
        if (setting.equals(HUD.NameColor.DarkPurple)) {
            nameColorFromSetting = ChatFormatting.DARK_PURPLE;
        }
        if (setting.equals(HUD.NameColor.White)) {
            nameColorFromSetting = ChatFormatting.WHITE;
        }
        if (setting.equals(HUD.NameColor.Gray)) {
            nameColorFromSetting = ChatFormatting.GRAY;
        }
        if (setting.equals(HUD.NameColor.DarkGray)) {
            nameColorFromSetting = ChatFormatting.DARK_GRAY;
        }
        if (setting.equals(HUD.NameColor.Black)) {
            nameColorFromSetting = ChatFormatting.BLACK;
        }
        return nameColorFromSetting;
    }

    public static ChatFormatting getBracketColorFromSetting(HUD.BracketColor setting) {
        if (setting.equals(HUD.BracketColor.DarkRed)) {
            nameBracketFromSetting = ChatFormatting.DARK_RED;
        }
        if (setting.equals(HUD.BracketColor.Red)) {
            nameBracketFromSetting = ChatFormatting.RED;
        }
        if (setting.equals(HUD.BracketColor.Gold)) {
            nameBracketFromSetting = ChatFormatting.GOLD;
        }
        if (setting.equals(HUD.BracketColor.Yellow)) {
            nameBracketFromSetting = ChatFormatting.YELLOW;
        }
        if (setting.equals(HUD.BracketColor.DarkGreen)) {
            nameBracketFromSetting = ChatFormatting.DARK_GREEN;
        }
        if (setting.equals(HUD.BracketColor.Green)) {
            nameBracketFromSetting = ChatFormatting.GREEN;
        }
        if (setting.equals(HUD.BracketColor.Aqua)) {
            nameBracketFromSetting = ChatFormatting.AQUA;
        }
        if (setting.equals(HUD.BracketColor.DarkAqua)) {
            nameBracketFromSetting = ChatFormatting.DARK_AQUA;
        }
        if (setting.equals(HUD.BracketColor.DarkBlue)) {

        }
        if (setting.equals(HUD.BracketColor.Blue)) {
            nameBracketFromSetting = ChatFormatting.BLUE;
        }
        if (setting.equals(HUD.BracketColor.LightPurple)) {
            nameBracketFromSetting = ChatFormatting.LIGHT_PURPLE;
        }
        if (setting.equals(HUD.BracketColor.DarkPurple)) {
            nameBracketFromSetting = ChatFormatting.DARK_PURPLE;
        }
        if (setting.equals(HUD.BracketColor.White)) {
            nameBracketFromSetting = ChatFormatting.WHITE;
        }
        if (setting.equals(HUD.BracketColor.Gray)) {
            nameBracketFromSetting = ChatFormatting.GRAY;
        }
        if (setting.equals(HUD.BracketColor.DarkGray)) {
            nameBracketFromSetting = ChatFormatting.DARK_GRAY;
        }
        if (setting.equals(HUD.BracketColor.Black)) {
            nameBracketFromSetting = ChatFormatting.BLACK;
        }
        return nameBracketFromSetting;
    }

}


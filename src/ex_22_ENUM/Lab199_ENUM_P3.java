package ex_22_ENUM;

import java.awt.*;

public class Lab199_ENUM_P3 {
    public static void main(String args[])
    {
        System.out.println(Colors.GREEN.getHexcode());
    }

}

enum Colors{
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    private String hexcode;

    Colors(String hexcode)
    {
        this.hexcode=hexcode;
    }

    String getHexcode()
    {
        return this.hexcode;
    }

}
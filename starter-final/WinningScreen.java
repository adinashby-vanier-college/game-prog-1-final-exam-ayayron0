// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class WinningScreen extends World
{

    /**
     * Constructor for objects of class WinningScreen.
     */
    public WinningScreen()
    {
        super(600, 400, 1);
        showTextWithGoodFont("Congratulations, You Win!", 180, 200);
    }

    /**
     * 
     */
    public void showTextWithGoodFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new Font(25);
        bg.setFont(font);
        bg.setColor(Color.GREEN);
        bg.drawString(message, x, y);
    }
}

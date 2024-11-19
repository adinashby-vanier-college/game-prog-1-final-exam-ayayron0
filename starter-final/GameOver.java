// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class GameOver.
     */
    public GameOver()
    {
        super(600, 400, 1);
        showTextWithGoodFont("Game Over!", 180, 200);
    }

    /**
     * Makes the font more appealing.
     */
    public void showTextWithGoodFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new Font(50);
        bg.setFont(font);
        bg.setColor(Color.RED);
        bg.drawString(message, x, y);
    }
}

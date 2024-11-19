// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Ladybug extends Actor
{

    /**
     * Act - do whatever the Hero wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movement();
        if (isGameWon()) {
            transitionToWinningScreen();
        }
        intersect();
    }

    /**
     * Lets the ladybug move and turn using WASD keys
     */
    public void movement()
    {
        if (Greenfoot.isKeyDown("w")) {
            move(4);
        }
        if (Greenfoot.isKeyDown("s")) {
            move(-4);
        }
        if (Greenfoot.isKeyDown("a")) {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("d")) {
            turn(3);
        }
    }

    /**
     * When ladybug reaches the Finish Location, game is won.
     */
    public boolean isGameWon()
    {
        World world = getWorld();
        if (world.getObjects(FinishLocation.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Transitions to Winning Screen and plays winning sound
     */
    public void transitionToWinningScreen()
    {
        World WinningScreen =  new WinningScreen();
        Greenfoot.setWorld(WinningScreen);
        Greenfoot.playSound("win.wav");
    }

    /**
     * When the ladybug intersects with the Finish Location, it will remove it causing the player to win the game.
     */
    public void intersect()
    {
        Actor finish = getOneIntersectingObject(FinishLocation.class);
        if (finish != null) {
            World world = getWorld();
            world.removeObject(finish);
        }
    }
}

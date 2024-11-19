// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class CannonBall extends Actor
{

    /**
     * Act - do whatever the CannonBall wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (isGameLost()) {
            transitionToGameOverWorld();
        }
        kill();
    }

    /**
     * When a cannon ball hits the ladybug, game is lost.
     */
    public boolean isGameLost()
    {
        World world = getWorld();
        if (world.getObjects(Ladybug.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Transitions to Game Over Screen with a losing sound.
     */
    public void transitionToGameOverWorld()
    {
        World GameOver =  new GameOver();
        Greenfoot.setWorld(GameOver);
        Greenfoot.playSound("lose.wav");
    }

    /**
     * If a cannonball collides with a ladybug, it kills it. 
     */
    public void kill()
    {
        Actor ladybug = getOneIntersectingObject(Ladybug.class);
        if (ladybug != null) {
            World world = getWorld();
            world.removeObject(ladybug);
        }
    }
}

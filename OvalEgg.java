import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OvalEgg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OvalEgg extends Egg
{public OvalEgg()
    {
        super();
        GreenfootImage o = getImage();
        int width= o.getWidth();
        int height= o.getHeight();
        o.scale(width*2, height*3);
    }
    /**
     * Act - do whatever the OvalEgg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}

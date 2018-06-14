import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JumboEgg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JumboEgg extends Egg
{
    public JumboEgg()
    {
        super();
        GreenfootImage g = getImage();
        int width= g.getWidth();
        int height= g.getHeight();
        g.scale(width*2, height*2);
    }
    /**
     * Act - do whatever the JumboEgg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}

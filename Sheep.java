import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sheep here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sheep extends Actor
{
    public boolean spaceDown;
    
    public Sheep()
    {
        spaceDown = false;
    }
    
    /**
     * Act - do whatever the Sheep wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
{
    if(Greenfoot.isKeyDown("left"))//
    {
           turn(-3);
           move(3);
    }    
    if (Greenfoot.isKeyDown("right"))
    {     
           turn(3);
           move(3);
    }
    if (Greenfoot.isKeyDown("space"))
    {
        if (spaceDown == false)
        {
        Egg e= new Egg();
        World w = getWorld();
        w.addObject(e, getX(), getY());
        spaceDown = true;
    }
    }
    else
    {
        spaceDown= false;
    }
    if (Greenfoot.isKeyDown("j"))
    {
        JumboEgg j= new JumboEgg();
        World w= getWorld();
        w.addObject(j, getX(), getY());
    }
    if (Greenfoot.isKeyDown("o"))
    {
        OvalEgg o= new OvalEgg();
        World w= getWorld();
        w.addObject(o, getX(), getY());
    }
}
}


import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DisappearingEgg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisappearingEgg extends Egg
{
    public int countdown;
    public DisappearingEgg(int count)
    {
        countdown=count;
    }
    /**
     * Act - do whatever the DisappearingEgg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      countdown--;
      if(countdown <= 0)
      {
          World w = getWorld();
          w.removeObject(this);
        }
    }    
}

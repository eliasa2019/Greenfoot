import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedCell here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedCell extends Actor
{
    private byte speed;
    private byte rotation;
    
    public RedCell() {
        speed = (byte)(Greenfoot.getRandomNumber(2) + 1);
        rotation = (byte)(Greenfoot.getRandomNumber(5));
    }
    
    /**
     * Act - do whatever the RedCell wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX() - speed, getY());
        turn(rotation);
        if (getX() == 0) 
            getWorld().removeObject(this);
    }    
}

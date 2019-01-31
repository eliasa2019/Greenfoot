import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/*
 * Virus Class
 * Elias Awad
 * 20 January 2019
 */
public class Virus extends Actor
{
    /*
     * AddedToWorld - Gives a new virus instance a random initial rotation.
     */
    public void addedToWorld() {
        setRotation(Greenfoot.getRandomNumber(360));
    }
    public void act() 
    {
        setLocation(getX() - 4, getY());
        if (getX() <= 0)
            getWorld().removeObject(this);
        turn(4);
    }    
}

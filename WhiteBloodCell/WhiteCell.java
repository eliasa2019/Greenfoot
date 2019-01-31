import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is a white blood cell. This kind of cell has the job to catch 
 * bacteria and remove them from the blood.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class WhiteCell extends Actor
{
    public void addedToWorld() {
        getWorld().showText("Score: " + Bloodstream.getScore(), 50, 50);
    }
    
    /**
     * Act: move up and down when cursor keys are pressed.
     */
    public void act() 
    {
        checkKeyPress();
        if(isTouching(Bacteria.class)) {
            Bloodstream.addScore(20);
            getWorld().showText("Score: " + Bloodstream.getScore(), 50, 50);
            removeTouching(Bacteria.class);
            Greenfoot.playSound("slurp.wav");
        }
        if(isTouching(Virus.class)) {
            Bloodstream.addScore(-100);
            getWorld().showText("Score: " + Bloodstream.getScore(), 50, 50);
            removeTouching(Virus.class);
            Greenfoot.playSound("game-over.wav");
        }
    }
    
    /**
     * Check whether a keyboard key has been pressed and react if it has.
     */
    private void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("up")) 
        {
            setLocation(getX(), getY()-4);
        }
        
        if (Greenfoot.isKeyDown("down")) 
        {
            setLocation(getX(), getY()+4);
        }
    }
}

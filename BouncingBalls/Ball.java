import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ball extends Actor
{
    private int angle, bounces;

    public Ball() {
        angle = Greenfoot.getRandomNumber(360);
        bounces = 0;
    }

    public void act() 
    {
        setRotation(angle);
        move(5);
        if (isAtEdge()) bounce(0); // Regular bounce
        // if (isAtEdge()) bounce(30); Regular bounce with between -30 and 30 degrees added
    }

    private void bounce(int range) {
        bounces++;
        if (getX() <= 0 || getX() >= getWorld().getWidth() - getImage().getWidth() - 1) angle = 180 - angle + Greenfoot.getRandomNumber(2 * range + 1) - range;
        else if (getY() <= 0 || getY() >= getWorld().getHeight() - getImage().getHeight() - 1) angle = 360 - angle + Greenfoot.getRandomNumber(2 * range + 1) - range;
    }
}

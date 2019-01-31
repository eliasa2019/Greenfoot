import greenfoot.*;

public class Lobster extends Actor {
    public void addedToWorld(World w) {
        while(isTouching(Crab.class))
            setLocation(Greenfoot.getRandomNumber(w.getWidth()),Greenfoot.getRandomNumber(w.getHeight()));
    }

    public void act() {
        tryToEat();
        move();
    }

    private void move() {
        if(Greenfoot.isKeyDown("up"))
            move(5);
        if(Greenfoot.isKeyDown("down"))
            move(-5);
        if(Greenfoot.isKeyDown("left"))
            turn(-5);
        if(Greenfoot.isKeyDown("right"))
            turn(5);
    }

    private void tryToEat() {
        if (isTouching(Crab.class))
            removeTouching(Crab.class);
    }
}

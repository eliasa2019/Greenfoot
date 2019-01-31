import greenfoot.*;

public class Crab extends Actor {
    private static GreenfootImage[] images = {new GreenfootImage("crab.png"), new GreenfootImage("crab2.png")};
    private int imageIndex = Greenfoot.getRandomNumber(images.length);
    
    public Crab() {
        setImage(images[imageIndex]);
    }
    
    /**
     * Added to World - instructions for Crab when placed in the world. This
     * method tests whether the Crab is touching a Worm at its randomly
     * defined position. If it is, it is relocated.
     */
    
    public void addedToWorld(World w) {
        while(isTouching(Worm.class) || isTouching(Crab.class))
            setLocation(Greenfoot.getRandomNumber(w.getWidth()),Greenfoot.getRandomNumber(w.getHeight()));
    }

    public void act() {
        edgeTest();
        tryToEat();
        randomTurn();
        move(5);
        cycleIndex(images,imageIndex);
        setImage(images[imageIndex]);
    }
    
    /**
     * CycleIndex - Increments index variable if it will not equal the maximum index of given array. Otherwise, sets it to zero.
     */
    private void cycleIndex(GreenfootImage[] a, int i) {
        i = (i < a.length) ? i++ : 0;
    }

    /**
     * EdgeTest - Turns Crab a random amount between 45 and 90 degrees when touching the edge.
     * This method is called in the Act method.
     */
    private void edgeTest() {
        if (isAtEdge())
            turn((Greenfoot.getRandomNumber(2) == 0) ? 0 - (45+ Greenfoot.getRandomNumber(45)) : Greenfoot.getRandomNumber(45) + 45);
    }

    /**
     * RandomTurn - 30% chance to turn Crab between -60 and 60 degrees.
     * This method is called in the Act method.
     */
    private void randomTurn() {
        if (Greenfoot.getRandomNumber(10) < 3)
            turn((Greenfoot.getRandomNumber(2) == 0) ? -Greenfoot.getRandomNumber(60) : Greenfoot.getRandomNumber(60));
    }

    /**
     * TryToEat - Deletes Worm if it is touching a Crab.
     * This method is called in the Act method.
     */
    private void tryToEat() {
        if (isTouching(Worm.class))
            removeTouching(Worm.class);
    }
}

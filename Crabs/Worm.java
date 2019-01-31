import greenfoot.*;

public class Worm extends Actor {
    public void addedToWorld(World w) {
        while(isTouching(Worm.class))
            setLocation(Greenfoot.getRandomNumber(w.getWidth()),Greenfoot.getRandomNumber(w.getHeight()));
    }    
}

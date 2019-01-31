import greenfoot.*;

public class CrabWorld extends World {
    public CrabWorld() {    
        super(560, 560, 1); 
        prepare();
    }

    private void prepare() {
        for (int i = 0; i < 10; i++)
            addObject(new Worm(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        for (int i = 0; i < 3; i++)
            addObject(new Crab(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        addObject(new Lobster(), getWidth() / 2, getHeight() / 2);
    }
}

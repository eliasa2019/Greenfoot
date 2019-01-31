import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The bloodstream is the setting for our White Blood Cell scenario. 
 * It's a place where blood cells, bacteria and viruses float around.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class Bloodstream extends World
{
    private static int score = 0;
    
    /**
     * Constructor: Set up the staring objects.
     */
    public Bloodstream()
    {    
        super(780, 360, 1); 
        score = 0;
        setPaintOrder(Border.class, Lining.class);
        prepare();
    }

    /**
     * Create new floating objects at irregular intervals.
     */
    public void act()
    {
        if (Greenfoot.getRandomNumber(100) < 3)
        {
            addObject(new Bacteria(), 779, Greenfoot.getRandomNumber(360));
        }
        if (Greenfoot.getRandomNumber(100) == 0 && getObjects(Virus.class).isEmpty())
            addObject(new Virus(), getWidth(), Greenfoot.getRandomNumber(getHeight()));
        if (getObjects(RedCell.class).size() < 15 && Greenfoot.getRandomNumber(100) < 10)
            addObject(new RedCell(), getWidth(), Greenfoot.getRandomNumber(getHeight()));
    }
    
    /**
     * Prepare the world for the start of the program. In this case: Create
     * a white blood cell and the lining at the edge of the blood stream.
     */
    private void prepare()
    {
        addObject(new Border(),0,180);
        addObject(new Border(),770,180);
        WhiteCell whitecell = new WhiteCell();
        addObject(whitecell, 83, 179);
        Lining lining = new Lining();
        addObject(lining, 126, 1);
        Lining lining2 = new Lining();
        addObject(lining2, 342, 5);
        Lining lining3 = new Lining();
        addObject(lining3, 589, 2);
        Lining lining4 = new Lining();
        addObject(lining4, 695, 5);
        Lining lining5 = new Lining();
        addObject(lining5, 114, 359);
        Lining lining6 = new Lining();
        Lining lining7 = new Lining();
        addObject(lining7, 295, 353);
        Lining lining8 = new Lining();
        Lining lining9 = new Lining();
        Lining lining10 = new Lining();
        addObject(lining10, 480, 358);
        Lining lining11 = new Lining();
        addObject(lining11, 596, 359);
        Lining lining12 = new Lining();
        addObject(lining12, 740, 354);
    }
    
    public static void addScore(int a) {
        score += a;
    }
    
    public static int getScore() {
        return score;
    }
}

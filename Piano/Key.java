import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    private String colour, key, note;
    private boolean isDown;
    
    public Key(String colour, String key, String note) {
        this.colour = colour;
        setImage(colour + "-key.png");
        isDown = false;
        this.key = key;
        this.note = note;
    }

    public void act()
    {
        if (!isDown && Greenfoot.isKeyDown(key)) {
            setImage(colour + "-key-down.png");
            Greenfoot.playSound(note);
            isDown = true;
        } else if (isDown && !Greenfoot.isKeyDown(key)) {
            setImage(colour + "-key.png");
            isDown = false;
        }
    }
}


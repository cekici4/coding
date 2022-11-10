import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is the transition between forest and entryHell, dante falls for some time
 */
public class Hole extends World
{
    int x;
    int danteX;
    int danteY;
    int z;
    World hell = new EntryHell();
    Actor dante = new Dante();
    public Hole()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024, 1024, 1, false);
        GreenfootImage img = new GreenfootImage(1024,1024);//Create Greenfoot image
        img.setColor(Color.BLACK);//Add Background Color
        img.fillRect(0,0,1024,1024);
        setBackground(img);
    }
    public void act()
    {
        danteFall();
    }
    public void danteFall()
    {
        addObject(dante, 500,1030);
        
        
            if(dante.getY() > 1024 && z != 120)
            {
                dante.setLocation(500, 1);
                z++;
            }
            else if(z == 120){
                Greenfoot.setWorld(hell);
            }
        
    }
    
}

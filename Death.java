import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * this class is the death screen, if called shows a death screen, with try again option
 */
public class Death extends World
{

    /**
     * Constructor for objects of class Death.
     * 
     */
    int x;
    int y;
    public Death()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024, 1024, 1, false); 
        setBackground("/background/death.png");   
    }
    
    public void act()
    { 
        checkMouseL();
        changeTo();
    }
    
    public void checkMouseL()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse != null) 
        {   x = mouse.getX(); 
            y = mouse.getY();
        }
    }
     public void changeTo()
    {
    
        if(Greenfoot.mouseClicked(null))
        {
            int minXNewGame = 100; 
            int maxXNewGame = 200;
            int minYNewGame = 700;
            int maxYNewGame= 1024;
            if (x > minXNewGame && x < maxXNewGame && y > minYNewGame && y < maxYNewGame)
            {
                Forest forest = new Forest();
                Greenfoot.setWorld(forest);
            }       
        }
    }
}

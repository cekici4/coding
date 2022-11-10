import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is for choosing a level
 * Checks mouse info and does accordingly
 */
public class Levels extends World
{
    private GreenfootImage T1;
    int x;
    int y;
    int minXNewGame;
    int maxXNewGame;
    int minYNewGame;
    int maxYNewGame;

    public Levels()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(1024, 1024, 1, false); 
        T1 = new GreenfootImage("/background/dark_castle.png");
        setBackground(T1);
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
            int maxXNewGame = 350;
            int minYNewGame = 100;
            int maxYNewGame= 400;
            if (x > minXNewGame && x < maxXNewGame && y > minYNewGame && y < maxYNewGame)
            {
                World forest = new Forest();
                Greenfoot.setWorld(forest);
            }           
        }
        if(Greenfoot.mouseClicked(null))
        {
            int minXNewGame = 450; 
            int maxXNewGame = 700;
            int minYNewGame = 100;
            int maxYNewGame= 400;
            if (x > minXNewGame && x < maxXNewGame && y > minYNewGame && y < maxYNewGame)
            {
                World acheron = new Acheron();
                Greenfoot.setWorld(acheron);
            } 
        
        }

        if(Greenfoot.mouseClicked(null))
        {
            int minXNewGame = 100; 
            int maxXNewGame = 200;
            int minYNewGame = 700;
            int maxYNewGame= 1024;
            if (x > minXNewGame && x < maxXNewGame && y > minYNewGame && y < maxYNewGame)
            {
                Menu menu = new Menu();
                Greenfoot.setWorld(menu);
            }       
        }
    }
}   

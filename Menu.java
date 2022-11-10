import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
/**
 * Write a description of class MyWorld here.
 * 
 * @author Cagri Ekici 
 * @version 0.1
 * 
 * This game is about Dante and his adventure trying to escape hell 
 * through descending it and coming out on the other side of the eart.
 * 
 * Features:
 * - Basic movement and attack options
 * - Health system
 * - Mana system
 * - Enemy system
 * - Boss system
 * - NPC system
 * - Very cool art
 * 
 * Implemented:
 * - World continues, Dante can go back and forth 
 * - Dante can move
 * - Dante can shoot
 * - Mana regenerates
 * - World has test ending
 * - World has death screen and retry
 * - World has level chose options
 * - Forest beast work
 * - Virgil implementation, talk screen
 * - Dante can interact with world
 * 
 * Not done: 
 * - basic enemies attacking
 * - quest system
 * - story lines
 * 
 * Needs work:
 * - mana bar
 * - health bar
 * - Dante turn
 * - Story text
 * - Lost souls
 **/
 
public class Menu extends World
{

    /**
     * This Class is the Menu
     * Checks for Mouse info and does accordingly
     * 
     */
    private GreenfootImage T1;
    
    World forest = new Forest();
    World levels = new Levels();
    
    int x;
    int y;
    int minXNewGame;
    int maxXNewGame;
    int minYNewGame;
    int maxYNewGame;
    
    public Menu()
    {    
        super(1024, 1024, 1, false); 
        T1 = new GreenfootImage("/background/dante_op_2.png");
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
            int minXNewGame = 800; 
            int maxXNewGame = 1000;
            int minYNewGame = 0;
            int maxYNewGame= 200;
            if (x > minXNewGame && x < maxXNewGame && y > minYNewGame && y < maxYNewGame)
            {
                Greenfoot.setWorld(forest);
            }           
        }
        if(Greenfoot.mouseClicked(null))
        {
            int minXNewGame = 700; 
            int maxXNewGame = 1000;
            int minYNewGame = 200;
            int maxYNewGame= 400;
            if (x > minXNewGame && x < maxXNewGame && y > minYNewGame && y < maxYNewGame)
            {
                Greenfoot.setWorld(levels);
            } 
        
        }
        if(Greenfoot.mouseClicked(null))
        {
            int minXNewGame = 700; 
            int maxXNewGame = 1000;
            int minYNewGame = 500;
            int maxYNewGame= 600;
            if (x > minXNewGame && x < maxXNewGame && y > minYNewGame && y < maxYNewGame)
            {
                World info = new Info();
                Greenfoot.setWorld(info);
            } 
        
        }
    }
}

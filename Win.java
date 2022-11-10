import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * test class for win, only reachable through easter egg ending
 */
public class Win extends World
{
    private GreenfootImage T1;
    public Win()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024, 1024, 1, false); 
        T1 = new GreenfootImage("/background/win_screen.png");
        setBackground(T1);
    }
}

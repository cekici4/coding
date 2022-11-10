import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Virgil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Virgil extends Actor
{
    /**
     * Act - do whatever the Virgil wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private GreenfootImage virgil = new GreenfootImage("virgil.png");
    
    public Virgil()
    {
        GreenfootImage image = getImage();
        image.scale(100, 210);
        setImage(image);
    }
    
    public void act()
    {
        // Add your action code here.
    }
   
}

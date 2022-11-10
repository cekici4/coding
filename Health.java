import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class health here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Health extends Actor
{
    /**
     * Act - do whatever the health wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage baseImg = new GreenfootImage("/UI/health_bar.png");
    
    public void act()
    {
        // Add your action code here.
        
    }
    public Health()
    {
        GreenfootImage image = getImage();
        image.scale(210, 70);
        setImage(image);
        
    }
    }

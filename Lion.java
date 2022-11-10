import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Class;
/**
 * Write a description of class Lion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lion extends Actor
{
    /**
     * Act - do whatever the Lion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * 
     */
    private GreenfootImage baseImg = new GreenfootImage("lion.png");
    int countBackground;
    int danteX;
    int danteY;
    
    public void act()
    {
        // Add your action code here.  
        catchDante();
        
    }
    public Lion() 
    {
        GreenfootImage image = getImage();
        image.scale(200,200);
        setImage(image);
    }
    
    public void catchDante()
    {
        Forest forest = (Forest) getWorld();
        int countBackground = forest.countBg;
        int danteX = forest.danteX;
        int danteY = forest.danteY;
              
        if(countBackground == 8)
          {
                move(-4);
                
          } 
          
          if(countBackground == 7)
          {
              if(danteX < 800)
              {
                 move(-4);
              }
              
          }
          
          if(countBackground == 6)
          {
              if(danteY < 700)
              {
                  setLocation(900,677);
                  move(-4);
              }  
          }
    }
    
}

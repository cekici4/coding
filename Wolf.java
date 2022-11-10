import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wolf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wolf extends Actor
{
    /**
     * Act - do whatever the Wolf wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage baseImg = new GreenfootImage("wolf.png");
    int countBackground;
    int danteX;
    int danteY;
    public void act()
    {
        // Add your action code here.
        catchDante();
    }
    
    public Wolf()
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
                move(-3);
            
          } 
          
          if(countBackground == 7)
          {
              if(danteX < 800)
              {
                 move(-3);
              }
              
          }
          
          if(countBackground == 6)
          {
              if(danteY < 700)
              {
                  setLocation(700,677);
                  move(-3);
              }  
          }
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Leopard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Leopard extends Actor
{
    /**
     * Act - do whatever the Leopard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage baseImg = new GreenfootImage("leopard.png");
    int countBackground;
    int danteX;
    int danteY;
    public void act()
    {
        // Add your action code here.
        catchDante();
    }
    public Leopard()
    {
        GreenfootImage image = getImage();
        image.scale(200,200);
        getImage().mirrorHorizontally();
        setImage(image);
    }
    public void catchDante()
    {
        Forest forest = (Forest) getWorld();
        int countBackground = forest.countBg;
        int danteX = forest.danteX;
        int danteY = forest.danteY;
        
        int danteHealt = forest.danteHealth;
        if (this.isTouching(Dante.class)){forest.danteHealth--;}
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
                  setLocation(950,677);
                  move(-4);
              }  
          }
    }
}

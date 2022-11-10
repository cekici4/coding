import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Class;


public class Forest extends World
{
    public int danteX;
    public int danteY;
    public boolean spawnBeast;
    public boolean danteNotinHole;
    
    public int countBg = 1;
    public int fallCounter;
    
    public int danteHealth;
    public int manaReserve = 4;
    
    long lastAdded = System.currentTimeMillis();
    
    Actor dante = new Dante();
    Actor ground = new Ground(1024,70);
    Actor health = new Health();
    Actor mana = new Mana();
    
    Actor lion = new Lion();
    Actor wolf = new Wolf();
    Actor leopard = new Leopard();
    
    World hole = new Hole();
    World win = new Win();
    World death = new Death();
    
    public Forest()
    {    
        // Create a new world with 1024x1024 cells with a cell size of 1x1 pixels.
        super(1024, 1024, 1, false); 
        setBackground("/background/trees_1.png"); 
        danteHealth = 4;
    }
    
    public void act()
    {
        addObject(dante, 77, 696);
        addObject(ground,514,850);
        addObject(health, 100, 100);
        addObject(mana, 101, 163);
        checkMana();
        checkBackground();
        cDante();
        spawnBeast();
        long curTime = System.currentTimeMillis();
        chechHealth();
    }
    // checks the countBg counter and does actions accordingly
    public void checkBackground()
    {   // whats needed for the bg to continue and dante to get back to start, should be a switch case, but yeah first try
        if (dante.getX() > 1024)  
        { 
            countBg++;
            // easter egg (test) ending, should not be possible
            if(countBg >= 9) {
                Greenfoot.setWorld(win);
                return;
            }
            //important for the ground to get removed
            if(countBg == 6) 
            {
                fallCounter++;
            }
            //trigger for the 3 beasts to spawn
            if(countBg == 8 & dante.getX() > 200) 
            {
                spawnBeast = true;
            } 
            setBackground("/background/trees_" + countBg + ".png");           
            dante.setLocation(77, 696);
        // when Dante trys to go back
        } else if (dante.getX() < 0) {
            countBg--;           
            if(countBg == 6) 
            {
                fallCounter--;
            }
            
            //when Dante trys to go back to many times Bg gets set to 1 and Dante to start          
            if(countBg < 1) 
            {
                countBg = 1; 
                dante.setLocation(77, 696);
            }
            
            //when that is not the case, change bg, set dante to right position
            else 
            {
                setBackground("/background/trees_" + countBg + ".png");
                dante.setLocation(750, 696);
                // behavior for the beast to catch Dante
                if(spawnBeast == true) 
                {
                    lion.setLocation(1024,696); 
                    lion.move(-2); 
                    wolf.setLocation(950,696); 
                    wolf.move(-3);
                    leopard.setLocation(900, 696); 
                    leopard.move(-4);
                }
            }
        // Removing ground and changing world trigger   
        }
        else if(fallCounter == 0 && spawnBeast == true && countBg == 6) 
        {
            lion.setLocation(1024,696);
            wolf.setLocation(950,696);
            leopard.setLocation(900,696);
            removeObject(ground);
            // changes worlds when Dante falls
            if (dante.getY() > 1024)
            { 
               Greenfoot.setWorld(hole);
            }                 
        }
    }
    
    public void spawnBeast()
    {   // spawns the beast
        if(spawnBeast == true)
        {
            addObject(lion, 800,677);
            addObject(wolf, 700, 688);
            addObject(leopard, 600, 690);     
        } 
    }
    // checks mana, should not be in world, should be in dante, but could not get it to work
     public void checkMana() 
    {
        if(getObjects(Projectile.class).size() > 0) 
        {
            manaReserve--;
        }
    }
    // gets coordinates of Dante
    public void cDante(){
        danteX = dante.getX(); 
        danteY = dante.getY();
    }     
    // checks health of Dante, should also be in dante
    public void chechHealth()
    {
        switch(danteHealth){
            case 4:
                break;
            case 3:
                break;
            case 2:
                break;
            case 1:
                break;
            case 0:
                Greenfoot.setWorld(death);
        }
    }
} 
    
          
    
    
        
    
   
    
    
    
    
    
        
     
        



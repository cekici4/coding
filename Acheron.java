import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * class for acheron world, does same as forest and entryHell
 */
public class Acheron extends World
{
    public int countBgAcheron = 0;
    public int mouseX;
    public int mouseY;
    public boolean checkHit;
    Actor dante = new Dante();
    Actor ground = new Ground(1024,70);
    Actor health = new Health();
    //Actor mana = new Mana();
    Actor lostSoul = new LostSoul();
    
    public Acheron()
    {    
        // Create a new world with 1024x1024 cells with a cell size of 1x1 pixels.
        super(1024, 1024, 1, false); 
        setBackground("/background/shores_of_acheron_" + countBgAcheron + ".png");  
    }
    public void act()
    {
        addObject(ground,514,1000);
        addObject(dante,77, 696);
        addObject(health, 100, 300);
        //addObject(mana, 101, 400);
        
        checkcountBgAcheron();
        checkMouseL();
        checkDante();
        changeBg();
    }
    
    public void checkcountBgAcheron()
    {
        if(countBgAcheron < 0) 
        {
            countBgAcheron = 0;
            dante.setLocation(77,696);
        } else if (countBgAcheron > 3)
        {
            countBgAcheron = 3;
            dante.setLocation(900,696);
        }
    }
    public void checkDante()
    {
        if(Dante.class != null){
            if (dante.getX() > 1024)
            {
                countBgAcheron++;
                changeBg();
                dante.setLocation(77,696);
            }     
            else if (dante.getX() < 0)
            {
                countBgAcheron--;
                changeBg();
                dante.setLocation(900,696);
            }
        }
    }
    public void changeBg()
    {
        switch(countBgAcheron)
        {
            case 0:
                setBackground("/background/shores_of_acheron_" + countBgAcheron + ".png");
                break;
                
            case 1:
                setBackground("/background/shores_of_acheron_" + countBgAcheron + ".png");
                break;
                
            case 2:
                setBackground("/background/shores_of_acheron_" + countBgAcheron + ".png"); 
                spawnLostSoul();
                break;
            case 3:
                setBackground("/background/shores_of_acheron_" + countBgAcheron + ".png"); 
                break;
            
        }
    }
    public void checkMouseL()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse != null) 
        {   mouseX = mouse.getX(); 
            mouseY = mouse.getY();
        }
    }
    public void spawnLostSoul()
    {
        addObject(lostSoul, 870, 870);
    }
    
    public void checkHit()
    {
        //if(lostSoul.isTouching(Projectile.class)){death = true;}
    }
}

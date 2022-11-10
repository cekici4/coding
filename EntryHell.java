import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is the world for entry hell, does the same as forest, but with a switch
 */
public class EntryHell extends World
{
    public int mouseX;
    public int mouseY;
    public int showPicture = 1;
    public int countBgHell = 0; 
    public boolean killPicture;
    
    Actor dante = new Dante();
    Actor ground = new Ground(1024,70);
    Actor health = new Health();
    //mana is not working right besides in forest, need to adjust some stuff there
    //Actor mana = new Mana();
    Actor virgil = new Virgil();
    Actor vtd = new VirgilTalkDante();
    World acheron = new Acheron();
    
    public EntryHell()
    {    
        // Create a new world with 1024x1024 cells with a cell size of 1x1 pixels.
        super(1024, 1024, 1, false); 
        setBackground("/background/hell_tree_" + countBgHell + ".png");  
    }
    public void act()
    {
        addObject(ground,514,1000);
        addObject(dante,77, 696);
        addObject(health, 100, 100);
        //addObject(mana, 101, 163);
        changeBg();
        checkCountBgHell();
        checkDante();
        checkMouseL();
        enterHell();
        
    }
    public void checkCountBgHell()
    {
        if(countBgHell < 0) 
        {
            countBgHell = 0;
        } else if (countBgHell > 5)
        {
            countBgHell = 5;
        }
    }
    public void checkDante()
    {
        if(Dante.class != null){
            if (dante.getX() > 1024)
            {
                countBgHell++;
                changeBg();
                dante.setLocation(77,696);
            }     
            else if (dante.getX() < 0)
            {
                countBgHell--;
                changeBg();
                dante.setLocation(900,696);
            }
        }
    }
    public void changeBg()
    {
        switch(countBgHell)
        {
            case 0:
                setBackground("/background/hell_tree_" + countBgHell + ".png");
                break;
                
            case 1:
                setBackground("/background/hell_tree_" + countBgHell + ".png");
                break;
                
            case 2:
                setBackground("/background/hell_tree_" + countBgHell + ".png"); 
                break;
                
            case 3:
                setBackground("/background/hell_tree_" + countBgHell + ".png"); 
                break;
                
            case 4:
                setBackground("/background/hell_tree_" + countBgHell + ".png");
                break;
                
            case 5:
                setBackground("/background/hell_gate.png");
                spawnVirgil();
                break;
        }
    }
    
    public void spawnVirgil()
    {
        addObject(virgil, 711, 867); 
        virgilTalk();
    }
         
    public void checkMouseL()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse != null) 
        {   mouseX = mouse.getX(); 
            mouseY = mouse.getY();
        }
    }
    public void virgilTalk()
    {
        if(Greenfoot.mouseClicked(null)) 
        {
            int minXNewGame = 600; 
            int maxXNewGame = 1000;
            int minYNewGame = 700;
            int maxYNewGame= 1000;
            if (mouseX > minXNewGame && mouseX < maxXNewGame && mouseY > minYNewGame && mouseY < maxYNewGame)
            {
                addObject(vtd, 500,600);
                showPicture++;
                killPicture();
            }           
        }
    }
    public void killPicture()
    {
        if(Greenfoot.mouseClicked(null) && showPicture % 2 == 1)
        {
                removeObject(vtd);
        }
    }
    public void enterHell()
    {
        if(Greenfoot.mouseClicked(null))
        {
            int minXNewGame = 400; 
            int maxXNewGame = 600;
            int minYNewGame = 500;
            int maxYNewGame= 1000;
            if (mouseX > minXNewGame && mouseX < maxXNewGame && mouseY > minYNewGame && mouseY < maxYNewGame)
            {
                Greenfoot.setWorld(acheron);
            }
        }
    
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mana extends Actor
{
    /**
     * Act - do whatever the Mana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage baseImg = new GreenfootImage("/UI/mana_bar_4_4.png");
    public void act()
    {
        // Add your action code here.
        changeImg();
    }
    public Mana()
    {
        GreenfootImage image = getImage();
        image.scale(210, 70);
        setImage(image);
    }
    public void changeImg()
    {
        Forest forest = (Forest) getWorld();
        int manaCount = forest.manaReserve;
        GreenfootImage image = getImage();
        image.scale(210, 70);
        setImage(image);
        
        switch(manaCount){
            case 0:
                setImage("/UI/mana_bar_0_4.png");
                break;
            case 1:
                setImage("/UI/mana_bar_1_4.png");
                break;
            case 2:
                setImage("/UI/mana_bar_2_4.png");
                break;
            case 3:
                setImage("/UI/mana_bar_3_4.png");
                break;
            case 4:
                setImage("/UI/mana_bar_4_4.png");
                break;
        }
    }
}

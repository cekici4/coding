import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VirgilTalkDante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VirgilTalkDante extends Actor
{
    /**
     * Act - do whatever the VirgilTalkDante wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage baseImg = new GreenfootImage("dante_virgil_talk.png");
    public void act()
    {
        // Add your action code here.
    }
    public VirgilTalkDante()
    {
        GreenfootImage image = getImage();
        image.scale(1000,1000);
        setImage(image);
    }
}

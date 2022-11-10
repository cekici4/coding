import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LostSoul here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LostSoul extends Actor
{
    /**
     * Act - do whatever the LostSoul wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage baseImg = new GreenfootImage("lost_soul.PNG");
    Actor dante = new Dante();
    Actor projectile = new Projectile();
    
    boolean death;
    boolean danteDamage;
    
    public LostSoul()
    {
        GreenfootImage image = getImage();
        image.scale(100,200);
        setImage(image);
    }
    
    public void act()
    {
        // Add your action code here.
        attack();
        getDamage();
        
    }
    
    public void attack()
    {
        if(this.isTouching(Dante.class)){danteDamage = true;}
    }
    public void getDamage()
    {
        if(this.isTouching(Projectile.class)){death = true;}
    }
    public void dealDamage()
    {
    }
    
}

import greenfoot.*; 
import java.lang.Class;
/**
 * actor dante, move options and behaviour
 */
public class Dante extends Actor
{
    //class constants
    int vSpeed;
    int accel = 0;
    int speed = 5;
    int DanteX;
    int DanteY;
    int manaReserve;
    int wait = 1;
    int flip = 0;
    
    private GreenfootImage danteBook = new GreenfootImage("dante_book.png");
    private GreenfootImage danteFalling = new GreenfootImage("dante_falling.png");
    
    
    public void act()
    {
        // Add your action code here.
        fall();
        checkFalling();
        jump();
        moveAround();
        fireProjectile();
        checkDante();
        replenishMana();
        wait++;
    }
    
    public Dante()
    {
        manaReserve = 4;
    }
    public void checkDante()
    {
        DanteX = getX();
        DanteY = getY();
    }
    public void moveAround()
    {
        GreenfootImage image = getImage();
        image.scale(70, 210);
        
        if(Greenfoot.isKeyDown("D"))
        {
            setLocation(getX() + speed, getY());
            if(flip == 0)
            {
                setImage(image);
                flip = 1;
            }
        }
        if(Greenfoot.isKeyDown("A"))
        {
            setLocation(getX() - speed, getY());
            if(flip == 1)
            {
                image.mirrorHorizontally();
                flip = 0;
            }
            
        }
         setImage(image);
    }
    
    public void fall()
    {
        setLocation(getX(), getY() + vSpeed);
    }
    
    public void checkFalling()
    {
        if(!isTouching(Ground.class))
        {
            vSpeed++;
            setLocation(getX(), getY() + vSpeed++);
            setImage(danteFalling);
            GreenfootImage image = getImage();
            image.scale(100, 210);
            setImage(danteFalling);
            
        }
        else if (isTouching(Ground.class))
        {
            vSpeed = 0;
            setImage(danteBook);
        }
    }
    
    public void jump()
    {
        if(Greenfoot.isKeyDown("w") && isTouching(Ground.class))
        {
            vSpeed = -40;
            
        }
    }

    public void fireProjectile()
    {
        if(Greenfoot.mousePressed(null) && manaReserve >= 1)
        {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            if (mouse == null) return;
            int x = mouse.getX();
            int y = mouse.getY();
            Actor projectile = new Projectile();
            getWorld().addObject(projectile, getX(), getY());
            projectile.turnTowards(x, y);
            manaReserve --;
        } else if (manaReserve == 0) {
            return;
        }
    }
    
    public void replenishMana()
    {
        if(manaReserve < 4 && (wait % 200 == 0))  
        {
            manaReserve++;
            
        }
    }
  
}
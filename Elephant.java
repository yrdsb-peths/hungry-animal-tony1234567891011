import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Actor
{
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    GreenfootImage rightIdle[] = new GreenfootImage[8];
    GreenfootImage leftIdle[] = new GreenfootImage[8];
    String facing = "right";
    
    public Elephant()
    {
        for(int i = 0; i<rightIdle.length; i++)
        {
            rightIdle[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            rightIdle[i].scale(100,100);
        }
        
        for(int i =0; i<leftIdle.length; i++)
        {
            leftIdle[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            rightIdle[i].mirrorHorizontally();
            leftIdle[i].scale(100,100);
        }
        setImage(rightIdle[0]);
    }
    
    int index = 0;
    public void animatedElephant()
    {
        if(facing.equals("right"))
        {
            setImage(rightIdle[index]);
            index = (index + 1) % rightIdle.length;
        }
        else
        {
            setImage(leftIdle[index]);
            index = (index + 1) % leftIdle.length;
        }
        
    }
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            move(-10);
            facing = "right";
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(10);
            facing = "left";
        }

        eat();
        animatedElephant();
    }
    public void eat()
    {
        if(isTouching(Apple.class))
        {
            removeTouching(Apple.class);
            MyWorld world = (MyWorld)getWorld();
            elephantSound.play();
            world.setAppleSpawn();
            world.score();
        }
    }
}

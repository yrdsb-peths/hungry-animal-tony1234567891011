import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Actor
{
    int speed = Greenfoot.getRandomNumber(15);
    int speedInitial = 0;
    double increasingSpeed = 0.0;
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        while(speed == 0)
        {
            speed = speed + Greenfoot.getRandomNumber(10); 
            // makes sure speed is not zero
        }
        int x = getX();
        int y = getY() + (speed + speedInitial);
        if(increasingSpeed <= 1.0)
        {
            increasingSpeed += 0.05;
        }
        speed = speed + (int)increasingSpeed;
        setLocation(x, y);
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);            
        }
        
        
    }
    public void setSpeed(int spd)
    {
        speedInitial = spd;
    }
}

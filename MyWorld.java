import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Tony) 
 * @version (1.0)
 */
public class MyWorld extends World
{
    Label scoreboard;
    int points = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        scoreboard = new Label(points,80);
        addObject(scoreboard, 300, 50);
        setAppleSpawn();
        Elephant elephant = new Elephant();
        addObject(elephant, 0, 200);
        
    }
    public void score()
    {
        points++;
        scoreboard.setValue(points);
    }
    public void gameOver()
    {
        Label endGame = new Label("Game Over", 100);
        addObject(endGame, 300,200);
    }
    public void setAppleSpawn()
    {
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        Apple apple = new Apple();
        addObject(apple, x,y);
        
        
    }
}

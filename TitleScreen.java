import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (Tony) 
 * @version (1.0)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Elephant Game", 50);

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject(titleLabel, getWidth()/2, getHeight()/2);
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld game = new MyWorld();
            Greenfoot.setWorld(game);
        }

    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,279,103);
        elephant.setLocation(313,115);
        Label label = new Label("Press <Space> to Start", 30);
        addObject(label,321,294);
        label.setLocation(319,275);
        Label label2 = new Label("Use \u2190 and \u2192 to Move", 40);
        addObject(label2,287,321);
        label2.setLocation(315,322);
    }
}

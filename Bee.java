import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor
{
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        control();
        eat();
        
    
    }
    public void eat()
    {
        Actor Flower;
       Flower = getOneObjectAtOffset(0,0,Flower.class);
       // This removes the flower once it has touched the bee
       if(Flower != null)
       {
           MyWorld world;
           world = (MyWorld) getWorld();
           
           Counter myCounter = world.getCounter();
           myCounter.increaseCounter();
           
           world.removeObject(Flower);
           Greenfoot.playSound("eating.wav");
           
           
       }
        
    }
    public void control()
    {
        //This makes it move
        if(Greenfoot.isKeyDown("up"))
        {
             move(3);
             setImage("bee.png");
        }
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-3);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            turn(3);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            move(-3);
            setImage("beeCopy.png");
        }
       
        
    }
}  
       
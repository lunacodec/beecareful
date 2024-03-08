import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Butterfly here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Butterfly extends Actor
{
    /**
     * Act - do whatever the Butterfly wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("W"))
        {
            move(3);
            setImage("butterfly.png");
        }
        
        if(Greenfoot.isKeyDown("A"))
        {
            turn(-3);
        }
        if(Greenfoot.isKeyDown("D"))
        {
            turn(3);
        }
        if(Greenfoot.isKeyDown("S"))
        {
            move(-3);
            setImage("butterflyCopy.png");
        }
        eat();
       
    }    
    public void eat()
    {
        Actor Flower;
       Flower = getOneObjectAtOffset(0,0,Flower.class);
       
       if(Flower != null)
       {
           MyWorld world;
           world = (MyWorld) getWorld();
           
           Counter myCounter = world.getCounter();
           myCounter.increaseCounter2();
           
           world.removeObject(Flower);
           Greenfoot.playSound("eating.wav");
           
       }
        
    }
}

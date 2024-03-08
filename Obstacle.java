import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstacle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obstacle extends Actor
{
    /**
     * Act - do whatever the Obstacle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int height = 5;
    public void act() 
    {
        int x =getX();
        int y =getY();
        destroy();
        destroy2();
        //This makes the obstacle move up and down
        
        setLocation(x,y+height);
        
        if(getY() >=600)
        {
            height = height*-1;
            
        }
        else if (getY()<=20)
        {
            height = 5;
        }
    }     
    public void destroy()
    {
        Actor Bee;
       Bee = getOneObjectAtOffset(0,0,Bee.class);
       // This kills the bee when it touches the obstacle
       if(Bee != null)
       {
           World myWorld;
           myWorld = getWorld();
           myWorld.removeObject(Bee);
           
       }
        
    }
    public void destroy2()
    {
        Actor Butterfly;
       Butterfly = getOneObjectAtOffset(0,0,Butterfly.class);
       // This kills the butterfly when it touches the obstacle
       if(Butterfly != null)
       {
           World myWorld;
           myWorld = getWorld();
           myWorld.removeObject(Butterfly);
           
       }
        
    }
    
}

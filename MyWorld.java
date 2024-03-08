import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private Counter myCounter;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1);
        
        
        myCounter = new Counter();
        addObject(myCounter, 50,20);
        prepare();
    }
    public Counter getCounter()
    {
        return myCounter;
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Bee bee = new Bee();
        addObject(bee,46,88);
        Butterfly butterfly = new Butterfly();
        addObject(butterfly,54,336);
        Obstacle obstacle = new Obstacle();
        addObject(obstacle,209,15);
        obstacle.setLocation(196,36);
        Obstacle obstacle2 = new Obstacle();
        addObject(obstacle2,369,319);
        Flower flower = new Flower();
        addObject(flower,559,203);
        flower.setLocation(551,196);
        Flower flower2 = new Flower();
        addObject(flower2,559,63);
        Flower flower3 = new Flower();
        addObject(flower3,564,346);
        Flower flower4 = new Flower();
        addObject(flower4,296,194);
        flower4.setLocation(371,195);
        obstacle2.setLocation(286,551);
        flower4.setLocation(739,498);
        flower4.setLocation(1012,565);
        flower4.setLocation(632,458);
        obstacle2.setLocation(342,554);
        flower.setLocation(826,196);
        Obstacle obstacle3 = new Obstacle();
        addObject(obstacle3,500,45);
        flower2.setLocation(729,101);
        flower3.setLocation(848,346);
        obstacle3.setLocation(529,250);
        flower4.setLocation(341,247);
        flower2.setLocation(532,38);
        flower.setLocation(1004,540);
        flower3.setLocation(1028,76);
        flower3.setLocation(1004,46);
        Obstacle obstacle4 = new Obstacle();
        addObject(obstacle4,708,137);
        Obstacle obstacle5 = new Obstacle();
        addObject(obstacle5,856,423);
        obstacle5.setLocation(842,422);
        Flower flower5 = new Flower();
        addObject(flower5,656,432);
        Flower flower6 = new Flower();
        addObject(flower6,829,239);
        Flower flower7 = new Flower();
        addObject(flower7,389,445);
    }
}   

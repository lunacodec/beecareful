import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    int score = 0;
    int score2 = 0;
    public Counter()
    {
        setImage(new GreenfootImage("Score:"+ score + "-" + score2  ,24,Color.GREEN,new Color(0,0,0,0)));
        
    }
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("Score:"+ score + "-" + score2  ,24,Color.GREEN,new Color(0,0,0,0)));
    }  
    public void increaseCounter()
    {
        //Increases the score
        score += 1;
        
    }
    public void increaseCounter2()
    {
        score2 +=1;
    }
    public void increaseCounter(int value)
    {
        score += value;
        
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Blueberry extends Actor
{
    public void act()
    {
        move(-3);
        
        if(getX() <= 0) {
            resetBlueberry();
        }
    }
    
    public void resetBlueberry(){
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0) {
            setLocation(600, 100);
        } else {
            setLocation(600, 300);
        }
    }
}

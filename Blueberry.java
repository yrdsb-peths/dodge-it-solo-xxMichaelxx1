import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Blueberry extends Actor
{
    public void act()
    {
        move(-10);
        
        if(getX() <= 0) {
            resetBlueberry();
        }
        
        if (isTouching(Hero.class)){
            // Add a gameover symbol
            Skeleton skeleton = new Skeleton();
            getWorld().addObject(skeleton, 300, 200);
            getWorld().removeObject(this);
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

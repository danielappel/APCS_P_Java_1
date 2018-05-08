package Problem_Set_1;
import kareltherobot.*;
import java.awt.Color;

public class Problem4 implements Directions
{
    public static void main(String args[])  {
        UrRobot karel = new UrRobot(3, 4, West, 0);  
        //your code goes below
        
        
        karel.turnOff();  
    } 

    static {
        World.reset(); 
        World.readWorld("worlds/fig2-8.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(50);  
        World.setVisible(true);
    }
}
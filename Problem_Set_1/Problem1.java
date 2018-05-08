package Problem_Set_1;
import kareltherobot.*;
import java.awt.Color;

public class Problem1 implements Directions
{
    public static void main(String args[])  {
        UrRobot karel = new UrRobot(2, 7, West, 0);  
        
        
        karel.turnOff();  
    } 

    static {
        World.reset(); 
        World.readWorld("worlds/fig2-6.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(50);  
        World.setVisible(true);
    }
}
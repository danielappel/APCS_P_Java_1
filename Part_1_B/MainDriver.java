package Part_1_B;
import kareltherobot.*;
import java.awt.Color;

public class MainDriver implements Directions
{
    public static void main(String [] args)  {
        // constructor method  UrRobot(street, avenue, Direction, Number Beepers)
        UrRobot karel = new UrRobot(1, 2, East, 0);  

        karel.turnOff();  
    } 
    
    static {
        World.reset(); 
        World.readWorld("worlds/karel-1.2-lab.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(100);  
        World.setVisible(true);
    }
}
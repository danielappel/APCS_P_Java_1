package Problem_Set_1;
import kareltherobot.*;
import java.awt.Color;

public class Problem3 implements Directions
{
    public static void main(String args[])  {
        //Select the code below and uncomment it (F7 button)
        
//         //Uncomment the following constructor method and place karel in the correct location
//         // and orientation
//         UrRobot karel = new UrRobot();  
//         
//         //your code goes here
//         
//         
//         karel.turnOff();  
    } 

    static {
        World.reset(); 
        World.readWorld("worlds/fig2-7.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(50);  
        World.setVisible(true);
    }
}
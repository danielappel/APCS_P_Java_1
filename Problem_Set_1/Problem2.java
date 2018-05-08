package Problem_Set_1;
import kareltherobot.*;
import java.awt.Color;

public class Problem2 implements Directions
{
    
    //Select and uncommment the code below (F7 button)
    //Find all errors so that the program compiles
//     public static vpid main(String args[])  {
//         UrRobot karel = new UrRobot(2, 7, East, 3);  
//         karel.move();
//         karel.move()
//         karel.pickBeeper();
//         karel.putBeeper();
//         karel.move;();
//         karel.turnright();
//         karel.putBeeper();
//         karel.putBeeper();
//         karel.turnOff();  
//     } 

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
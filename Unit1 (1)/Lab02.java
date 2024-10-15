//Programmer: Brendan Hom

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.WorldFrame;

public class Lab02
{
   public static void main(String[] args)
   {
      Display.openWorld("maps/maze.map");
      Display.setSize(8, 8);
      Display.setSpeed(5);
      
      WorldFrame.getCurrent().setLocation(0, 0);
      
      Athlete bob = new Athlete();
      
      bob.putBeeper();
      bob.move();
      bob.putBeeper();
      bob.turnRight();
      bob.move();
      bob.putBeeper();
      bob.turnRight();
      bob.move();
      bob.putBeeper();
      bob.turnLeft();
      bob.move();
      bob.putBeeper();
      bob.turnLeft();
      bob.move();
      bob.putBeeper();
      bob.turnRight();
      bob.move();
      bob.putBeeper();
      bob.move();
      bob.putBeeper();
      bob.turnRight();
      bob.move();
      bob.putBeeper();
      bob.turnLeft();
      bob.move();
      bob.putBeeper();
      bob.turnLeft();
      bob.move();
      bob.putBeeper();
      bob.move();
      bob.putBeeper();
      bob.move();
      bob.putBeeper();
      bob.move();
      bob.putBeeper();
      bob.turnRight();
      bob.move();
      bob.putBeeper();
      bob.move();
      
        }
}
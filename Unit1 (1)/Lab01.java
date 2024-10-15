//Code by Brendan Hom

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.WorldFrame;

public class Lab01
{
   public static void main(String[] args)
   {
      Display.openWorld("maps/school.map");
      Display.setSize(10, 10);
      Display.setSpeed(5);
      
      WorldFrame.getCurrent().setLocation(0, 0);
      
      Robot pete = new Robot();
      Robot lisa = new Robot(4, 5, Display.SOUTH, 0);
      
      pete.move();
      pete.move();
      pete.turnLeft();
      pete.move();
      pete.turnLeft();
      pete.move();
      pete.pickBeeper();
      pete.turnLeft();
      pete.turnLeft();
      pete.move();
      pete.turnLeft();
      pete.turnLeft();
      pete.turnLeft();
      pete.move();
      pete.turnLeft();
      pete.move();
      pete.move();
      pete.move();
      pete.turnLeft();
      pete.move();
      pete.move();
      pete.move();
      pete.turnLeft();
      pete.move();
      pete.move();
      pete.putBeeper();
      pete.turnLeft();
      pete.turnLeft();
      pete.turnLeft();
      pete.move();
      
      //lisa turn
      lisa.move();
      lisa.pickBeeper();
      lisa.turnLeft();
      lisa.move();
      lisa.move();
      lisa.turnLeft();
      lisa.move();
      lisa.move();
      lisa.turnLeft();
      lisa.turnLeft();
      lisa.turnLeft();
      lisa.move();
      lisa.move();
      lisa.turnLeft();
      lisa.move();
      lisa.turnLeft();
      lisa.move();
      lisa.move();
      lisa.turnLeft();
      lisa.turnLeft();
      lisa.turnLeft();
      lisa.move();
      lisa.move();
      lisa.turnLeft();
      lisa.move();
      lisa.move();
      lisa.putBeeper();
      lisa.turnLeft();
      lisa.turnLeft();
      lisa.move();
   }
}
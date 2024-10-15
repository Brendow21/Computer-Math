//Programmer: Brendan Hom
/*
   Lab 02a
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.WorldFrame;

public class Lab02a
{
   public static void main(String[] args)
   {
      Display.openWorld("maps/goldmine.map");
      Display.setSize(8, 8);
      Display.setSpeed(10);
      
      WorldFrame.getCurrent().setLocation(0, 0);
      
      Athlete a = new Athlete(1, 1, Display.SOUTH, 0);
      Athlete b = new Athlete(1, 7, Display.WEST, 0);
      Athlete c = new Athlete(8, 7, Display.NORTH, 0);
      Athlete d = new Athlete(8, 4, Display.EAST, 0);
      
      a.turnAround();
      a.move();
      a.move();
      a.move();
      a.pickBeeper();
      a.move();
      a.move();
      a.move();
      a.putBeeper();
      
      // b turn
      b.pickBeeper();
      b.turnAround();
      b.move();
      b.move();
      b.move();
      b.move();
      b.move();
      b.pickBeeper();
      b.pickBeeper();
      b.move();
      b.move();
      b.putBeeper();
      b.putBeeper();
      b.putBeeper();
      
      // c turn
      c.turnAround();
      c.pickBeeper();
      c.pickBeeper();
      c.pickBeeper();
      c.move();
      c.pickBeeper();
      c.pickBeeper();
      c.pickBeeper();
      c.move();
      c.move();
      c.putBeeper();
      c.putBeeper();
      c.putBeeper();
      c.putBeeper();
      c.putBeeper();
      c.putBeeper();
      
      //d turn
      d.turnAround();
      d.pickBeeper();
      d.pickBeeper();
      d.pickBeeper();
      d.pickBeeper();
      d.pickBeeper();
      d.pickBeeper();
      d.move();
      d.move();
      d.pickBeeper();
      d.pickBeeper();
      d.pickBeeper();
      d.pickBeeper();
      d.move();
      d.move();
      d.putBeeper();
      d.putBeeper();
      d.putBeeper();
      d.putBeeper();
      d.putBeeper();
      d.putBeeper();
      d.putBeeper();
      d.putBeeper();
      d.putBeeper();
      d.putBeeper();
      d.move();
      
        }
}
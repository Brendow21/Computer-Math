//Programmer: Brendan Hom
//Miners collecting gold and takes out of the mine
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.WorldFrame;

public class Lab05a
{
   public static void main(String[] args)
   {
      Display.openWorld("maps/goldmine.map");
      Display.setSize(8, 8);
      Display.setSpeed(10);
      
      WorldFrame.getCurrent().setLocation(0, 0);
      
      //Instantiating 4 athletes using 4-arg constructor
      Athlete a = new Athlete(1, 1, Display.SOUTH, 0);
      Athlete b = new Athlete(1, 7, Display.WEST, 0);
      Athlete c = new Athlete(8, 7, Display.NORTH, 0);
      Athlete d = new Athlete(8, 4, Display.EAST, 0);
      
      //a takes gold to b
      a.turnAround();
      for (int x=1; x<=3; x++)
      {
          a.move();
      }
      a.pickBeeper();
      for (int x=1; x<=3; x++)
      {
          a.move();
      }
      a.putBeeper();
      
  // b tkes gold to c
      b.pickBeeper();
      b.turnAround();
       for (int x=1; x<=5; x++)
      {
          b.move();
      }
      b.pickBeeper();
      b.pickBeeper();
      b.move();
      b.move();
       for (int x=1; x<=3; x++)
      {
          b.putBeeper();
      }
      
      // c takes gold d
      c.turnAround();
       for (int x=1; x<=3; x++)
      {
          c.pickBeeper();
      }
      c.move();
     for (int x=1; x<=3; x++)
      {
          c.pickBeeper();
      };
      c.move();
      c.move();
      for (int x=1; x<=6; x++)
      {
          c.putBeeper();
      }
      
      //d takes gold outside mine and takes one step
      d.turnAround();
      for (int x=1; x<=6; x++)
      {
          d.pickBeeper();
      }
      d.move();
      d.move();
      for (int x=1; x<=4; x++)
      {
          d.pickBeeper();
      }
      d.move();
      d.move();
      for (int x=1; x<=10; x++)
      {
          d.putBeeper();
      }
      d.move();
      
        }
}
 //Name: Brendan Hom  Block 5  Date 9/6/19
 //Atlete is subclass of Robot and can turnright and turnaround
 import edu.fcps.karel2.Robot;
   import edu.fcps.karel2.Display;
   
public class Athlete extends Robot
{
      //Default Constructor
      public Athlete()
     {
       super(1, 1, Display.NORTH, Display.INFINITY);
     }
     
     public Athlete(int x, int y, int dir, int beep)
     {
         super(x, y, dir, beep);
     }
      public void turnAround()
     {
         turnLeft();
         turnLeft();
      }
       public void turnRight()
      {
         turnLeft();
         turnLeft();
         turnLeft();
       }
}
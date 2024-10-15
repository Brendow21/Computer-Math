/** Programmer: Brendan Hom Block: 5 
*   Lab04 Take the Field
*   static method
*/
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.WorldFrame;

public class Lab04
{
   
   //static method that takes Athletes from locker to entrance of the field
      public static void takeTheField(Athlete arg)
      {
      arg.move();
      arg.move();
      arg.move();
      arg.move();
      arg.turnRight();
      arg.move();
      arg.move();
      }
   
   
     public static void main(String[] args) 
     {
     //Display the arena map size 10 X 10 
      Display.openWorld("maps/arena.map");
      Display.setSize(10, 10);
      Display.setSpeed(10);
      
      WorldFrame.getCurrent().setLocation(0, 0);
      
      //instantiating 6 athlete and 1 coach
      Athlete a, b, c, d, e, f, coach; //declaring names of athletes and coach
      a = new Athlete();  //instanciating
      b = new Athlete();  
      c = new Athlete();  
      d = new Athlete();  
      e = new Athlete();  
      f = new Athlete();
      coach = new Athlete(2, 7, Display.EAST, 0);
      
      //calling static method takeTHeField
      takeTheField(a);
      takeTheField(b);
      takeTheField(c);
      takeTheField(d);
      takeTheField(e);
      takeTheField(f);
      
      //a take position
      a.move();
      a.move();
      a.move();
      a.turnLeft();
      a.move();
      a.move();
      a.turnAround();
      
      //b take position
      b.move();
      b.move();
      b.move();
      b.move();
      b.move();
      b.turnLeft();
      b.move();
      b.turnAround();
      
      //c take postion
      c.move();
      c.move();
      c.move();
      c.move();
      c.turnRight();
      
      //d take position
      d.move();
      d.move();
      d.move();
      d.turnRight();
      
      //e take position
      e.move();
      e.move();
      e.turnRight();
      
      //f take position
      f.move();
      f.turnLeft();
      f.move();
      f.turnAround();
      
  }
}
/** Programmer: Brendan Hom Block: 5 
*   Lab05 runTheRace
*/
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.WorldFrame;

public class Lab05
{
   
   //static method that the racers runTheRace
      public static void runTheRace(Racer arg)
      {
      arg.move();
      arg.shuttle(2, 7);
      arg.shuttle(4, 5);
      arg.shuttle(6, 3);
      }
   
   
     public static void main(String[] args) 
     {
     //Display the arena map size 10 X 10 
      Display.openWorld("maps/shuttle.map");
      Display.setSize(10, 10);
      Display.setSpeed(10);
      
      WorldFrame.getCurrent().setLocation(0, 0);
      
      //instantiating 3 racers objects
      Racer a, b, c;
      a = new Racer(1);  //instanciating
      b = new Racer(4);  
      c = new Racer(7);  
      
      //a runTheRace
      runTheRace(a);
      
      //b runTheRace
      runTheRace(b);
      
      //c runTheRace
      runTheRace(c);
  }
}
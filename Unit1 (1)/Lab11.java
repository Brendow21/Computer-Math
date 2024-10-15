//Brendan Hom
//Lab 11

import edu.fcps.karel2.Display;
import edu.fcps.karel2.WorldFrame;
import edu.fcps.Digit;

public class Lab11

{
   public static void main(String[] args) 
   {
      Display.setSize(45, 32);
      Display.setSpeed(10);
      
      WorldFrame.getCurrent().setLocation(0, 0);
      
      //instantiate 10 digit references
      Digit d0 = new Eight (4, 20);
      Digit d1 = new One (11, 20);
      Digit d2 = new Two (18, 20);
      Digit d3 = new Zero (25, 20);
      Digit d4 = new Three (32, 20);
      Digit d5 = new One (39, 20);

      
      //invoke the display method for each
      d0.display();
      d1.display();
      d2.display();
      d3.display();
      d4.display();
      d5.display();  
   }
}

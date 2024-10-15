//Brendan Hom
//shifting piles

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;
import edu.fcps.karel2.WorldFrame;

public class Lab09
{
   public static void main(String[] args)
   {
   
      String filename = JOptionPane.showInputDialog("What robot display?");
   
      Display.openWorld("maps/" + filename + ".map");
      Display.setSize(10, 10);
      Display.setSpeed(5);
      
      WorldFrame.getCurrent().setLocation(0, 0);
      
      Robot pete = new Robot();
      
      for(int x = 0 ; x<= 7 ; x++)
      {
         if(pete.nextToABeeper())
         {
            while(pete.nextToABeeper())
            {
               pete.pickBeeper();
            }
            pete.move();
            while(pete.nextToABeeper())
            {
            pete.putBeeper();
            }
         }
         else
         if(pete.frontIsClear())
         {
         pete.move();
         }
      }
   }
}
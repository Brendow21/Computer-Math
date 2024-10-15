//Brendan Hom
//Maze Escaping

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;
import edu.fcps.karel2.WorldFrame;

public class Lab10
{
   public static void main(String[] args)
   {
   
      String filename = JOptionPane.showInputDialog("What robot display?");
   
      Display.openWorld("maps/" + filename + ".map");
      Display.setSize(10, 10);
      Display.setSpeed(7);
      
      WorldFrame.getCurrent().setLocation(0, 0);
      
      Athlete k = new Athlete();
      
      if(k.frontIsClear()&&!k.rightIsClear())
      {
         k.move();
      }
      else if(k.frontIsClear()&&k.rightIsClear())
      {
      k.turnRight();
      k.move();
      }
      
      while(!k.nextToABeeper())
      {
      if(k.leftIsClear())
      {
      k.turnLeft();
      k.move();
      }
      else if(!k.leftIsClear()&&k.frontIsClear())
      {
      k.move();
      }
      else if(k.rightIsClear()&&!k.frontIsClear())
      {
      k.turnRight();
      }
      else if(!k.frontIsClear()&&k.leftIsClear())
      {
      k.turnLeft();
      }
      else
      {
      k.turnAround();
      }
     }
   }
}

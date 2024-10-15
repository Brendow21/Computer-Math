import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
   
public abstract class Mower extends Athlete implements Runnable
{
      //Default Constructor
     
   public Mower(int x, int y, int dir, int beep)
   {
      super(x, y, dir, beep);
   }
   
   public Mower()
   {
      super(2, 2, Display.NORTH, 0);
}
}   
      
      
   

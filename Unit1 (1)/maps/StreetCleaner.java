import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
   
public class StreetCleaner extends Athlete implements Runnable
{
      //Default Constructor
     
   public StreetCleaner(int x, int y, int dir, int beep)
   {
      super(x, y, dir, beep);
   }
   
   public StreetCleaner()
   {
      super(2, 2, Display.NORTH, 0);
   }
   
   public void cleanStreet()
   {
   
   }
   


public void run()
{
cleanStreet();
}
}
//Dancer

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public abstract class Dancer extends Athlete implements Runnable
{
   public Dancer(int x, int y, int dir, int beep)
   {
      super(x, y, dir, beep);
   }
   public Dancer()
   {
      super(1, 1, Display.EAST, 0);
   }
   public abstract void danceStep();
   public void run()
   {
      for(int x = 1; x<=10; x++)
      {
         danceStep();
      }
   }
}

//PlusDancer

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class PlusDancer extends Dancer
{
   public PlusDancer()
   {
      super(3, 3, Display.EAST, 0);
   }
   public PlusDancer(int x, int y, int dir, int beep)
   {
      super(x, y, dir, beep);
   }
   public void danceStep()
   {
      putBeeper();
      move();
      putBeeper();
      move();
      putBeeper();
      turnAround();
      move();
      move();
      move();
      putBeeper();
      move();
      putBeeper();
      turnAround();
      move();
      move();
      turnLeft();
      move();
      putBeeper();
      move();
      putBeeper();
      turnAround();
      move();
      move();
      move();
      putBeeper();
      move();
      putBeeper();
      turnAround();
      move();
      move();
   }
}

//TreeTrimmer
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
   
public class TreeTrimmer extends Athlete implements Runnable, Decorator
{
 //Default Constructor
   public TreeTrimmer(int x, int b)
   {
      super(x, 2, Display.NORTH, b);
   }
   
   public void hangOrnaments()
   {
      this.putBeeper();
      this.move();
   }
   
   
   
   public boolean doneWithJob()
   {
      if(this.hasBeepers() == false)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   
   public void run()
   {
      while(!this.doneWithJob())
      {
         this.hangOrnaments();
      }
   }
}

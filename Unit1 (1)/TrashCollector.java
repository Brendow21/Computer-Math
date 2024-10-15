import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
   
public class Planter extends Athlete implements Runnable
{
      //Default Constructor
     
   public Planter(int x, int y, int dir, int beep)
   {
      super(x, y, dir, beep);
   }
   
   public Planter()
   {
      super(2, 2, Display.NORTH, 0);
   }
   
   public void plantSeeds()
   {
   while(!this.nextToABeper())
   {
   if(this.frontIsClear())
         {
            this.putBeeper();
            this.move();
         }
         else if (!frontIsClear() && leftIsClear())
         {
         this.putBeeper();
            this.turnLeft();
            this.move();
            }
            else
            {
            this.putBeeper();
            this.turnRight();
            this.move();
         }
         }
         }
   
   public void run()
   {
    
   }
   }

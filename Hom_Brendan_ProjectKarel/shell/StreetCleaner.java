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
      for(int k = 1; k <=3; k++)
      {
      
         for(int y = 1; y <=18; y++)
         {
            this.move();
            if(this.nextToABeeper())
            {
               this.pickBeeper();
            }
         
         }
         this.turnAround();
         for(int h = 1; h <=18; h++)
         {
            this.move();
            if(this.nextToABeeper())
            {
               this.pickBeeper();
            }
         }
         this.turnAround();
      }
   }
   
   public void putAwayTrash()
   {
   this.turnRight();
   while(!this.rightIsClear() && this.frontIsClear())
   {
   this.move();
   }
   if(this.hasBeepers())
   {
   while(this.hasBeepers())
   {
   this.putBeeper();
   }
   }
   this.turnAround();
   this.move();
   }

   public void run()
   {
      this.cleanStreet();
      this.putAwayTrash();
   }
}
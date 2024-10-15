 //Name: Brendan Hom  Block 5  Date 9/6/19
 //Harvester
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
   
public class Harvester  extends Robot implements Workable
{
      //Default Constructor
   public Harvester()
{
   super(2, 2, Display.EAST, 0);
   }
   public Harvester (int x, int y)
   {
   super(x, y, Display.EAST, 0);
   }
   
   public void workCorner()
   {
   if(this.nextToABeeper())
   {
   this.pickBeeper();
   }
   }
   
   public void moveOneBlock()
   {
   this.move();
   }
   
   public void turnToTheRight()
   {
   this.turnLeft();
   this.turnLeft();
   this.turnLeft();
   }
   
   public void turnToTheNorth()
{
while(!this.facingNorth())
{
this.turnLeft();
}
}

   
}


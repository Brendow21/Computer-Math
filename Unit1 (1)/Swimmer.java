//Torbert, e-mail: smtorbert@fcps.edu
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class Swimmer extends Robot implements Runnable
{
   public Swimmer(int x)
   {
      super(x, 1, Display.NORTH, 0);
   }
   public void run() //not swim
   {
    for(int x=1; x<=10; x++)
    {
    for(int i=1; i<=8; i++)
    {
    this.move();
    }
    this.turnLeft();
    this.turnLeft();
    for(int j=1; j<=8; j++)
    {
    this.move();
    }
    this.turnLeft();
    this.turnLeft();
    }  
   }
}
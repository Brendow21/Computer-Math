/** Programmer: Brendan Hom Block:5
* The Racer class is a subclass of Athlete
*They know how to jumpRight, jumpLeft, sprint, etc
*/
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class Racer extends Athlete
{
   //1-arg constructor set y-coordinate of Racer
   public Racer(int y)
   {
      super(1, y, Display.EAST, Display.INFINITY);
   }
   //Preconditon: facing EAST in front of hurdle
   //postcondition: facing EAST behind hurdle
   public void jumpRight()
   {
     this.turnLeft();
     this. move();
     this.turnRight();
     this.move();
     this.turnRight();
     this.move();
     this.turnLeft();
   }
   //precondition: facing WEST in front of hurdle
   //postcondition: facing WEST behind hurdle
   public void jumpLeft()
   {
     this.turnRight();
     this.move();
     this.turnLeft();
     this.move();
     this.turnLeft();
     this.move();
     this.turnRight();
     }
     
     //sprint() makes RAcer to advance number of spaces
     //passed by arguement (parameter)
     public void sprint(int n)
     {
         for(int i=1; i<=n; i++)
          {
            this.move();
          }
     }
     
     //pick() method makes Racer to pick multiple beepers
     //passed by arguement.
     public void pick(int n)
     {
      for(int x=1; x<=n; x++)
      {
         this.pickBeeper();
      }
     }
     
     //put() method makes Racer put multiple beerpers
     public void put(int n)
     {
      for(int x=1; x<=n; x++)
       {
         this.putBeeper();
       }
     }
     
     //shuttle method let Racer to the shuttle run
     //number of spaces and number of beepers passed with arguement
     public void shuttle(int spaces, int beepers)
      {
        this.jumpRight();
        this.sprint(spaces);
        this.pick(beepers);
        this.turnAround();
        this.sprint(spaces);
        this.jumpLeft();
        this.move();
        this.put(beepers);
        this.turnAround();
        this.move();
      }
}

import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
   
public class LawnMower extends Athlete implements Grass, Runnable
{
      //Default Constructor
     
   public LawnMower(int x, int y, int dir, int beep)
   {
      super(x, y, dir, beep);
   }
   
   public LawnMower()
   {
      super(2, 2, Display.NORTH, 0);
   }
   
   
   //precondition: must be next to curb facing north
   //postcondition: must be facing west toward the lawn
   public void goToHouse()
   {
  
      while(!this.leftIsClear() && this.frontIsClear())
      {
         this.move();
      }
      if(this.leftIsClear())
      {
         this.turnLeft();
         this.move();
      }
   }
      
      
      //precondition: must be facing west toward lawn
      //postcondition:must be facing east toward driveway
   public void mowGrass()
   {
      while(this.nextToABeeper())
      {
         if(this.frontIsClear())
         {
            this.pickBeeper();
            this.move();
         }
         else
         {
            this.pickBeeper();
            this.turnRight();
            this.move();
         }
         }
         }
         
         
         //precondition: must be facing east toward driveway
         //postcondition: must be facing south at curb
         public void goToCurb()
         {
         this.turnLeft();
         this.move();
         this.turnRight();
         while(this.frontIsClear() && this.hasBeepers())
         {
         this.move();
         }
}
         
         
         //precondition: must be facing south at curb
         //postcondition: must be facing south at curb with bepers placed
         public void placeGrass()
         {
         while(this.hasBeepers())
         {
         this.putBeeper();
         }
         }
         
         
         //precondition: must be facing sout at curb with beepers placed
         //postcondition: must be facing south at driveway entrance
         public void leaveCurb()
         {
         this.turnAround();
         this.move();
         this.turnRight();
         this.move();
         this.turnRight();
         }
         
         
         //precondition: must be facing south at driveway entrance
         //postcondition: must be facing south the other house curb
         public void nextHouse()
         {
         for(int k = 1; k <=9; k++)
         {
         this.move();
         }
         for(int k = 1; k <=2; k++)
         {
         this.turnRight();
         this.move();
         }
         this.turnAround();
         }
         
         
          //precondition: must be facing south the other house curb
          //post condition: must be facing west toward lawn
         public void goToHouseTwo()
         {
          while(!this.rightIsClear() && this.frontIsClear())
      {
         this.move();
      }
      if(this.rightIsClear())
      {
         this.turnRight();
         this.move();
      }
   }
   
   
   //precondition: must be facing lawn
   //postcondition: must be facing east toward driveway
      public void mowGrassTwo()
   {
      while(this.nextToABeeper())
      {
         if(this.frontIsClear())
         {
            this.pickBeeper();
            this.move();
         }
         else
         {
            this.pickBeeper();
            this.turnLeft();
            this.move();
         }
         }
         }
         
         
         //precondition: must be facing east toward driveway
         //postcondition: must be facing north at curb
         public void goToCurbTwo()
         {
         this.turnRight();
         this.move();
         this.turnLeft();
         while(this.frontIsClear() && this.hasBeepers())
         {
         this.move();
         }
}


//precondition: must be facing north at curb
//postcondition: must be facing north at drivway entrance
public void leaveCurbTwo()
         {
         this.turnAround();
         this.move();
         this.turnLeft();
         this.move();
         this.turnLeft();
         }
   
   
   
   public void run()
   {
   this.goToHouse();
   this.mowGrass();
   this.goToCurb();
   this.placeGrass();
   this.leaveCurb();
   this.nextHouse();
   this.goToHouseTwo();
   this.mowGrassTwo();
   this.goToCurbTwo();
   this.placeGrass();
   this.leaveCurbTwo();
   }
   
   
   
   
}
      
      
      
   

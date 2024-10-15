//Lab 15
import edu.fcps.karel2.WorldFrame;
import edu.fcps.karel2.*;

public class Lab15
{
   public static void main(String[] args)
   {
      Display.setSize(20, 20);
      Display.setSpeed(10);
      WorldFrame.getCurrent().setLocation(0, 0);
   
      SquareDancer sd1 = new SquareDancer(2, 2, Display.EAST, 0);
      SquareDancer sd2 = new SquareDancer(3, 3, Display.EAST, 0);
      SquareDancer sd3 = new SquareDancer(4, 4, Display.EAST, 0);
      SquareDancer sd4 = new SquareDancer(5, 5, Display.EAST, 0);
      LDancer ld1 = new LDancer(2, 10, Display.EAST, 0);
      LDancer ld2 = new LDancer(3, 11, Display.EAST, 0);
      LDancer ld3 = new LDancer(4, 12, Display.EAST, 0);
      PlusDancer pd1 = new PlusDancer(12, 4, Display.EAST, 100);
      PlusDancer pd2 = new PlusDancer(12, 5, Display.EAST, 100);
      PlusDancer pd3 = new PlusDancer(12, 3, Display.EAST, 100);
      PlusDancer pd4 = new PlusDancer(11, 4, Display.EAST, 100);
      PlusDancer pd5 = new PlusDancer(13, 4, Display.EAST, 100);
      
      Thread t1 = new Thread(sd1);
      Thread t2 = new Thread(sd2);
      Thread t3 = new Thread(sd3);
      Thread t4 = new Thread(sd4);
      Thread t5 = new Thread(ld1);
      Thread t6 = new Thread(ld2);
      Thread t7 = new Thread(ld3);
      Thread t8 = new Thread(pd1);
      Thread t9 = new Thread(pd2);
      Thread t10 = new Thread(pd3);
      Thread t11 = new Thread(pd4);
      Thread t12 = new Thread(pd5);
      
      t1.start();
      t2.start();
      t3.start();
      t4.start();
      t5.start();
      t6.start();
      t7.start();
      t8.start();
      t9.start();
      t10.start();
      t11.start();
      t12.start();
      
   }
}
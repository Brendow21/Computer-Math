//Lab 13
import edu.fcps.karel2.WorldFrame;
import edu.fcps.karel2.*;
import javax.swing.JOptionPane;

public class Lab13
{
   public static void main(String[] args)
   {
   
      String filename = JOptionPane.showInputDialog("What Lawn?");
      Display.openWorld("maps/" + filename + ".map");
      Display.setSize(20, 20);
      Display.setSpeed(5);
      WorldFrame.getCurrent().setLocation(0, 0);
      
      LawnMower m1 = new LawnMower(6, 14, Display.NORTH, 0);
      LawnMower m2 = new LawnMower(12, 14, Display.NORTH, 0);
      LawnMower m3 = new LawnMower(18, 14, Display.NORTH, 0);
      Planter p1= new Planter(2, 7, Display.SOUTH, Display.INFINITY);
      Planter p2= new Planter(8, 7, Display.SOUTH, Display.INFINITY);
      Planter p3= new Planter(14, 7, Display.SOUTH, Display.INFINITY);
      StreetCleaner s1 = new StreetCleaner(1, 8, Display.EAST, 0);
      StreetCleaner s2 = new StreetCleaner(1, 9, Display.EAST, 0);
      StreetCleaner s3 = new StreetCleaner(1, 10, Display.EAST, 0);
      StreetCleaner s4 = new StreetCleaner(1, 11, Display.EAST, 0);
      StreetCleaner s5 = new StreetCleaner(1, 12, Display.EAST, 0);
      StreetCleaner s6 = new StreetCleaner(1, 13, Display.EAST, 0);
   
      
      
      Thread t1 = new Thread (m1);
      Thread t2 = new Thread (m2);
      Thread t3 = new Thread (m3);
      Thread t4 = new Thread (p1);
      Thread t5 = new Thread (p2);
      Thread t6 = new Thread (p3);
      Thread t7 = new Thread (s1);
      Thread t8 = new Thread (s2);
      Thread t9 = new Thread (s3);
      Thread t10 = new Thread (s4);
      Thread t11 = new Thread (s5);
      Thread t12 = new Thread (s6);

      
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
      

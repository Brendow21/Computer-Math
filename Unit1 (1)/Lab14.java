//Lab 14
import edu.fcps.karel2.WorldFrame;
import edu.fcps.karel2.*;

public class Lab14
{
   public static void main(String[] args)
   {
      Display.setSize(10, 10);
      Display.setSpeed(10);
      WorldFrame.getCurrent().setLocation(0, 0);
   
      Swimmer s1 = new Swimmer(2);
      Swimmer s2 = new Swimmer(4);
      Swimmer s3 = new Swimmer(6);
      Swimmer s4 = new Swimmer(8);
      Thread t1 = new Thread(s1);
      Thread t2 = new Thread(s2);
      Thread t3 = new Thread(s3);
      Thread t4 = new Thread(s4);
      t1.start();
      t2.start();
      t3.start();
      t4.start();
   }
}
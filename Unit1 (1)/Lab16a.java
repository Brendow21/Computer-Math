//Lab 1a
import edu.fcps.karel2.WorldFrame;
import edu.fcps.karel2.*;

public class Lab16a
{
   public static void main(String[] args)
   {
      Display.setSize(10, 10);
      Display.setSpeed(10);
      Display.openWorld("maps/tree.map");
      WorldFrame.getCurrent().setLocation(0, 0);
      
      TreeTrimmer a = new TreeTrimmer(1, 1);
      TreeTrimmer b = new TreeTrimmer(2, 2);
      TreeTrimmer c = new TreeTrimmer(3, 3);
      TreeTrimmer d = new TreeTrimmer(4, 4);
      TreeTrimmer e = new TreeTrimmer(5, 5);
      TreeTrimmer f = new TreeTrimmer(6, 4);
      TreeTrimmer g = new TreeTrimmer(7, 3);
      TreeTrimmer h = new TreeTrimmer(8, 2);
      TreeTrimmer i = new TreeTrimmer(9, 1);
      
      Thread t1 = new Thread(a);
      Thread t2 = new Thread(b);
      Thread t3 = new Thread(c);
      Thread t4 = new Thread(d);
      Thread t5 = new Thread(e);
      Thread t6 = new Thread(f);
      Thread t7 = new Thread(g);
      Thread t8 = new Thread(h);
      Thread t9 = new Thread(i);
      
      t1.start();
      t2.start();
      t3.start();
      t4.start();
      t5.start();
      t6.start();
      t7.start();
      t8.start();
      t9.start();


}
}
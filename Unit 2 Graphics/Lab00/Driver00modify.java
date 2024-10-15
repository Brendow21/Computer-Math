import javax.swing.JFrame;
public class Driver00modify
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Lab00modify: Subway Graffiti");
      frame.setSize(800, 400);
      frame.setLocation(100, 50);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new Panel00modify());
      frame.setVisible(true);
   }
}
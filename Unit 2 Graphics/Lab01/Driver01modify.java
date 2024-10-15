import javax.swing.JFrame;
public class Driver01modify
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Build a House");
      frame.setSize(400, 425);
      frame.setLocation(100, 100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new Panel01modify());
      frame.setVisible(true);
   }
}
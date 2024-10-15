import javax.swing.JFrame;
public class Driver02a
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Lab02a");
      frame.setSize(400, 425);
      frame.setLocation(100, 100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new Panel02a());
      frame.setVisible(true);
   }
}
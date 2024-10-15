import javax.swing.JFrame;
public class Driver02b
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Lab02b");
      frame.setSize(600, 625);
      frame.setLocation(0, 0);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new Panel02b());
      frame.setVisible(true);
   }
}
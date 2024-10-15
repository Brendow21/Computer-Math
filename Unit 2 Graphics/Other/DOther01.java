import javax.swing.JFrame;
public class DOther01
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Cyber Truck");
      frame.setSize(600, 625);
      frame.setLocation(100, 100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new POther01());
      frame.setVisible(true);
   }
}
//Brendan Hom

   import javax.swing.JFrame;
    public class Driver14Modify
   {
       public static void main(String[] args)
      { 
         JFrame frame = new JFrame("Unit2, Lab14: Prize With Bumper");
         frame.setSize(400, 400);
         frame.setLocation(0, 0);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       	frame.setContentPane(new RandomBumperPanel());
         frame.setVisible(true);
      }
   }
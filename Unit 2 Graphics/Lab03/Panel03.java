//Name_ Brendan Hom Date 2/12/2020
/*Note that any comments in ALL CAPS represent code you need to add.
* DO NOT delete comments, add your related code directly underneath them!
*/
   
//import statements
import java.awt.*;
import javax.swing.JPanel;
import java.awt.image.BufferedImage;   //new import statement for BufferedImage
   
public class Panel03 extends JPanel
{
   /*Data field to represent size of the JPanel
   Declared as a constant (keyword: final) because it never
   changes*/
   private final int N = 400;
     
   //YOU DECLARE BUFFEREDIMAGE DATA FIELD
   private BufferedImage myImage;
      
   /*Panel03 - Default Constructor
   * BufferedImage will be linked to a Graphics object, Graphics object
   * will use Graphics methods to draw all graphics onto buffered image
   */  
   public Panel03()
   {
         
      //YOU INSTANTIATE BUFFEREDIMAGE
      myImage = new BufferedImage(N, N, BufferedImage.TYPE_INT_RGB);
      //YOU CREATE GRAPHICS OBJECT NAMED BUFFER
      Graphics buffer = myImage.getGraphics();
      //YOU SET GRAPHICS COLOR TO BLUE
      buffer.setColor(Color.BLUE);
   	//YOU DRAW RECTANGLE THAT COVERS ENTIRE BACKGROUND
      buffer.fillRect(0, 0, N, N);
      //YOU SET GRAPHICS COLOR TO YELLOW
      buffer.setColor(Color.YELLOW);
       	 
      //variable to use to change points in loop
      int a = 0;
      
      /*for loop for webbing, executes 51 times to make 51 lines
       in each corner*/
      for(int k = 0; k <= 50; k++)
      {
         //top right corner
         buffer.drawLine(a, 0, N, a);
         //YOU ADD CODE FOR BOTTOM RIGHT CORNER, USE N for 400
         buffer.drawLine(400, a, 400-a, 400);
         //YOU ADD CODE FOR TOP LEFT CORNER, USE N for 400
         buffer.drawLine(a, 0, 0, 400-a);
         //YOU ADD CODE FOR BOTTOM LEFT CORNER, USE N for 400
         buffer.drawLine(0, 400-a, 400-a, 400);
         //increase a by 8 to prepare for next iteration of for loop
         a += 8;
      }
      
      //YOU DRAW SUNSHINE
      
      for(int angle = 0; angle<360; angle+=30)
      {
         int x1 = (int)(200 + 100 * Math.cos(angle * Math.PI/180));
         int y1 = (int)(200 + 100 * Math.sin(angle * Math.PI/180));
         buffer.drawLine(200, 200, x1, y1);
      }
         
      buffer.setColor(Color.BLUE.brighter());
      buffer.fillOval(130, 130, 140, 140);
      buffer.setColor(Color.YELLOW);
      buffer.fillOval(135, 135, 130, 130);      
   }

   public void paintComponent(Graphics g)
   {
      //YOU DRAW BUFFERED IMAGE ON THE PANEL
      g.drawImage (myImage, 0, 0, getWidth(), getHeight(), null);
   }
   
}//end of panel03


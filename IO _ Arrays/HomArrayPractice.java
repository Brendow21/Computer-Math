  /************DIRECTIONS********************/
  //1. Rename the file, replacing YourLastName with your actual last name
  //2. Type your code UNDERNEATH each comment. DO NOT DELETE comments!!!
  //3. Compile and run frequently to check for errors and make sure it is working correctly.
  //4. When you are finished, email file to me with Subject: YourName Your Block ArrayPractice
  /*******************************************/   

//Name Brendan Hom BLOCK 5

import java.util.*;
import java.io.*;
public class HomArrayPractice
{
   public static void main(String[] args) 
   {
   //declare and instantiate an integer array named shoeSize to hold 10 integer values
   int[] shoeSize = new int[10];
   
   
   //set the last value in the shoeSize array to 7
   shoeSize[9] = 7;

   
   //under the following line of code, use the variable name to print the last value in the shoeSize array
      System.out.print("The last value in the shoesize array is: ");
      System.out.println(shoeSize[9]);
   
   
   
   /*under the following lines of code, print the LENGTH of the shoeSize 
   array using the data field named length*/
      System.out.println();
      System.out.print("The length of the shoeSize array is: ");
      System.out.println(shoeSize.length);
   
   
   /*declare an array named days. Use an INITIALIZER LIST to
     fill the array with the days of the week. Note that days of the week
     contain multiple characters so you must use the String data type. Strings have
     " " around them. Example: "Sunday"   */
     String[] days = {"\"Sunday\", \"Monday\", \"Tuesday\", \"Wednesday\", \"Thursday\", \"Friday\", \"Saturday\""};
   
   
   //now under the following lines of code, use a for loop to print the entire days array.
   //Print the array on one line, separated by a \. For example:
   // Sunday\Monday\Tuesday\etc.
      System.out.println();
      System.out.print("All of the values in the days array are: ");
      for(int x=0; x<days.length; x++)
      {
      System.out.print(days[x] + "\\");
      }
   
            
   //create an array with 5 spots that will have decimal values. Call the array favNums
   double[] favNums = new double[5];
   
   //Instantiate a Scanner object.   
   Scanner scan = new Scanner(System.in);
          	
   /*Under the following lines of code, use the Scanner above to set all slots of the favNums array equal to  
   	values entered into the keyboard*/
      System.out.println();
      for(int x=0; x<favNums.length; x++)
      {
      System.out.println("Enter values for favNums: ");
      favNums[x] = scan.nextDouble();
      }
   	
   
   //Use a for loop to print the entire favNums array .
   //Print the array on one line, separated by a tab. For example:
   // 5.2    2.6     etc.
      System.out.println();
      System.out.print("All of the values in the favNums array are: ");
      for(int x=0; x<favNums.length; x++)
      {
      System.out.print("\t" + favNums[x] + "\t");
      }
   
   
   //create an integer array called evens that has 50 slots
   int[] evens = new int[50];
   
   
   /*use a for loop to fill the entire evens array with integers 
   starting at 2 and counting up by 2s through 100. Ex 2, 4, etc 100
   Hint: you might need to create another variable before your loop*/   
   for(int x=0; x<evens.length; x++)
   {
   evens[x] = 2* (x+1);
   }
   
   
   //under the following lines of code, use a for loop to print the entire evens array.
   //Print each value on its own line
      System.out.println();
      System.out.println("All of the values in the evens array are: ");
      for(int x=0; x<evens.length; x++)
      {
      System.out.print(evens[x] + "\n");
      }
   
   
   }
}
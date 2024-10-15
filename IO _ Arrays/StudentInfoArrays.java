import java.util.Scanner;

public class StudentInfoArrays
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      //prompt user to decide how many students
      System.out.println("How many students?");
      int num = scan.nextInt();
      
      //creating 3 different arrays to store student info
      String[] name = new String[num];
      int[] grade = new int[num];
      double[] gpa = new double[num];
      
      //for loop to cactch user's input for num times
      for(int x = 0; x<num; x++)
      {
         System.out.println("Type your first name:");
         name[x] = scan.next();
      
         System.out.println("What is your gradelevel?");
         grade[x] = scan.nextInt();
      
         System.out.println("What is your GPA?");
         gpa[x] = scan.nextDouble();
      }
      
      //prompting output
         System.out.println("//////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
         System.out.println("==\t\tStudent Info\t\t==");
         System.out.println("//////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
         System.out.println("Name\t\tGrade Level\t\tGPA");
         System.out.println("----\t\t----------\t\t----");
      
         for(int y=0; y<num; y++)
         {
            System.out.println(name[y] + "\t\t\t" + grade[y] + "\t\t\t\t" +gpa[y]);
         }
      
      }
   }


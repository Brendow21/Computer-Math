import java.util.Scanner;

public class AvgGrade
{
 public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      //prompting input
      System.out.println("Enter your first name:");
      String name1 = scan.next();
      
      System.out.println("Enter Test Score 1?");
      int score1 = scan.nextInt();
      
      System.out.println("Enter Test Score 2?");
      int score2 = scan.nextInt();
      
      System.out.println("Enter Test Score 3?");
      int score3 = scan.nextInt();
      
      double avg = (score1+score2+score3)/3;
      
      
      
      
      //prompting output
      System.out.println("----\t----\t----\t----");
      System.out.println("----\tHello \t" + name1 + "\t----");
      System.out.println("----\t----\t----\t----");
      System.out.println("Your test average is " + avg);
      System.out.println("----\t----\t----\t----");
      
      //Finding letter grade
      if(avg >= 90)
      {
      System.out.println("Based on that average, your grade is: \nA");
      }
      else if(avg < 90 && avg >= 80)
      {
      System.out.println("Based on that average, your grade is: \nB");
      }
      else if(avg < 80 && avg >= 70)
      {
      System.out.println("Based on that average, your grade is: \nC");
      }
      else if(avg < 70 && avg >= 60)
      {
      System.out.println("Based on that average, your grade is: \nD");
      }
      else
      {
      System.out.println("Based on that average, your grade is: \nF");
      }

      
      }
}


import java.util.Scanner;

public class StudentInfo
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      //prompting user input and storing variables
      System.out.println("Type your first name:");
      String name1 = scan.next();
      
      System.out.println("What is your gradelevel?");
      int grade1 = scan.nextInt();
      
      System.out.println("What is your GPA?");
      double gpa1 = scan.nextDouble();
      
      System.out.println("Type your first name:");
      String name2 = scan.next();
      
      System.out.println("What is your gradelevel?");
      int grade2 = scan.nextInt();
      
      System.out.println("What is your GPA?");
      double gpa2 = scan.nextDouble();
      
      //prompting output
      System.out.println("//////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
      System.out.println("==\t\tStudent Info\t\t==");
      System.out.println("//////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
      System.out.println("Name]t]tGrade Level\t\tGPA");
      System.out.println("----\t\t----------\t\t----");
      System.out.println(name1 + "\t\t\t" + grade1 + "\t\t\t\t" +gpa1);
      System.out.println(name2 + "\t\t\t" + grade2 + "\t\t\t\t" +gpa2);

   }
}
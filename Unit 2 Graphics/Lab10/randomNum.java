public class randomNum
{
   public static void main(String[] args)
   {
      for(int i=1; i<=20; i++)
      {
         int n = (int)( Math.random()* 5+3);
      
         System.out.print(n + "  ");
      }
   }
}
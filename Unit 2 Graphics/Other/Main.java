public class Main
{
    private String str = "dog";

   /*Use public static void main() to replace the line below   
      outside of the CodeHS platform.*/
    public void run() 
    {
        Main m = new Main("cat");
        System.out.println(m.getString());
    }

    public Main(String str)
    {
        str = str;
    }

    public String getString()
    {
        return str;
    }
}
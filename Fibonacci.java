import java.util.Scanner;
public class Fibonacci {
    public static void main ( String args[])
    {
    int n, first = 0, second = 1;
    System.out.print("Enter the value for Fibonacci series : ");
    Scanner c = new Scanner(System.in);
    n = c.nextInt();
    System.out.println("Fibonacci Series Till " + n + " Terms :");
    for (int i = 1; i <= n; ++i)
     {
      System.out.print(first + ", ");
      int third = first + second;
      first = second;
      second = third;
     }
    }
    
}

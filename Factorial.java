import java.util.Scanner;
public class Factorial {
        public static void main(String[] args) {

        int n;
        System.out.print("Enter the value for Factorial : ");
        Scanner c = new Scanner(System.in);
        n = c.nextInt();
        int fact = 1;
        for(int i = 1; i <= n; ++i)
        {
           fact *= i;
        }
        System.out.printf("Factorial of %d = %d", n, fact);
    }
    
}

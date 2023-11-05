import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        int n, a, r, s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Value : ");
        n = sc.nextInt();
        System.out.print("\n");  
        a = n;
        while (a != 0)
        {
            r = a % 10;
            s += Math.pow(r, 3);
            a /= 10;
        }

        if(s == n)
        {
            System.out.println(n + " is an Armstrong number.");
        }
        else
        {
        System.out.println(n + " is not an Armstrong number.");        
        }
    }
    
}

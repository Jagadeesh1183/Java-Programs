import java.util.Scanner;

public class Prime {
    public static void main(String args[]) {
        int a;
        int condition = 0;
        System.out.print("Enter a Number : ");
        Scanner b = new Scanner(System.in);
        a = b.nextInt();
        if (a == 1)
            System.out.println("It is neither a prime number nor a composite number");
        else {
            for (int i = 2; i <= a / 2; ++i) {
                if (a % i == 0) {
                    condition = 1;
                    break;
                }
            }
            if (condition == 0)
                System.out.println("It is a Prime Number");
            else
                System.out.println("It is not a prime number");
        }
    }
}
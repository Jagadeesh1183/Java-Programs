import java.util.Scanner;
public class LimitDecimal {
    public static void main(String[] args) {
        double i;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        i = sc.nextDouble();
        System.out.print("Enter the Decimal Limit : ");
        n = sc.nextInt();
        System.out.print("Round off Value : ");
        System.out.format("%."+n+"f",i);
    }
    
}

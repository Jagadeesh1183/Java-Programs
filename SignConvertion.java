import java.util.Scanner;
public class SignConvertion {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Value for Sign Convertion : ");
        i = sc.nextInt();
        i = -i;
        System.out.println("Value after Sign Convertion : " + i);
    }
    
}

import java.*;
import java.util.Scanner;
public class ASCIIValue {
    public static void main(String[] args) {
        
        char i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character : ");
        i = sc.next().charAt(0);
        int asc = i;
        System.out.println("ASCII Value of Character "+ i + " is "+asc); 

    }
    
}

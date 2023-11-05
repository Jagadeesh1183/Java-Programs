import java.util.Scanner; 
public class SquareRoot {
    public static void main(String[] args) {
        double i,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Value for Square Root : ");
        i = sc.nextDouble();
        n=i;
        i = Math.sqrt(i); 
        int k = (int) n;
        System.out.println("Square Root of "+ k + " is "+i);
    }
}

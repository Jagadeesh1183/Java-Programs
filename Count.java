import java.util.Scanner;

public class Count {
    public static void main(String args[]) {
        int i, count = 0;
        System.out.print("Enter a Value : ");
        Scanner b = new Scanner(System.in);
        i = b.nextInt();
        while (i != 0) {
            i /= 10;
            ++count;
        }
        System.out.println("Count of a digits in the given value : " + count);
    }

}

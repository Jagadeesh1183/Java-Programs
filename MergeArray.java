import java.util.Scanner;

public class MergeArray {
    public static void main(String args[]) {
        int n;
        System.out.print("Enter a lenght of an array : ");
        Scanner b = new Scanner(System.in);
        n = b.nextInt();
        System.out.print("\n");

        int[] a1 = new int[20];
        int[] a2 = new int[20];
        System.out.println("Enter a values for First Array ");
        System.out.print("\n");

        for (int i = 0; i < n; i++) {
            System.out.print("Element Value on " + i + " Position of Array : "); 
            a1[i] = b.nextInt();
        }
        System.out.print("\n");
        System.out.println("Enter a values for Second Array ");
        System.out.print("\n");

        for (int j = 0; j < n; j++) {
            System.out.print("Element Value on " + i + " Position of Array : "); 
            a2[j] = b.nextInt();
        }
        System.out.print("\n");

        System.out.println("Merged Array : ");
        int c = n + n;
        int[] a3 = new int[20];
        for (int i = 0; i < c; i++) {

            a3[i] = a1[i];
        }
        for (int j = 0; j < c; j++) {
            a3[n + j] = a2[j];
        }
        for (int k = 0; k < c; k++) {
            System.out.println("- - - [ " + a3[k] + " ] - - -");
        }
    }
}

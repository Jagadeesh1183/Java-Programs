import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int n, p = 0, k = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        System.out.print("\n");
        System.out.print("\n");
        n = s.nextInt();
        int[] array = new int[10];
        int[] fin = new int[10];
        System.out.print("\n");
        System.out.println("Enter the elements of the array : ");
        System.out.print("\n");
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }
        System.out.print("\n");
        System.out.print("Array elements are : ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
        System.out.print("Reversed elements are : ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < n; i++) {
            p = array[i];
            k += p;
        }
        System.out.println("\n");
        System.out.println("Sum of Elements in the array : " + k);
        System.out.print("\n");
        System.out.print("Copy of an array : ");
        for (int i = 0; i < n; ++i) {
            fin[i] = array[i];
            System.out.print(fin[i] + " ");
        }
    }
}
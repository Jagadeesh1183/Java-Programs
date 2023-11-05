import java.util.Scanner;

public class MinMax {
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
            System.out.print("Element " + i + " Value : ");
            a1[i] = b.nextInt();
        }
        System.out.print("\n");
        System.out.println("Enter a values for Second Array ");
        System.out.print("\n");

        for (int j = 0; j < n; j++) {
            System.out.print("Element " + j + " Value : ");
            a2[j] = b.nextInt();
        }
        System.out.print("\n");

        int ma = a1[0], mi = a1[0];
        for (int i = 0; i < n; i++) {
            if (a1[i] > ma) {
                ma = a1[i];
            }
        }
        for (int j = 0; j < n; j++) {
            if (a1[j] < mi) {
                mi = a1[j];
            }
        }

        System.out.println("Maximum Value of an 1st Array : " + ma);
        System.out.println("Minimum Value of an 1st Array : " + mi);
        System.out.print("\n");

        int max = a2[0], min = a2[0];
        for (int i = 0; i < n; i++) {
            if (a2[i] > max) {
                max = a2[i];
            }
        }
        for (int j = 0; j < n; j++) {
            if (a2[j] < min) {
                min = a2[j];
            }
        }

        System.out.println("Maximum Value of an 2nd Array : " + max);
        System.out.println("Minimum Value of an 2nd Array : " + min);
    }

}

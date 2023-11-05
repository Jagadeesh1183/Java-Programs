import java.util.Scanner;

public class UniqueElement {
    public static void main(String args[]) {
        int n;
        System.out.print("Enter a lenght of an array : ");
        Scanner b = new Scanner(System.in);
        n = b.nextInt();
        System.out.print("\n");
        int[] array1 = new int[20];
        System.out.println("Enter a values for an Array ");
        System.out.print("\n");
        for (int i = 0; i < n; i++) {
            System.out.print("Element Value on " + i + " Position of Array : "); 
            array1[i] = b.nextInt();
        }
        System.out.print("\n");
        int[] array2 = new int[20];
        int index = 0;
        for (int i = 0; i < n; i++) {
            int flag = 0;
            for (int j = 0; j < i; j++) {
                if (array1[i] == array1[j]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                array2[index] = array1[i];
                index++;
            }
        }
        for (int i = 0; i < index; i++)
            System.out.print(array2[i] + " ");
    }
}

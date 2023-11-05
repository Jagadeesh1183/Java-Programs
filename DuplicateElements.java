import java.util.Scanner;
public class DuplicateElements {  
    public static void main(String[] args) {   
        int n; 
        int[] a1 = new int[10];
        System.out.print("Enter a lenght of an array : "); 
        Scanner s = new Scanner(System.in);
        n = s.nextInt();   
        System.out.print("\n");
        for (int i = 0; i < n; i++) {   
            System.out.print("Element Value on " + i + " Position of Array : "); 
             a1[i] = s.nextInt();    
        }  
        System.out.print("\n");
        System.out.print("Duplicate elements in given array: ");   
        for (int i = 0; i < n; i++) {   
            for (int j = i + 1; j < n; j++) {    
                if (a1[i] == a1[j])  
                    System.out.print(a1[j] + " ");    
            }   
        }  
    } 
}
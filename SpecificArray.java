import java.*;
import java.util.Scanner;
public class SpecificArray 
{
    public static void main(String[] args) 
    {
        int n,k,l,a,b;
        int[] a1 = new int [20];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Size of an Array : ");
        n = sc.nextInt();
        System.out.println("Enter a Elements of an Array : ");
        System.out.print("\n");
        for (int i = 0; i < n; i++) 
        {
            a1[i] = sc.nextInt();
        }
        System.out.print("\n");
        System.out.print("Array elements are : ");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(a1[i] + " ");
        }
        System.out.println("\n");
        System.out.print("Enter a Index Value For Inserting Value in Array : ");
        k = sc.nextInt();
        System.out.print("Enter a Value For Inserting Value in Array : ");
        l = sc.nextInt();
        for(int i=n+1;i>0;i--)
        {
            a1[i]=a1[i-1];
            if(i==k)
            {
                a1[i]=l;
                break;
            }
        }
        System.out.print("\n");
        System.out.print("Array elements are : ");
        for (int i = 0; i < n+1; i++)
        {
            System.out.print(a1[i] + " ");
        }
        System.out.println("\n");
        System.out.print("Enter a Index Value For Deleting Value in Array : ");
        a = sc.nextInt();
        for(int i=0;i<n;i++){
          if(i>=a){
            a1[i]=a1[i+1];
          }  
        }
        System.out.print("Array elements are : ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(a1[i] + " ");
        }
    }
}

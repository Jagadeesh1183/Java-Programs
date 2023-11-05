import java.util.Scanner;
public class HalfOrder 
{
    public static void main(String[] args) 
    {
        int len,temp=0;
        Scanner sc = new Scanner (System.in);
        System.out.print("\n"); 
        System.out.println("[ - - - Getting Array Length - - - ]");
        System.out.print("\n"); 
        System.out.print("Enter a length of an Array : ");
        len = sc.nextInt();
        int [] arr = new int [len];
        System.out.print("\n");
        System.out.println("[ - - - Getting Array Values - - - ]");
        System.out.print("\n");
        for ( int i=0; i<len;i++)
        {
            System.out.print("Element "+(i+1)+" of Array  : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("\n"); 

        // Full Ascending Order
        for (int i=0;i<len;i++)
        {
            for (int j=i+1;j<len;j++)
            {
                if ( arr[i]>=arr[j] )
                {
                    temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;
                }
            }
        }

        // Half Descending Order
        for (int i=len/2;i<len;i++)
        {
            for (int j=i+1;j<len;j++)
            {
                if ( arr[i]<=arr[j] )
                {
                    temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;
                }
            }
        }

        System.out.println("[ - - - Half Ordered Array - - - ]");
        System.out.print("\n"); 
        for ( int i=0; i<len;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");        
        System.out.print("\n"); 
    }
}

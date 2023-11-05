import java.util.Scanner;
public class NonPrimeIndex 
{
    public static void main(String args[]) 
    {
        int n,j,l,s=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Length of an Array : ");
        l=sc.nextInt();
        int fr=0;
        System.out.print("\n");
        int[] a1 = new int [20];
        System.out.println("Enter the Elements of an Array : " );
        System.out.print("\n");
        for (int i=0;i<l;i++)
        {
            a1[i] = sc.nextInt();
        } 
        for (int k = 2; k < l; k++) 
        {     fr=0;
         for(int i=2;i<=k/2;i++){
            if (k% i == 0) 
            {
               fr=-1;
            }
               }  
               
               if(fr==0)
               {
                             
               }
               else
               {
                s+=a1[k]; 
               } 
        }
        System.out.print("\n");
        System.out.println("Sum of Non Prime Index Values : "+s);
    }
    }

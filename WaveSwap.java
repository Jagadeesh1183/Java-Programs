import java.util.Scanner;
public class WaveSwap {
    public static void main(String[] args) {
        int [] arr = new int [40];
        int [] arr2 = new int [40];
        int len,k=1,temp=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Array Length : ");
        len = sc.nextInt();
        System.out.print("\n");
        System.out.println(" - - - Getting Array Values - - - ");
        System.out.print("\n");
        for (int i=0;i<len;i++)
        {
            System.out.print("Array "+i+" : ");
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<len;j=j+2)   
        {
            if (j==len-1)
            {
                arr2[j-1]=arr[j];
                arr2[j]=arr[j-2];
            }
            else
            {
            arr2[j]=arr[k]; 
            temp=k;
            k=j;
            j=temp;
            arr2[j]=arr[k];
            k=k+2;
            }
        }
        System.out.print("\n");
        System.out.println(" - - - Swapped Array Values - - - ");
        System.out.print("\n");
        for (int o=0;o<len;o++)
            {
                System.out.println("Array "+o+" Element : "+arr2[o]);
            }
    }
}

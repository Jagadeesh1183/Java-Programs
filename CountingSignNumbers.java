import java.util.Scanner;
public class CountingSignNumbers {
    public static void main(String[] args) 
    {
        int a,b=0,c=0,len;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Size of Array : ");
        len=sc.nextInt();
        int[] arr = new int [20];
        for(int i=0;i<len;i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int j=0;j<len;j++)
        {
            if (arr[j]>0)
            {
                c++;
            }
            else
            {
                b++; 
            }
        }
        System.out.print("\n");
        System.out.println("Count of Positive Numbers : "+c);
        System.out.print("\n");
        System.out.println("Count of Negative Numbers : "+b);

    }
    
}

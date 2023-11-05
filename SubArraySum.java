import java.util.Scanner; 
public class SubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n");
        System.out.println(" - - - Gettting Array Length From User - - - ");
        System.out.print("\n");
        System.out.print("Enter the Array Length : ");
        int len = sc.nextInt(); 
        System.out.print("\n");
        System.out.println(" - - - Gettting Array Values - - - ");
        System.out.print("\n");
        int sum=0;
        int [] arr = new int [50];
        for (int i=0;i<len;i++)
        {
            System.out.print("Array Element "+i+" : ");
            arr[i]=sc.nextInt();
        }
        System.out.print("\n");
        System.out.println(" - - - Gettting Index Position For Adding - - - ");
        System.out.print("\n");
        System.out.print("Starting Index Position For Adding     : ");
        int n = sc.nextInt();
        System.out.print("Ending Index Position For Adding       : ");
        int s = sc.nextInt();
        for (int j=n;j<=s;j++)
        {
            sum +=arr[j]; 
        }
        System.out.print("\n");
        System.out.println("SubArray Sum Of Index Positions "+n+" and "+s+" : "+sum);
    }    
}

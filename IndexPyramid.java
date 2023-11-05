import java.util.Scanner;
public class IndexPyramid {
    public static void main(String[] args) {
        int len,k=0,s=0,q=0,m=1;
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        str = sc.nextLine();
        len = str.length();
        char [] arr = str.toCharArray();
        for ( int i =0 ;i<len;i++) 
        {
            while (q<=i)
        {
        for (int j=q;j<=k+i;j++)
            {
                System.out.print(arr[j]+" ");
            }
            k++;
            System.out.print("\n");
            q=q+m;
            m++;
        }
    }
        
    }
}

import java.util.Scanner;
public class RemoveRepeated 
{
    public static void main(String[] args) 
    {
        int count=0;
        String str;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a String : ");    
        str = sc.nextLine();
        char [] arr = str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            for ( int j=i+1;j<arr.length;j++)
            {
                if (arr[i]==arr[i+1])
                {
                   count++;
                   i++;
                }
                }
            if (count==0)
            {
                System.out.print(arr[i]+" ");
            }
            count=0;
        }
    }
    
}

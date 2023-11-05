import java.util.*;
public class MovingArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);        
        System.out.print("\n");
        System.out.println(" - - - Enter strings for array - - - ");
        String str ="";
        System.out.print("\n");
        System.out.print("Enter a length of an array : ");
        int len = sc.nextInt();
        System.out.print("\n");
        String [] arr = new String [len];
        for (int i=0;i<len;i++)
        {
            arr[i]=sc.next();
        }
        System.out.print("\n");
        System.out.print("Enter a value ( 0 or 1 ) : ");
        int num = sc.nextInt();
        System.out.print("\n");
        if (num == 0 || num == 1)
        {
            if (num==1)
            {
                str=arr[0];
                for (int i=0;i<len;i++)
                {
                    if(i==(len-1))
                    {
                        arr[i]=str;
                    }
                    else
                    {
                        arr[i]=arr[i+1];
                    }
                }
                for (int i=0;i<3;i++) 
                {
                    System.out.println(arr[i]); 
                }
            }
            else
            {
                for (int i=len-1;i>=0;i--) 
                {
                    System.out.println(arr[i]); 
                }
            }
            System.out.print("\n");
        }
        else
        {
            System.out.println(" - - - You have entered a wrong value - - - ");
            System.out.print("\n");
        }      
    }
}
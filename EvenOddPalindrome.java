import java.util.*;
public class EvenOddPalindrome
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine(); 
        int len = str.length();
        String oddword="",evenword="",rev="",ver="";
        int od=0,j=1;
        if(len==2)
        {
            System.out.println("You have entered only two characters");
        }
        else
        {
            if (len%2==0)
            {
                char [] arr = new char [len];
                for (int i=0;i<len;i++)
                {
                    arr[i]=str.charAt(i);
                }
                int length = len/2;
                char [] odd = new char [length];
                char [] even = new char [length];
                for (int i=0;i<length;i++)
                {
                    even[i]=str.charAt(j);
                    evenword += even[i];  
                    j+=2;
                }
                j=0;
                for (int i=0;i<length;i++)
                {
                    odd[i]=str.charAt(j);
                    oddword += odd[i]; 
                    j+=2;
                }
                for (int i=(length-1);i>=0;i--)
                {
                    rev+=oddword.charAt(i);
                    ver+=evenword.charAt(i);
                }
                if (oddword.equals(rev) && evenword.equals(ver) )
                {
                    od++;
                }
                if (od!=0)
                {
                    System.out.println("YES");
                }
                else
                {
                    System.out.println("NO");
                }
            }
            else
            {
                System.out.println("You have entered String with Odd Count");
            }
        }
    }
}
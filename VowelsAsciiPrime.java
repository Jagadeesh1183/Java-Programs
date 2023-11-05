import java.util.Scanner;
public class VowelsAsciiPrime
{
    public static void main(String[] args) 
    {
        String ch ;
        int a,condition=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        ch = sc.nextLine();
        int len = ch.length();
        System.out.println("Vowel Characters in the Given String : "); 
        System.out.print("\n");
        for (int i=0;i<len;i++)
        {
            char s = ch.charAt(i);
            if(s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u'|| s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U')
            {
                a = (int) s;
                for (int j = 2; j <= a / 2; ++j) 
                {
                    if (a % j == 0) 
                    {
                        condition = 1;
                        break;
                    }
                }
                if (condition == 0)
                {
                    System.out.println("Ascii value of "+s+" is "+a);
                    System.out.println("Ascii Value of "+s+" is Prime");
                    System.out.print("\n");
                }
            }
        }
    }
}

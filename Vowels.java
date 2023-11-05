import java.util.Scanner;
public class Vowels 
{
    public static void main(String[] args) 
    {
        String ch ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        ch = sc.nextLine();
        int len = ch.length();
        System.out.println("Vowel Characters in the Given String : "); 
        for (int i=0;i<len;i++)
        {
            char s = ch.charAt(i);
            if(s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u'|| s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U')
            {
                System.out.print(s+" ");
            }
        }
    }
}

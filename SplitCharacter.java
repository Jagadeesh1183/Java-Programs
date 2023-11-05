import java.util.Scanner;
public class SplitCharacter 
{
    public static void main(String[] args) 
    {
        String ch ,bh="",dh="",sh="",nh="";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        ch = sc.nextLine();
        int len = ch.length();
        for (int i=0;i<len;i++)
        {
            char s = ch.charAt(i);
            if(s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u'|| s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U')
            {
                
                bh=bh+s+",";
            }
            else if (s == '!' || s == '@' || s == '#' || s == '$' || s == '%' || s == '^' || s == '&' || s == '*' || s == '(' || s == ')' || s == '-' || s == '_' || s == '=' || s == '+' || s == '{' || s == '[' || s == '}' || s == ']' || s == ';' || s == ':' || s == '"' || s == ',' || s == '<' || s == '.' || s == '>' || s == '/' || s == '?' )
            {
                dh=dh+s+",";            }
            else if ( s == '0' || s == '1' || s == '2' || s == '3' || s == '4' || s == '5' || s == '6' || s == '7' || s == '8' || s == '9')  
            {
                nh=nh+s+","; 
            }  
            else
            {
                sh=sh+s+",";            } 
        }
        System.out.print("Vowels in the Given String : ");
        System.out.println(bh+" ");
        System.out.print("\n");
        System.out.print("Special Characters in the Given String : ");
        System.out.println(dh+" ");
        System.out.print("\n");
        System.out.print("Constants in the Given String : ");
        System.out.println(sh+" ");
        System.out.print("\n");
        System.out.print("Numbers in the Given String : ");
        System.out.println(nh+" ");
        System.out.print("\n");
    }
} 
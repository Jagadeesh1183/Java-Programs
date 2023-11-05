import java.util.Scanner; 
public class CountsofVowels  
{  
    public static void main (String args[])  
        {    
            String ch;
            int len=0,count=0,con=0;
            Scanner sc = new Scanner(System.in); 
            System.out.print("Enter a String : ");
            ch = sc.nextLine();
            System.out.print("\n");
            char arr[] = ch.toCharArray();
            len = arr.length;
            System.out.print("Vowels : ");
            for (int i=0;i<len;i++)
            {
                char s = ch.charAt(i);
                if(s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u'|| s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U')
                {
                    count++;
                    System.out.print(s+" ");
                }
            }
            System.out.print("\n");
            System.out.print("Consonants : ");
            for (int i=0;i<len;i++)
            {
                char s = ch.charAt(i);
                if(s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u'|| s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U')
                {

                }
                else 
                {
                    con++; 
                    System.out.print(s+" "); 
                }
            }                    
            System.out.print("\n");
            System.out.print("\n");
            System.out.println("Vowels Count : " + count);
            System.out.println("Consonants Count : " + con);
    }  
}  
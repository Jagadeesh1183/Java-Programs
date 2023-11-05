import java.util.Scanner;
public class AlphabetPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        int add=0,sub=0,ch=0,ab=1;
        char [] arr = str.toCharArray();
        for ( int i=0;i<arr.length;i++)
        {
            char s = arr[i];
            if (s == 'a'|| s=='i' ||s == 'e'|| s=='u' ||s == 'o')
            {
                ch = s-96;
                add += ch;
            }
            else if (s=='O' ||s == 'A'|| s=='I' ||s == 'E'|| s=='U' )
            {
                ch = s-64;
                add += ch;
            }
            else if (ab!=0)
            {
                ch=s;
                if (ch<91)
                {
                    ch-=64;
                    sub+=ch;
                }
                else if (ch<123)
                {
                    ch-=96;
                    sub+=ch;
                }
            }
            }
        System.out.println("Addition of Vowels Alphabet Position : "+add);
        System.out.println("Addition of Consonants Alphabet Position : "+sub);

    }}


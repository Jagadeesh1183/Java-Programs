import java.util.Scanner; 
public class Nterms
{
    public static void main(String[] args) 
    {
        int a=1,i,sum=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number for Sequence : ");
        i = sc.nextInt();
        while(a<=i)
        {
            System.out.print(sum+" ");
            sum=2*sum;
            a++;
        }
    }
}
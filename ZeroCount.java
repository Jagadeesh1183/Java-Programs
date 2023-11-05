import java.util.Scanner;
public class ZeroCount 
{
    public static void main(String[] args) 
    {
        int a,fact=1,c,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        a=sc.nextInt();
        for(int i = 1; i <= a; ++i)
        {
           fact *= i;
        }
        System.out.printf("Factorial of %d = %d", a, fact);
        while(fact!=0)
        {
            c=fact%10;
            if (c==0)
            {
                count++;
            }
            fact/=10;
        }
        System.out.print("\n");
        System.out.println("Number of 0's in Factorial Value : "+count);
    }
}

import java.util.Scanner; 
public class CheckingBinary 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n");
        System.out.println(" - - - Gettting Value From User - - - ");
        System.out.print("\n");
        System.out.print("Enter a Number : ");
        int i = sc.nextInt();
        System.out.print("\n");
        int k,j=1;
        while (i!=0)
        {
            k=i%10;
            if (k==0 || k==1)
            {
                j=1;
                i/=10;
            }
            else 
            {
                j=0;
                break;
            }

        }
        if (j==1)
        {
            System.out.println("True, It is a Binary Number ");
        }
        else
        {
            System.out.println("False, It is not a Binary Number ");
        }
    }
}

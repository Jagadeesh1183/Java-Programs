import java.util.Scanner; 
public class TechNumber 
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
        int j,k,l;
        j=i%100;
        k=i/100;
        l=k+j;
        j=l*l;
        if (j==i)
        {
            System.out.println("< --- It is a Tech Number --- >");
        }
        else
        {
            System.out.println("< --- It is a Not Tech Number --- >");
        }
    }
}
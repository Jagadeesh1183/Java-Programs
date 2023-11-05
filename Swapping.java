import java.util.Scanner;
public class Swapping 
{
    public static void main(String[] args) 
    {
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Value 1 : ");
        i = sc.nextInt();
        System.out.print("Enter a Value 2 : ");
        j = sc.nextInt();
        System.out.print("\n");
        i=i+j;
        j=i-j;
        i=i-j;
        System.out.println(" - - - Swapped Values - - - ");
        System.out.print("\n");
        System.out.println("Value 1 : " + i);
        System.out.println("Value 2 : " + j);
    }
    
}

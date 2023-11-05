import java.util.Scanner;
public class SquareorCube 
{
    public static void main(String[] args) 
    {
    double n;
    char i;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number : ");
    n = sc.nextDouble();
    System.out.println("Do You Want To Square or Cube ? ");
    System.out.println("Square [ Option y ]       |       Cube [ Option n ]");
    System.out.print("Enter Your Choice : ");
    i = sc.next().charAt(0);
    int k = (int) n;
    switch (i) 
    {
        case 'y' :
            n=Math.pow(n, 2);           
            System.out.println("Square of "+k+" is "+n);
            break;
        case 'n' :
            n=Math.pow(n, 3);
            System.out.println("Cube of "+k+" is "+n);
            break;
        default:
            System.out.println("Your Input Is Wrong");
            break;
    }
    } 
}

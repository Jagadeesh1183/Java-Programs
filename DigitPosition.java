import java.util.Scanner;
public class DigitPosition
{
    public static void main(String[] args) 
    {
        int i,i1,i2,i3;
        Scanner sc = new Scanner(System.in);
        System.out.println(" - - - You Must Enter Three Digit Values - - - ");
        System.out.print("\n");
        System.out.print("Enter a Value for Test Condition : ");
        i = sc.nextInt();
    
        switch (i) 
        {
            case 0:

                int j,k,l,p;
                System.out.print("Enter a Value for Input 1 : ");
                i1 = sc.nextInt();
                System.out.print("Enter a Value for Input 2 : ");
                i2 = sc.nextInt();
                System.out.print("Enter a Value for Input 3 : ");
                i3 = sc.nextInt();
                j=i1%10; k=i2%10; l=i3%10;
                p=l+j+k; 
                System.out.print("\n");
                System.out.println("Addition of One's Digits : "+ p);
                break;

           case 1: 

                int e,f,g,h,m,n,o; 
                System.out.print("Enter a Value for Input 1 : ");
                i1 = sc.nextInt();
                System.out.print("Enter a Value for Input 2 : ");
                i2 = sc.nextInt();
                System.out.print("Enter a Value for Input 3 : ");
                i3 = sc.nextInt();
                e = i1%100; f=i2%100; g=i3%100; 
                h=e/10; m=f/10; n=g/10; 
                o=h+m+n;
                System.out.print("\n");
                System.out.println("Addition of Ten's Digits : "+ o); 
                break;

            case 2:

                int a,b,c,d;
                System.out.print("\n");
                System.out.print("Enter a Value for Input 1 : ");
                i1 = sc.nextInt();
                System.out.print("Enter a Value for Input 2 : ");
                i2 = sc.nextInt();
                System.out.print("Enter a Value for Input 3 : ");
                i3 = sc.nextInt();
                a=i1/100; b=i2/100; c=i3/100;
                d=a+b+c;
                System.out.print("\n");
                System.out.println("Addition of Hundred's Digits : "+ d);
                break;
                
            default:

                System.out.println(" - - - Your Input is Wrong - - - ");
                break;
        }
    }
    
}
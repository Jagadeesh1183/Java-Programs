import java.util.Scanner;
public class NeonNumber {
    public static void main(String[] args) {
        int i,l,sum=0,len;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        i = sc.nextInt();
        len=i;
        i=i*i;
        while (i!=0)
        {
            l=i%10;
            i=i/10;
            sum += l;  
        }
        if (len==sum)
        {
            System.out.println("True, It is Neon Number");
        }
        else 
        {
            System.out.println("False, It is not a Non Neon Number");
        }

    }

    
}

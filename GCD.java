import java.util.Scanner;

public class GCD 
{
    public static void main(String[] args) 
    {
        int n1,n2,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Value 1 : ");
        n1 = sc.nextInt();
        System.out.print("Enter a Value 2 : ");
        n2 = sc.nextInt();
        System.out.print("\n");  
        i=n1;
        j=n2;
        while(n1!=n2)   
        {  
        if(n1>n2)  
            {
             n1=n1-n2;     
            }
            else
            {  
             n2=n2-n1;  
            }  
        }
        System.out.println("GCD of " +i + " and "+j+ " is: " +n2);  
    }  
}      
    

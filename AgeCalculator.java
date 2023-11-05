import java.util.Scanner;
public class AgeCalculator
{
    public static void main(String[] args) 
    { 
        int date,month,year,da,mon,yr,days=0,months=0,years=0;
        Scanner sc = new Scanner(System.in);
        System.out.println(" - - - Enter your Date of Birth - - - ");
        System.out.print("\n"); 
        System.out.print("Date  : ");
        date = sc.nextInt();
        System.out.print("Month : ");
        month = sc.nextInt();
        System.out.print("Year  : ");
        year = sc.nextInt();     
        System.out.print("\n"); 
        System.out.println(" - - - Enter the Current Date - - - ");
        System.out.print("\n"); 
        System.out.print("Date  : ");
        da = sc.nextInt();
        System.out.print("Month : ");
        mon = sc.nextInt();
        System.out.print("Year  : ");
        yr = sc.nextInt(); 
        System.out.print("\n"); 
        years = yr - year;
        if (month == mon)
        {
            if ( da == date)
            {
                System.out.println("You are "+years+" Years Old");
            }
            else if (date<da)
            {
                System.out.println("You are "+years+" Years Old");
            }
            else if (date > da)
        
            {
                years-=1;  
                System.out.println("You are "+years+" Years Old");
            }
        }
        else if( month > mon)
        {
            years-=1;
            System.out.println("You are "+years+" Years Old"); 
 
        } 
        else
        {
            System.out.println("You are "+years+" Years Old");    

        }
    }
}
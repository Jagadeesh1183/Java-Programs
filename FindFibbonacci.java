import java.util.Scanner;
public class FindFibbonacci 
{
    public static void main(String[] args) 
    {
        int a,start=0,end=1,next=0;
        Scanner sc = new Scanner (System.in);
        System.out.print("\n");
        System.out.print("Enter a Number : ");
        a = sc.nextInt();
        int [] arr = new int [100];
        System.out.print("\n");
        for (int i=0;i<100;i++)
        {
            arr[i]=start; 
            next = start + end;
            start = end;
            end = next;  
        }       
        for (int k=0;k<100;k++)
        {
            if (arr[k]==a)
            {
                System.out.println(" - - - It is a Fibbonacci Number - - - "); 
                System.out.print("\n");
            }
        } 
    }
}
 
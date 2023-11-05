import java.util.Scanner;
public class MagicSquareMatxix 
{
    public static void main(String[] args) 
    {
        int [][] arr = new int [3][3];
        Scanner sc = new Scanner (System.in);
        System.out.println(" - - - Getting Array Elements - - - ");
        System.out.print("\n");
        int m=0,n=0,o=0,p=0,count=0;
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print("Array Element of ["+(i+1)+"] ["+(j+1)+"] : ");
                arr[i][j] = sc.nextInt(); 
            }
            System.out.print("\n");
        }
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                m = arr[j][i];
                o = arr[i][j];
                n+=m;
                p+=o;
            } 
            if (n+p==30)
            {
               count++; 
            }
            n=0;p=0;
        }
        if (count==3)
        {
            System.out.println(" - - - It is a Magic Square Matrix - - - ");
        }
        else if (count!=3)
        {
            System.out.println(" - - - It is not a Magic Square Matrix - - - ");
        }
    }
    
}

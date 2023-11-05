import java.util.Scanner;
public class Matrix {
    public static void main(String args[])
    {
        int i,m,n,p,q;
        Scanner Sc=new Scanner(System.in);
        System.out.print("No. of Elements in 1st Matrix Row : ");
        p=Sc.nextInt();
        System.out.print("No. of Elemnts in 1st Matrix Column : ");
        q=Sc.nextInt();
        System.out.print("No. of Elements in 2nd Matrix Row : ");
        m=Sc.nextInt();
        System.out.print("No. of Elements in 2nd Matrix Column : ");
        n=Sc.nextInt(); 
        int a[][]= new int[p][q];
        int b[][]= new int[m][n];
        int c[][]= new int[m][n];
        int d[][]= new int[m][n];   
        int transpose[][]=new int[m][n];
        int original[][]=new int[c.length][c.length];
            
        System.out.print("\n");    
        System.out.println("Enter the Elements for 1st Matrix : ");
        System.out.print("\n");
            for(i=0;i<p;i++)
            {
            for(int j=0;j<q;j++)
            {
              a[i][j]=Sc.nextInt();
            }
            }
            System.out.print("\n");
            System.out.println("Enter the Elements for 2nd Matrix");
            System.out.print("\n");
            for(i=0;i<p;i++){

            for(int j=0;j<q;j++)
            {
                b[i][j]=Sc.nextInt();
            }
            }   
                 System.out.print("\n");
                 System.out.println("Elements of 1st Matrix : ");
                 System.out.print("\n");
                for(i=0;i<p;i++)
                {
            for(int j=0;j<q;j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
            System.out.print("\n");
            System.out.println("Elements of 2nd Matrix : ");
            System.out.print("\n");
                for(i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(b[i][j]+"  ");
            }
            System.out.println();           
            }
            for(i=0;i<p;i++)
            {
                for(int j=0;j<q;j++)
                {
                    for(int k=0;k<q;k++)
                    {
                        c[i][j]=a[i][j]+b[i][j];
                    }
                }
        }
        System.out.print("\n");
        System.out.println("Matrix after Addition : ");
        System.out.print("\n");
        for (i = 0; i < p; i++) 
        {
            for (int  j = 0; j < n; j++) 
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.print("\n");
        System.out.println("Matrix Multiplication : ");
        System.out.print("\n");
        for(i=0;i<p;i++)
            {
                for(int j=0;j<q;j++)
                {
                    d[0][0]=0;
                    for(int k=0;k<q;k++)
                    {
                        d[i][j]+=a[i][k]*b[k][j];
                    }
                    System.out.print(d[i][j]+" ");
                }
                System.out.println();
            }
    for(i=0;i<2;i++)
    {
        for(int j=0;j<2;j++)
        {
            original[i][j]=c[i][j];
        }
    }
    System.out.print("\n");
    System.out.println("Transpose of Addition Matrix : ");    
    System.out.print("\n");        
    for(i=0;i<2;i++)
    {
        for(int j=0;j<2;j++)
        {
            transpose[i][j]=original[j][i];
            System.out.print(transpose[i][j]+" ");
        }
        System.out.println("");
    } 
    }
} 
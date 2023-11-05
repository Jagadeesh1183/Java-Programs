import java.util.*;
class NambiarNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 10 Digit Number : ");
        String num = sc.nextLine();
        int count=0,sum5=0,sum2=0,sum3=0,last=0,j=0,no=0,con=0;
        char ch;
        char [] arr = new char [10];
        if (num.length()==10)
        {
            
            for(int i=0;i<10;i++)
            {
                arr[i]=num.charAt(j);
                j++;
            }
            for(int i=0;i<5;i++)
            {
                ch = arr[i];
                no = Integer.parseInt(String.valueOf(ch));
                sum5+=no;
            }
            for(int i=5;i<7;i++)
            {
                ch = arr[i];
                no = Integer.parseInt(String.valueOf(ch));
                sum2+=no;
            }
            con=sum2;
            while (con!=0)
            {
                con/=10;
                count++;
            }
            con=sum2;
            if (count==2)
            {
                con/=10;
                ch = arr[8];
                no = Integer.parseInt(String.valueOf(ch));
                sum3=(sum2%10)+no;
                sum2=con;
                for(int i=8;i<=9;i++)
                {
                    ch = arr[i];
                    no = Integer.parseInt(String.valueOf(ch));
                    last+=no;
                }
            }
            else
            {
                for(int i=7;i<9;i++)
                {
                    ch = arr[i];
                    no = Integer.parseInt(String.valueOf(ch));
                    sum3+=no;
                }
                ch = arr[9];
                last = Integer.parseInt(String.valueOf(ch));
            }
            System.out.print(sum5);
            System.out.print(sum2);
            System.out.print(sum3);
            System.out.print(last);
            System.out.print("\n");
        }
    }
}
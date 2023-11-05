import java.util.*;
public class ConfusingNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n");
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        System.out.print("\n");
        int swap=0,count=0,ConfusingNumber=0,numcopy=0,first=0,last=0,mid=0;
        if (num == 6 || num == 9 || num == 10 || num == 16 || num == 18 || num == 19 || num == 60 || num == 61 || num == 66 || num == 68 || num == 80 || num == 81 || num == 86 || num == 89 || num == 90 || num == 91 || num == 98 || num == 99 || num == 100)
        {
            numcopy = num;
            while(numcopy!=0)
            {
                count++;
                numcopy/=10;
            }
            if (count==1)
            {
                if (num==6)
                {
                    ConfusingNumber = 9;
                    System.out.println("Confusing Number of "+num+" is "+ConfusingNumber);
                }
                else
                {
                    ConfusingNumber = 6;
                    System.out.println("Confusing Number of "+num+" is "+ConfusingNumber);
                }
            }
            else if (count == 2)

            {
                last=num%10;
                first= num/10;
                swap=first;
                first=last;
                last=swap;
                if (first!=0)
                {
                    if (first == 6)
                    {
                        first=9;
                    }
                    else if (first == 9)
                    {
                        first=6;
                    }
                }
                else if (last!=0)
                {
                    if (last == 6)
                    {
                        last=9;
                    }
                    else if (last == 9)
                    {
                        last=6;
                    }
                }
                ConfusingNumber=last+(first*10);
                System.out.println("Confusing Number of "+num+" is "+ConfusingNumber);
            }
            else if (count==3)
            {
                last=num%10;
                first=num/100;
                numcopy=num%100;
                mid=numcopy/10;
                swap=first;
                first=last;
                last=swap;
                ConfusingNumber=(first*100)+(mid*10)+last;
                System.out.println("Confusing Number of "+num+" is "+ConfusingNumber);
            }
            System.out.print("\n");
        }
        else 
        {
            if(num>100)
            {
                System.out.println("- - - You are exceeding the limit [ Limit is upto 100 ] - - -"); 
            }
            else
            {
                System.out.println(num+" is not a Confusing Number ");
            }
            System.out.print("\n");
        }
    }
}

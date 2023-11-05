import java.util.*;
public class PINGenerate {
    public static void main(String[] args) {
    int PIN,d1=0,d2=0,d3=0,d4=0,i1=0,i2=0,i3=0,k1=0,k2=0,k3=0,input1,input2,input3;
    Scanner sc = new Scanner(System.in);
    System.out.println(" - - - Getting Values From The User - - - ");
    System.out.print("\n");
    System.out.print("Enter a Value 1 : ");
    input1 = sc.nextInt();
    System.out.print("Enter a Value 2 : ");
    input2 = sc.nextInt();
    System.out.print("Enter a Value 3 : ");
    input3 = sc.nextInt();
    System.out.print("\n");

    if(input1%10<=input2%10)
        {
            if(input1%10<=input3%10)
            {
                d4=input1%10;
            }
            else
            {
                d4=input3%10;
            }
        }
        else if (input1%10>=input2%10)
        {
            if(input2%10<=input3%10)
            {
                d4=input2%10;
            }
            else
            {
                d4=input3%10;
            }
        }
        if(input1/100<=input2/100)
        {
            if(input1/100<=input3/100)
            {
                d2=input1/100;
            }
            else
            {
                d2=input3/100;
            }
        }
        else if (input1/100>=input2/100)
        {
            if(input2/100<=input3/100)
            {
                d2=input2/100;
            }
            else
            {
                d2=input3/100;
            }
        }
        i1=input1%100;
        i2=input2%100;
        i3=input3%100;
        if(i1/10<=i2/10)
        {
            if(i1/10<=i3/10)
            {
                d3=i1/10;
            }
            else
            {
                d3=i3/10;
            }
        }
        else if (i1/10>=i2/10)
        {
            if(i2/10<=i3/10)
            {
                d3=i2/10;
            }
            else
            {
                d3=i3/10;
            }
        }
        //Digit1 Value Finding
        if(input1%10<=input2%10)
        {
            if(input2%10<=input3%10)
            {
                k3=input3%10;
            }
            else
            {
                k3=input2%10;
            }
        }
        else if (input1%10>=input2%10)
        {
            if(input1%10<=input3%10)
            {
                k3=input3%10;
            }
            else
            {
                k3=input1%10;
            }
        }
        if(input1/100<=input2/100)
        {
            if(input2/100<=input3/100)
            {
                k2=input3/100;
            }
            else
            {
                k2=input2/100;
            }
        }
        else if (input1/100>=input2/100)
        {
            if(input1/100<=input3/100)
            {
                k2=input3/100;
            }
            else
            {
                k2=input1/100;
            }
        }
        if(i1/10<=i2/10)
        {
            if(i2/10<=i3/10)
            {
                k1=i3/10;
            }
            else
            {
                k1=i2/10;
            }
        }
        else if (i1/10>=i2/10)
        {
            if(i1/10<=i3/10)
            {
                k1=i3/10;
            }
            else
            {
                k1=i1/10;
            }
        }
        if(k1<=k2)
        {
            if(k2<=k3)
            {
                d1=k3;
            }
            else
            {
                d1=k2;
            }
        }
        else if (k1>=k2)
        {
            if (k1>=k3)
            {
                d1=k1;
            }
            else
            {
                d1=k3;
            }
        }
        PIN=d1*1000+d2*100+d3*10+d4;
        System.out.println(" - - - Generating PIN - - - ");
        System.out.print("\n");
        System.out.println("Your PIN : "+PIN);
    }
}


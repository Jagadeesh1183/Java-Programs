import java.util.Scanner;  
public class SumOfDigits   
{  
public static void main(String args[])  
{  
int n, a, sum = 0;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number: ");  
n = sc.nextInt();  
while(n > 0)  
{  
a = n % 10;  
sum = sum + a;  
n = n / 10;  
}  
System.out.println("Sum of Digits: "+sum);  
}  
} 
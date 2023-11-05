import java.util.Scanner;
class ajai{
    int rec(int i){
        int a,sum=0;
        while ( i!=0)
        {
            a = i % 10;
            sum = sum + a;
            i = i/10;
        }
        return sum;
    }
}
public class SingleDigit {
    public static void main(String[] args) {
        int i,sum = 0;
        ajai vi=new ajai();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Value = ");
        i = sc.nextInt();
        sum=i;
        while (sum>10)
        {
            sum= vi.rec(sum);
        } 
        System.out.println("Sum of Digits into Single Digits : "+ sum );
      }
}
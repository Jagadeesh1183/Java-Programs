import java.util.Scanner;
public class StringReverse {
    public static void main(String[] args) {
        String n,rev="";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        n = sc.nextLine(); 
        int len = n.length(); 
        for (int i = (len - 1); i >= 0; --i) 
        {
          rev = rev + n.charAt(i); 
        }
        System.out.println("Reversed String : "+rev);
    } 
    
}

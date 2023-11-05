import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) 
    {
  
      String n, rev = "";
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a String : ");
      n = sc.nextLine();      
      int len = n.length(); 
  
      for (int i = (len - 1); i >= 0; --i) 
      {
        rev = rev + n.charAt(i);
    }
  
      if ( n.equals(rev)) 
      {
        System.out.println(n + " is a Palindrome String.");
      }
      else 
      {
        System.out.println(n + " is not a Palindrome String."); 
      }
    }
  }
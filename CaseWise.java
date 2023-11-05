import java.util.Scanner; 
public class CaseWise 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n");
        System.out.println(" - - - Gettting Value From User - - - ");
        System.out.print("\n");
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        System.out.print("\n");
        char [] arr = str.toCharArray();
        char m;
        for (int i=0;i<str.length();i++)
        {
            for (int j=1+i;j<str.length();j++)
            {
               
                if (arr[i]>=arr[j])
                {
                    m=arr[j];
                    arr[j]=arr[i];
                    arr[i]=m;
                }
            }
        }
        for (int q=0;q<str.length();q++)
        {
            System.out.print(arr[q]);
        }
    }
}
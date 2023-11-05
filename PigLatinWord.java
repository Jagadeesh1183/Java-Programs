import java.util.*;
public class PigLatinWord 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num=0,con=0;
        char ch; 
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        char [] arr = new char [str.length()];
        char [] arr2 = new char [str.length()+2];
        char [] arr3 = new char [str.length()+3];
        char [] arr4 = new char [str.length()+2];

        for (int i=0;i<str.length();i++)
        {
            arr[i]=str.charAt(i);
        }

        // Program Conditions Starts Here

        for(int i=0;i<arr.length;i++)
        {
            if (arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' || arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U')
            {
                num++;
                break;
            }
            else
            {
                con++;
            }
        }
        if(num>0)
        {
            if (arr[0]=='a' || arr[0]=='e' || arr[0]=='i' || arr[0]=='o' || arr[0]=='u' || arr[0]=='A' || arr[0]=='E' || arr[0]=='I' || arr[0]=='O' || arr[0]=='U')
            {
                for (int i=0;i<=str.length();i++)
                {
                if(i==str.length())
                {
                    arr3[i]='y';
                    arr3[i+1]='a';
                    arr3[i+2]='y';
                }
                else
                {
                    arr3[i]=arr[i];
                } 
                }
                for (int i=0;i<arr3.length;i++)
                {
                    System.out.print(arr3[i]);
                }
            }
            else
            {
                for(int j=0;j<con;j++)
                {
                    if(j==1)
                    {
                        ch=arr2[0];
                        for(int i=0;i<arr.length;i++)
                        {
                            if (i==arr.length-1)
                            {
                                arr2[i]=ch;
                                if ( j==con-1)
                                {
                                    arr2[i+1]='a'; 
                                    arr2[i+2]='y'; 
                                }
                            }
                            else
                            {
                                arr2[i]=arr2[i+1];  
                            } 
                        }
                    }
                    else
                    { 
                        ch=arr[0];  
                        for(int i=0;i<arr.length;i++)
                        {
                            if (i==arr.length-1)
                            {
                                arr2[i]=ch;
                                if ( j==con-1)
                                {
                                    arr2[i+1]='a'; 
                                    arr2[i+2]='y'; 
                                }
                            }
                            else
                            {
                                arr2[i]=arr[i+1];   
                            } 
                        }
                    }
                    
                }
                    
                for (int i=0;i<arr2.length;i++)
                {
                    System.out.print(arr2[i]);
                }
            }

        }
        else
        {
            System.out.println("Not Possible to generate Pig Latin Word");
        }
    }
}


//Write a java program to find the first non-repeating character in a given String 
import java.util.*;
class Non_Repeating
{
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      System.out.println("Enter any String");
        String s =new String(d.nextLine());
        int c=-1;  // to indicate no non-repeatinhg charcater

        for(char i :s.toCharArray())
        {            
            if (s.indexOf(i) == s.lastIndexOf(i))
            {
                System.out.println("First non-repeating character is: "+i);
                c =0;
                break;
            }
        }

        if(c==-1)
            System.out.println("There is no non repeating character in input string");
    }
}
//Write a java program to check if a given String is Palindrome or not 
import java.util.*;
public class Palindrome
{  
     public static void main(String[] args)
  {    
    Scanner s=new Scanner(System.in);
    System.out.println("Eneter any String");
        String s1 = new String(s.nextLine());
      // String s1 = new String();
      // s1=s.nextLine();
        
        String rev = "";    
            
       int  i=s1.length()-1;
        for(; i >= 0; i--)
        {    
            rev =rev + s1.charAt(i);    
        }  
           
if(rev.equals(s1)) 
 System.out.println("Given string is palindrome");
    else
  System.out.println("Given string is not palindrome");
    }   
  }
  
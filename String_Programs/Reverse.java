import java.util.*;
public class Reverse   
{    
    public static void main(String[] args)
  {    
    Scanner s=new Scanner(System.in);
    System.out.println("Eneter any String");
        String s1 = new String(s.nextLine());  
        
        String rev = "";    
            
       int  i=s1.length()-1;
        for(; i >= 0; i--)
        {    
            rev =rev + s1.charAt(i);    
        }    
            
           
           
 System.out.println("Reverse of given string: " + rev);    
    }    
}    
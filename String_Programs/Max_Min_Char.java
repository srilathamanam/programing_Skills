// java program to count maximum occurance character in string
import java.util.*;
public class Max_Min_Char  
{  
     public static void main(String[] args)
  {  
      Scanner e=new Scanner(System.in);
    System.out.println("Enter any string");
        String str = e.nextLine();
        
        int i, j, max;          
          
          
        char string[] = str.toCharArray();  
          
        int chcount[]=new int[str.length()];
        for(i = 0; i < str.length(); i++)        
            chcount[i] = 1; 
          for(i = 0; i < str.length(); i++)
            {
            for(j = i+1; j < string.length; j++)
              {  
                if(string[i] == string[j] && string[i] != ' ' && string[i] != '\0')
                {  
                    chcount[i]++;  
                      
                    
                    string[j] = '\0';  
                }  
            }  
        }  
          
        
        char maxChar = string[0];
        max=chcount[0];
       
        for(i = 1; i < chcount.length&&string[i]!='\0'; i++)
          {
         if(max<chcount[i])
         {
           max=chcount[i];
           maxChar=string[i];
         }
          
          }
       
         System.out.println(max+"  "+maxChar);
          }
}  

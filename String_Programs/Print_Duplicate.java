import java.util.*;
public class Print_Duplicate 
{  
     public static void main(String[] args)
  {  
      Scanner e=new Scanner(System.in);
    System.out.println("Enter any string");
        String str = e.nextLine();
        int[] freq = new int[str.length()];  
         
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
          
        
       for(i=0;i<chcount.length&&string[i]!='\0';i++)
         {
           if(chcount[i]>1)
             System.out.println(string[i]);
         }
       
        
}  
}

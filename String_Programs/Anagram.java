//Write a java program to check if two given String is the anagram of each other 

import java.util.*;

class Anagram {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter first string");
    String str1 = new String(s.nextLine());
     System.out.println("Enter second string");
    String str2 = new String(s.nextLine());
    
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();
    int c1=-1;
    // check if length is same
    if(str1.length() != str2.length()) 
    System.out.println("Given strings are not anagrams");
    else
    {
      
      char[] ch1 = str1.toCharArray();
      char[] ch2 = str2.toCharArray();

      for (int i = 0; i < ch1.length; i++)   
      {  
      for (int j = i + 1; j < ch1.length; j++)   
      {  
      char c; 
        if (ch1[i] > ch1[j])   
        {  
          c = ch1[i];  
            ch1[i] = ch1[j];  
            ch1[j] = c;  
        }  
      }
      }
  for (int i = 0; i < ch2.length; i++)   
      {  
      for (int j = i + 1; j < ch2.length; j++)   
      {  
      char c; 
        if (ch2[i] > ch2[j])   
        {  
          c = ch2[i];  
            ch2[i] = ch2[j];  
            ch2[j] = c;  
        }  
      }
      }
    
      for(int i=0;i<ch1.length;i++)
        {
          if(ch1[i]!=ch2[i])
          {
            
            c1=0;
            break;
          }
          else continue;
            
        }
    }
      if(c1==0)
      System.out.println("Given strings are not anagrams");
      else
        System.out.println("Given strings are anagrams");
        
        
      
    }
  
}
//Write a java program to count total number of negative elements in an array.
import java.util.*;
class Count_Negative
  {
    public static void main(String args[])
    {
      int n,c=0;
      Scanner s=new Scanner(System.in);
      System.out.println("enter size of array");
      n=s.nextInt();
      int a[]=new int[n];
      System.out.println("Enter elements of array");
      for(int i=0;i<n;i++)
        a[i]=s.nextInt();
      for(int i=0;i<n;i++)
        {
          if(a[i]<0)          
            c=c+1;       
        }        
      
        System.out.println("no of  negative values in an array are "+c);
        
    }
  }
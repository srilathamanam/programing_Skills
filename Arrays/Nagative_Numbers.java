//Write a java program to print all negative elements in an array.
import java.util.*;
class Nagative_Numbers
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
          {
            System.out.println(a[i]);
            c=1;
          }
            
        }
      if(c==0)
        System.out.println("no negative values");
        
    }
  }
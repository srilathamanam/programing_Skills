//Write a java program to print all natural numbers from 1 to n. 
import java.util.*;
class Sum1ton
  {
    public static void main(String args[])
    {
     
      int n,i,sum=0;
       Scanner s=new Scanner(System.in);
      System.out.println("enter n value");
      n=s.nextInt();
      for(i=1;i<=n;i++)
        sum=sum+i;
       System.out.println("sum of 1 to "+n+"is "+sum);

      
      
    }
  }
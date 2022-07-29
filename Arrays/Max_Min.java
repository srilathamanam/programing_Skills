//Write a java program to find maximum and minimum element in an array. 
import java.util.*;
class Max_Min
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
      int max=a[0];
      int min=a[0];
      for(int i=1;i<n;i++)
        {
          if(max<a[i])
            max=a[i];
          if(min>a[i])
            min=a[i];
        }
      System.out.println("Maximum element is "+max);
      System.out.println("Minimum element is "+min);
    }
  }
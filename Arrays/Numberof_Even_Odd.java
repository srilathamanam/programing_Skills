//Write a java program to count total number of even and odd elements in an array.

import java.util.*;
class Numberof_Even_Odd
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
      int evencount=0;
      int oddcount=0;
      for(int i:a)
        {
          if(i%2==0)
            evencount++;
          else
            oddcount++;
        }
      System.out.println("Number of even numbers in given array are "+evencount);
      System.out.println("Number of odd numbers in given array are "+oddcount);
    }
  }
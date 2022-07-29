//Write a java program to print all unique elements in the array.
import java.util.*;
class Unique
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
          int j;
          for( j=i+1;j<n;j++)
            {
              if(a[i]==a[j])
              
                a[j]='\0';
              
            }
        }
      System.out.println("Unique elements in an array are");
         for(int i=0;i<n;i++)
           {
             if(a[i]!='\0')
           
            System.out.println(a[i]);
        }
    }
  }
        
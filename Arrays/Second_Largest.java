//Write a java program to find second largest element in an array.
import java.util.*;
class Second_Largest
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
            for(int j=i+1;j<n;j++)    
            {
                if(a[i]>a[j])     
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
       System.out.println("Second larget element is"+a[n-2]);
    }
  }
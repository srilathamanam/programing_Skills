// Write a java program to count frequency of each element in an array.
import java.util.*;
class Frequency
  {
    public static void main(String args[])
    {
      int n;
      Scanner s=new Scanner(System.in);
      System.out.println("enter size of array");
      n=s.nextInt();
      int a[]=new int[n];
      System.out.println("Enter elements of array");
      for(int i=0;i<n;i++)
        a[i]=s.nextInt();
      int f[]=new int[n];
      for(int i=0;i<n;i++)
        f[i]=0;
      for(int i=0;i<n;i++)
        {
          int c=1;
          for(int j=i+1;j<n;j++)
            if(a[i]==a[j]&&f[j]==0)
            {
              c=c+1;
              a[j]='\0';
              f[j]=1;
            }
          if(f[i]==0)
            System.out.println(a[i]+" frequency is "+c);
        }
    }
  }
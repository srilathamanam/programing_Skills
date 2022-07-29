//Write a java program to count total number of duplicate elements in an array.
import java.util.*;
class Count_Duplicate
  {
    public static void main(String args[])
    {
      int n,c,count=0;
      Scanner s=new Scanner(System.in);
      System.out.println("enter size of array");
      n=s.nextInt();
      int a[]=new int[n];
      System.out.println("Enter elements of array");
      for(int i=0;i<n;i++)
        a[i]=s.nextInt();
      for(int i=0;i<n;i++)
        {
          c=0;
          int j;
          for( j=i+1;j<n;j++)
            {
              if(a[i]==a[j]&&a[j]!='\0')
              {
                c=1;
                a[j]='\0';
              }
            }
          if(c==1)
            count=count+1;
        }
      System.out.println("no of dulipcate elements in an array are");
        
            System.out.println(count);
        
    }
  }
        
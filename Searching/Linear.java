import java.util.*;
class Linear
{       
    public static void main(String[] args)
    {
      int n,loc=-1;
      System.out.println("Enter number of elements in an array");
      Scanner w=new Scanner(System.in);
      n=w.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter elements");
      for(int i=0;i<n;i++)
        arr[i]=w.nextInt();
      System.out.println("Enter element you want to serach");
      int key=w.nextInt();
       for(int i=0;i<n;i++)
         {
         if(key==arr[i])
         {
           loc=i;
           break;
         }
         }
      if(loc==-1)
         System.out.println("the elemnet is not found in the given array");
      else
        System.out.println("the element found in at location at "+loc);
    }
}
      
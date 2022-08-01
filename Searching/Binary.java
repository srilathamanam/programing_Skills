import java.util.*;
class Binary
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
       for (int i=0; i<n-1; i++)       
        {
        for(int j = i+1; j < n; j++)    
          {
            if (arr[i] > arr[j])      
            {                           
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
          }
    }
      System.out.println("Enter element you want to serach");
      int key=w.nextInt();
      int low=0;
      int high=n-1;
      while(low<=high)
        {
          int mid=(low+high)/2;
          if(key==arr[mid])
            loc=mid;
          else if(key>arr[mid])
            low=mid+1;
          else
            high=mid-1;
              
        }
       
         
      if(loc==-1)
         System.out.println("the elemnet is not found in the given array");
      else
        System.out.println("the element found in at location at "+loc);
    }
}
      
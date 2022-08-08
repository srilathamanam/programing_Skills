import java.util.*;
class Bubblesort 
{  

          
     
    public static void main(String[] args)
    {
      int n;
      System.out.println("Enter number of elements in an array");
      Scanner w=new Scanner(System.in);
      n=w.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter elements");
      for(int i=0;i<n;i++)
        arr[i]=w.nextInt();
      
   System.out.println("Before swaping");
      for (int i=0; i<arr.length; ++i) 
        {
            System.out.print(arr[i]+" ");
        } 
        for (int i=0; i<n-1; i++)       
        {
        for(int j = 0; j < n-1; j++)    
          {
            if (arr[j] > arr[j+1])      
            {                           
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
          }
    }
      System.out.println("After swaping");
      for (int i=0; i<arr.length; ++i) 
        {
            System.out.print(arr[i]+" ");
        } 
}
}

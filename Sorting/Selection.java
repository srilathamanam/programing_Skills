import java.util.*;
class Selection
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
        int ind = i;  
          
        for (int j = i+1; j < n; j++)  
        if (arr[j] < arr[ind])  
            ind = j;  

    int temp = arr[ind];  
    arr[ind] = arr[i];  
    arr[i] = temp;
    }
      System.out.println("After swaping");
      for (int i=0; i<arr.length; ++i) 
        {
            System.out.print(arr[i]+" ");
        } 
}
}
import java.util.*;
class Insertion
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

    for ( int i = 1; i < n; i++) 
    {  
        int temp = arr[i];  
       int  j = i - 1;  
  
        while(j>=0 && temp <= arr[j])
        {    
            arr[j+1] = arr[j];     
            j = j-1;    
        }    
        arr[j+1]= temp;
    }
      System.out.println("After swaping");
      for (int i=0; i<arr.length; ++i) 
        {
            System.out.print(arr[i]+" ");
        } 
    }
}
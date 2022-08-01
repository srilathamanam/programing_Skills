import java.util.*;
class Quicksort
  {
public static void quickSort(int arr[], int begin, int end) {
    if (begin < end) {
        int partitionIndex = partition(arr, begin, end);

        quickSort(arr, begin, partitionIndex-1);
        quickSort(arr, partitionIndex+1, end);
    }
}
private static int partition(int arr[], int begin, int end) {
    int pivot = arr[end];
    int i = (begin-1);

    for (int j = begin; j < end; j++) {
        if (arr[j] <= pivot) {
            i++;

            int swapTemp = arr[i];
            arr[i] = arr[j];
            arr[j] = swapTemp;
        }
    }

    int swapTemp = arr[i+1];
    arr[i+1] = arr[end];
    arr[end] = swapTemp;

    return i+1;
}
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
        quickSort(arr,0,n-1);
      System.out.println("After swaping");
      for (int i=0; i<arr.length; ++i) 
        {
            System.out.print(arr[i]+" ");
        } 
}
  }
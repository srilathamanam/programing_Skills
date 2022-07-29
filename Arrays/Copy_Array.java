
//Write a java program to copy all elements from an array to another array.
import java.util.*;

class Copy_Array {
  public static void main(String args[]) {
    int n, c = 0;
    Scanner s = new Scanner(System.in);
    System.out.println("enter size of array");
    n = s.nextInt();
    int a[] = new int[n];
    System.out.println("Enter elements of array");
    for (int i = 0; i < n; i++)
      a[i] = s.nextInt();
    int b[] = new int[n];
    for (int i = 0; i < n; i++)
      b[i] = a[i];
    System.out.println("Copied array");
    for (int i : b)
      System.out.println(i);
  }
}
//Write a java program to delete an element from an array at specified position.
import java.util.*;

class Delete_Element {
  public static void main(String args[]) {
    int n, c = 0;
    Scanner s = new Scanner(System.in);
    System.out.println("enter size of array");
    n = s.nextInt();
    int a[] = new int[n];
    System.out.println("Enter elements of array");
    for (int i = 0; i < n; i++)
      a[i] = s.nextInt();
    System.out.println("Enter index number position for delete operation");
    int pos=s.nextInt();
    if(pos<0||(pos>=a.length))
      System.out.println("Invalid Index number");
    else{
        for (int i = pos; i < a.length - 1; i++) 
            a[i] = a[i + 1];
        
            a[a.length-1]='\0';
    }
  
  System.out.println("array elements after deletion operation");
for(int i:a)
   System.out.println(i);
}
}
        
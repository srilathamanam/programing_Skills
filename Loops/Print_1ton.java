//Write a java program to print all natural numbers from 1 to n. - using while loop
import java.util.*;
class Print_1ton
  {
    public static void main(String ar[])
    {
    int n,i;
    Scanner d=new Scanner(System.in);
    System.out.println("n");
  
    n=d.nextInt();
    i=1;
    while(i<n)
      {
         System.out.println(i);
        i++;
      }
  }
}
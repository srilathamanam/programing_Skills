
//Write a java program to print all natural numbers in reverse (from n to 1). -     using while loop
import java.util.*;
class Naturalnumber_reverse
  {
    public static void main(String ar[])
    {
    int n,i;
    Scanner d=new Scanner(System.in);
    System.out.println("n");
  
    n=d.nextInt();
    i=n;
    while(i>0)
      {
         System.out.println(i);
        i--;
      }
  }
}
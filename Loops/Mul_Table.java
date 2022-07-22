//Write a java program to print multiplication table of any number.
import java.util.*;
class Mul_Table
  {
    public static void main(String ar[])
    {
    int n,i;
    Scanner d=new Scanner(System.in);
    System.out.println("Given input no");
  
    n=d.nextInt();
    i=1;
    while(i<=10)
      {
         System.out.println(n+"*"+i+"="+n*i);
        i++;
      }
  }
}
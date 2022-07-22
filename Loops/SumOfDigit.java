//Write a java program to calculate sum of digits of a number.
import java.util.*;

class SumOfDigit
  {
  public static void main(String args[]) {

    int n, i, sum = 0,d;
    Scanner s = new Scanner(System.in);
    System.out.println("enter any positive number");
    n = s.nextInt();  
    while (n > 0) 
    {
        sum=sum+(n%10);
        n = n / 10;
      }
      System.out.println("number of digits is " + sum);   

  }
}
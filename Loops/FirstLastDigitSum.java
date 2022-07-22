//Write a java program to find sum of first and last digit of a number.
import java.util.*;

class FirstLastDigitSum
  {
  public static void main(String args[]) {

    int n, f,t;
    Scanner s = new Scanner(System.in);
    System.out.println("enter any positive number");
    n = s.nextInt();
    t=n;
    if (n == 0)
      System.out.println("first and last digit is 0" );
    else {
      f = n%10;
      while (n >=10) 
      {
        
        n = n / 10;
      }
      System.out.println("sum of first and last digits is"+(n+f));
      
    }

  }
}
// Write a java program to find first and last digit of a number.

import java.util.*;

class First_Last_Digit
  {
  public static void main(String args[]) {

    int n, f;
    Scanner s = new Scanner(System.in);
    System.out.println("enter any positive number");
    n = s.nextInt();
    
    if (n == 0)
      System.out.println("first and last digit is 0" );
    else {
      f = n%10;
      while (n >=10) 
      {
        
        n = n / 10;
      }
      System.out.println("last digit is " + n);
      System.out.println("first digit is " + f);
    }

  }
}
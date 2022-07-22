//Write a java program to check whether a number is palindrome or not.
import java.util.*;

class PalindromeNo {
  public static void main(String args[]) {

    int n,t,r=0;
    Scanner s = new Scanner(System.in);
    System.out.println("enter any positive number");
    n = s.nextInt();
    t=n;
      while (n > 0)
        {
        r=(r*10)+(n%10);
        n = n / 10;
      }
    if (t==r)
      System.out.println(t+" is a palindrome no");
    else
      System.out.println(t+" is not a palindrome no");
    

  }
}
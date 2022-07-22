//Write a java program to count number of digits in a number.
import java.util.*;

class No_Digits {
  public static void main(String args[]) {

    int n, count = 0;
    Scanner s = new Scanner(System.in);
    System.out.println("enter any positive number");
    n = s.nextInt();
    int t = n;
    if (n == 0)
      System.out.println("number of digits in" + n + "is 1");
    else {
      while (n > 0) {
        count++;
        n = n / 10;
      }
      System.out.println("number of digits in " + t + "is " + count);
    }

  }
}
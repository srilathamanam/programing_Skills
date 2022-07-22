//Write a java program to calculate product of digits of a number.
import java.util.*;

class ProductOfDigits
  {
  public static void main(String args[]) {

    int n, i, pro = 1;
    Scanner s = new Scanner(System.in);
    System.out.println("enter any positive number");
    n = s.nextInt();  
    while (n > 0) 
    {
        pro=pro*(n%10);
        n = n / 10;
      }
      System.out.println("number of digits is " + pro);   

  }
}
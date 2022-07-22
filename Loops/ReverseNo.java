//Write a java program to enter a number and print its reverse.
import java.util.*;

class ReverseNo
  {
  public static void main(String args[]) {

    int n,r=0;
    Scanner s = new Scanner(System.in);
    System.out.println("enter any positive number");
    n = s.nextInt();
    
      while (n > 0)
        {
        r=(r*10)+(n%10);
        n = n / 10;
      }
    
      System.out.println("reverse of given no is" +r);
    
    

  }
}
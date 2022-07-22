//Write a java program to find power of a number using for loop
import java.util.*;
class PowerNo
  {
    public static void main(String args[])
    {
     
      int n,po=1,p,i;
       Scanner s=new Scanner(System.in);
      System.out.println("enter any value");
      n=s.nextInt();
      System.out.println("enter power value");
        p=s.nextInt();
      for(i=1;i<=p;i++)
        po=po*n;
       System.out.println("power of ("+n+","+p+") is "+po);

      
      
    }
  }
//Write a java program to print all even numbers between 1 to 100. - using while     loop
import java.util.*;
class Even100
{
  public static void main(String ar[])
    {
    int i=1;   
    
    while(i<100)
      {
        if(i%2==0)
         System.out.println(i);
        i++;
      }
  }
}
// java Program to concatinate two strings
import java.util.*;
public class Concatenate
{
    public static void main(String[] args)
    {

      Scanner u=new Scanner(System.in);
      System.out.println("Enter first string");
        String s1 = new String(u.nextLine());
        System.out.println("Enter Second string");
        String s2 = new String(u.nextLine());
        String s3=new String();
        String s4=new String();
        s3=s1+s2;
        s4=s1.concat(s2);
        
        System.out.println( s3);
        System.out.println(s4); 
    }
}
//Write a java program to convert String to an integer 
import java.util.*;
public class String_ToInteger {

 public static void main(String[] args)
    {
        Scanner n = new Scanner(System.in);
        System.out.print("Input a number(string): ");
        String str1 = n.nextLine();
		int num = Integer.parseInt(str1);
        System.out.printf("The integer value of given string is: %d",num);
		
    }
}
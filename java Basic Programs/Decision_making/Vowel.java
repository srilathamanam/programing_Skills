//Write a java program to input any alphabet and check whether it is vowel or    consonant.
import java.util.*;
class Vowel
{
	public static void main(String args[])
	{
		char c;
		Scanner s=new Scanner(System.in);
		System.out.println("enter any  alphabet");
		c=s.next().charAt(0);
		
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
            		System.out.println(c + " is vowel");
        	else
           		 System.out.println(c + " is consonant");
    		
	}
}
//Write a java program to find frequency of each digit in a given integer.
import java.util.*;
class FrequenyofDigit
{
    public static void main(String arr[])
    {
       
        int n,i,c,d,t;
       Scanner s=new Scanner(System.in);
        System.out.println("Enter any Number : ");
        n=s.nextInt();
         
        for(i=0;i<=9;i++)
        {
            c=0;
            t=n;
            while(t>0)
            {
                d=t%10;
                if(d==i)
                {
                    c++;
                }
                t=t/10;
            }
            if(c>0)
            {
                System.out.println(i+"frequency is "+c);
            }
        }
    }
}
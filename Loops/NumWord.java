//Write a java program to enter a number and print it in words.
import java.util.Scanner;

public class NumWord
{
    public static void main(String[] args)
    {
        
        int r, n, t;
        String w = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number");
        n = sc.nextInt();
        t= n;
        while (n > 0)
        {
            r = n % 10;
            switch (r)
            {
                case 0:
                    w = "Zero" + w;
                    break;
                case 1:
                    w = "One" + w;
                    break;
                case 2:
                    w= "Two" + w;
                    break;
                case 3:
                   w= "Three" + w;
                    break;
                case 4:
                    w = "Four" + w;
                    break;
                case 5:
                    w= "Five" + w;
                    break;
                case 6:
                    w = "Six" + w;
                    break;
                case 7:
                    w = "Seven" + w;
                    break;
                case 8:
                    w = "Eight" + w;
                    break;
                case 9:
                    w = "Nine" + w;
                    break;
            }
            n = n / 10;
        }
        
        System.out.println(w);
    }
}

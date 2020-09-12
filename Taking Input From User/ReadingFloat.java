// This program shows the use of scanner class in java.

import java.util.Scanner;

public class ReadingInteger
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        float n;
        
        System.out.print("Enter any floating point number : ");
        
        n = scanner.nextFloat();
        
        System.out.print("The entered number is : " + n);
        
    }
}

/* Expected output : Enter any number : 10.54
                     The entered number is : 10.54
                     
                     */

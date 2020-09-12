// This program shows the use of scanner class in java.

/* Reading String in java is of two types :   1. Reading only one word.
                                              2. Reading complete sentence including white spaces.
                                              
                                              */

import java.util.Scanner;

public class ReadingString
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        String first_name;
        
        System.out.print("Enter your first name : ");
        
        first_name = scanner.nextLine();     // Reads multiple words including spaces.
        
        String last_name;
        
        System.out.print("Enter your last name : ");
        
        last_name = scanner.next();     //  Reads only one word.
        
        System.out.print("Your name is : " + ( first_name + " " + last_name ));
        
    }
}

/* Expected output :
                    Enter your first name : Subahan Ali Khan
                    Enter your last name : Patan
                    Your name is : Subahan Ali Khan Patan
                     
                     */

/*
 * Description:  phone string
 * Date:  09/27/22
 * CS 150, Section 3
 * @author: Liam Lees
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          Scanner scnr = new Scanner(System.in);

        System.out.println("Enter 10-Digit phone number: ");

        String phoneNum = scnr.nextLine();

        System.out.println("You entered " + phoneNum);

        String s1 = phoneNum.substring(0, 3);
        String s2 = phoneNum.substring(3, 6);
        String s3 = phoneNum.substring(6, 10);


        System.out.println("The area code is " + s1);
        System.out.println("The exchange is " + s2);
        System.out.println("The number is " + s3);
        System.out.println("The complete telephone number is (" + s1 + ") " + s2 + "-" + s3);

        // take input
        //give them back the input
        //break the code into the first 3 numbers , second 3 numbers, than last 4 numbers
        //return back each part
        //give back full number with parentheses and dashes

    }
}

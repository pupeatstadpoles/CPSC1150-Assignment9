
/**
 * Program Name: Roman
 * Author: Pup Abdulgapul
 * Student ID: 100362791
 * Date: Nov 11, 2022
 * Course: CPSC1150-03
 * Professor: Hengameh Hamavand
 */

import java.util.Scanner;

public class Roman { // Program to convert integer to Roman numeral equivalent
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        boolean valid = true;

        System.out.println(
                "This program converts integers from 0-3999 to their Roman numeral equivalent.\nPlease enter in a number: ");
        do {
            num = input.nextInt();
            // check if 0 < num < 4000
            if (num > 3999) {
                System.out.println("Error: number must be less than 4000! Please enter in a number.");
            } else if (num < 1) {
                System.out.println("Error: number must be greater than 0. Please enter in a number.");
            } else {
                valid = false;
            }
        } while (valid);

        convert(num);
    }

    /**
     * Method to convert integer number to roman numeral equivalent by printing out
     * the equivalent numeral from a string array.
     * 
     * @param n is the user-inputted integer being passed through. This will get
     *          converted to roman numerals.
     */
    public static void convert(int n) {
        // empty in index 0 since we will never print index0
        String[] thousands = { "", "M", "MM", "MMM" }; // use n%1000 to get the thousands value
        String[] hundreds = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" }; // use (n%1000) to get the hundreds
                                                                                     // value
        String[] tens = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" }; // use (n%100) to get the tens
                                                                                        // value
        String[] ones = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" }; // use (n%10) to get the ones
                                                                                        // value

        // Print it all out in one go as a string
        System.out.println("The roman numeral equivalent of " + n + " is " + thousands[n / 1000]
                + hundreds[(n % 1000) / 100] + tens[(n % 100) / 10] + ones[n % 10]);
    }
}

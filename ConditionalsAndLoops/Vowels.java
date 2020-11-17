//*************************************************
// Mary Lang T00681571
// Comp 1131 
// Assignment 3
// Question 2
// Design and implement an application that reads a string from the user, then determines and displays how many (of each) of the five vowels (a, e, i, o, and u) appear in the entire string
//*************************************************
package com.assignments.three;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        String input;
        //define vowels as int
        int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0, cCount = 0;
        char vowels;
        //prompt and look for input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word or sentence to see how many vowels are in it:");
        input = scan.nextLine();
        //initialization , condition to be met, increment = counting
        for (int count = 0; count < input.length(); count++) {
            vowels = input.charAt(count);
//begin switch statement
            switch (vowels) {
                case 'a':
                case 'A':
                    aCount++;
                    break;
                case 'e':
                case 'E':
                    eCount++;
                    break;
                case 'i':
                case 'I':
                    iCount++;
                    break;
                case 'o':
                case 'O':
                    oCount++;
                    break;
                case 'u':
                case 'U':
                    uCount++;
                    break;
                //using default for consonant count 
                default:
                    cCount++;
                    break;
            }
        }
        System.out.println("a: " + aCount);
        System.out.println("e: " + eCount);
        System.out.println("i: " + iCount);
        System.out.println("o: " + oCount);
        System.out.println("u: " + uCount);
        System.out.println("consonants: " + cCount);
    }
}
/*Testing scenarios:
1. one of every vowel and no cons
2. no vowel and one or more cons
3. multiple vowels not in a row
4. other characters (numbers and other characters). < I haven't solved for this in my code so my assumption is it shouldn't fail and should count anything no vowels as consonants.
5. upper case - I had to solve for this my original code did not see the uppercase
 */

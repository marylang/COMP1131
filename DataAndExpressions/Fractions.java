//*************************************************
// Mary Lang T00681571
// Comp 1131 
// Assignment 1
// Question 3
// prompts for and reads the numerator and denominator of a fraction as integers, 
// then displays the decimal equivalent of the fraction.
//*************************************************

package com.assignments.one;

import java.util.Scanner;

public class Fractions {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        //variables as ints
        int num;
        int den;
        //prompt for and read numerator and denominator input
        System.out.println("Enter your fraction in order of numerator, enter for new line then denominator");
        num = n.nextInt();
        den = n.nextInt();
        //cast int to double
        double dnum = num;
        double dden = den;
        //divide doubles numerator to denominator
        double decimal = dnum / dden;
        //display fraction as decimal
        System.out.println(num + "/" + den + " is " + decimal);
    }
}

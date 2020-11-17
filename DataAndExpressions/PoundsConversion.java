//*************************************************
// Mary Lang T00681571
// Comp 1131 
// Assignment 1
// Question 1
// application that converts a weight in pounds into kilograms
//*************************************************
package com.assignments.one;

import java.util.Scanner;

public class PoundsConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float lb;
        double kg;
        // prompt for user to enter weight
        System.out.println("Enter weight in lbs: ");
        lb = in.nextFloat();
        //calculate input pounds by conversion rate 
        kg = lb * 0.45359237;
        //display the resulting conversion
        System.out.println("weight in kg = " + kg);
    }
}

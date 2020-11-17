//*************************************************
// Mary Lang T00681571
// Comp 1131 
// Assignment 2: Using Classes and Objects
// Question 2
// application that prompts for and reads the user’s first and last name (separately), 
// then displays a string composed of the first four characters of the user’s last name, 
// followed by the first two letters of the user’s first name, followed by a random number in the range of 10 to 99
//*************************************************
package com.assignments.two;

import java.util.Scanner;

public class ComputeDistance {
    public static void main(String[] args) {
        float x1, y1, x2, y2;
        float distance = 0;
        Scanner InputValues = new Scanner(System.in);
        //prompt user for and read coordinates
        System.out.println("Enter your coordinates in order of x1, y1, x2, y2");
        x1 = InputValues.nextFloat();
        y1 = InputValues.nextFloat();
        x2 = InputValues.nextFloat();
        y2 = InputValues.nextFloat();
        //distance calcuation provided in assignmment
        distance = (float) (Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
        System.out.println("The distance between the two points is " + distance);

    }
}

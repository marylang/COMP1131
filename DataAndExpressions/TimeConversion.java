//*************************************************
// Mary Lang T00681571
// Comp 1131 
// Assignment 1
// Question 2
// application that displays seconds in hours, minutes and seconds
//*************************************************
package com.assignments.one;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hours;
        int minutes;
        int seconds;
        //prompt for and read user inputted seconds
        System.out.println("Enter number of seconds");
        int inputseconds = in.nextInt();
        //divide inputted seconds by number of seconds in an hour
        hours = inputseconds / 3600;
        //calculate remaining seconds 
        int remainingsecondsafterhours = inputseconds % 3600;
        //covert remaining seconds to minutes
        minutes = remainingsecondsafterhours / 60;
        //calculate what remaining seconds there are after hours and minutes
        int calculatedseconds = remainingsecondsafterhours % 60;
        //display seconds as hours minutes seconds
        System.out.println(inputseconds + " seconds is equivalent to " + hours + " hours " + minutes + " minutes " + calculatedseconds + " seconds");
    }

}


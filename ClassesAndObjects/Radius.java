//*************************************************
// Mary Lang T00681571
// Comp 1131 
// Assignment 2: Using Classes and Objects
// Question 3
// application reads the radius of a sphere then calculates and displays the circumference, 
// volume and surface area.
//*************************************************

package com.assignments.two;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Radius {
    public static void main(String[] args) {
        double Radius, Volume, SurfaceArea, Circumference;
        Scanner InputValues = new Scanner(System.in);
        //prompt user for and read radius 
        System.out.println("Enter your radius");
        Radius = InputValues.nextDouble();
        //calculate circumference using provided equation
        Circumference = 2 * Math.PI * Radius;
        //calculate volume using provided equation
        Volume = 4 * Math.PI * Math.pow(Radius, 3) / 3;
        //calculate surfacearea using provided equation
        SurfaceArea = 4 * Math.PI * Math.pow(Radius, 2);
        //set the decimal format you want output (assignment says round to 4)
        DecimalFormat fmt = new DecimalFormat("0.####");
        System.out.println("your circumference is " + fmt.format(Circumference) + " your Volume is " + fmt.format(Volume) + " your SurfaceArea is " + fmt.format(SurfaceArea));

    }
}

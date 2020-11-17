//*************************************************
// Mary Lang T00681571
// Comp 1131 
// Assignment 2: Using Classes and Objects
// Question 1
// application that prompts for and reads the user’s first and last name (separately), 
// then displays a string composed of the first four characters of the user’s last name, 
// followed by the first two letters of the user’s first name, followed by a random number in the range of 10 to 99
//*************************************************
//used import java.util.*; IntelliJ imports them both independently when you run. Two utils, one for random generator for number generation and one for scanner for reading user input

import java.util.Random;
import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        Scanner names = new Scanner(System.in);
        Random generator = new Random();
        System.out.println("Enter your first name");
        //read user name
        String FirstName = names.next();
        System.out.println("Enter your last name");
        //read user name 
        String LastName = names.next();
        //declare number as integer
        int num;
        //user random number generator to create random number between 10-99, originally I had (99) + 10 which would give 10-109, corrected and will now gen between 10-99
        num = generator.nextInt(89) + 10;
        int substringLastName = 4;
        int substringFirstName = 2;
        if (LastName.length() < 4)
            substringLastName = LastName.length();
        System.out.println(LastName.substring(0, substringLastName) + FirstName.substring(0, substringFirstName) + num);
    }
}
//assuming since we haven't got to conditionals you don't want this solution, and specifically said "assume the last name has at least four letters" for a reason. But if using less than four letters, or two 
// it's going to error out using a substring.
//solution for that would be this (repeating the solution on LastName for first thing. 
/*public class Names {
    public static void main(String[] args) {
        Scanner names = new Scanner(System.in);
        Random generator = new Random();
        System.out.println("Enter your first name");
        //read user name
        String FirstName = names.next();
        System.out.println("Enter your last name");
        //read user name 
        String LastName = names.next();
        //declare number as integer
        int num;
        //user random number generator to create random number between 10-99, originally I had (99) + 10 which would give 10-109, corrected and will now gen between 10-99
        num = generator.nextInt(89) + 10;
        int substringLastName = 4;
        int substringFirstName = 2;
        if (LastName.length() < 4)
            substringLastName = LastName.length();
        System.out.println(LastName.substring(0, substringLastName) + FirstName.substring(0, substringFirstName) + num);
    }
}*/


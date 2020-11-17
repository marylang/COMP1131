//*************************************************
// Mary Lang T00681571
// Comp 1131 
// Assignment 3
// Question 1
// application that plays Hi-Lo guessing game
//*************************************************
package com.assignments.three;

import java.util.Random;
import java.util.Scanner;

public class hiLo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        String another;
        //the inner loop to run the game
        do {
            int from = 1;
            int to = 100;
            int randomNumber = random.nextInt(to - from + 1) + from;
            int guess = 0;
            int count = 0;
            //the outer loop to see if the user wants to play again
            do {
                System.out.println("Guess a number between 1-100, 0 to exit");
                guess = scan.nextInt();

                //check if the number is within range of the to and from
                if (guess == 0) {
                    System.out.println("Thanks for playing!");
                } else if (guess > to || guess < from) {
                    System.out.println("That number is out of range try again");
                } else {
                    count++;
                    if (guess > randomNumber)
                        System.out.println("Your guess is too high! Try again or 0 to exit.");
                    else if (guess < randomNumber)
                        System.out.println("Your guess is too low! Try again or 0 to exit.");
                        //allow user to exit
                    else if (guess == randomNumber)
                        System.out.println("You guessed the number " + randomNumber + ". It took you " + count + " guesses.");
                }
                another = scan.nextLine();
            } while (guess != 0 && guess != randomNumber);
            System.out.println("Play game? (y/n)");
            another = scan.nextLine();
            //check if user wants to play again
        } while (another.equalsIgnoreCase("y"));

    }
}

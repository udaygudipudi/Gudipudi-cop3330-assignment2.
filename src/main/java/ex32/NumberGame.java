package ex32;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Uday Gudipudi
 */

import java.util.*;
import java.util.Random;

public class NumberGame {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int correctnumber = 0;

        int totalguesses = 0;
        char yesno = 'y';

        System.out.printf("Let's play Guess the Number!");

        while (yesno == 'y'){

            System.out.printf("Enter the difficulty level (1, 2, or 3):");

            totalguesses = 0;

            int choice = scan.nextInt();
            int correct = 0;

            if(choice == 1){

                int range = 11;

                Random rand = new Random();

                correctnumber = rand.nextInt(range);

                if (correctnumber == 0){

                    correctnumber = correctnumber + 1;

                }
            }

            if(choice == 2){

                int range = 101;

                Random rand = new Random();

                correctnumber = rand.nextInt(range);

                if (correctnumber == 0){

                    correctnumber = correctnumber + 1;

                }
            }

            if(choice == 3){

                int range = 1001;

                Random rand = new Random();

                correctnumber = rand.nextInt(range);

                if (correctnumber == 0){

                    correctnumber = correctnumber + 1;

                }
            }

            System.out.printf("I have my number. What's your guess? ");

            while (correct == 0){

                int userguess = scan.nextInt();

                if (userguess < correctnumber){
                    System.out.printf("Too low. Guess again: ");
                    totalguesses++;

                }

                if (userguess > correctnumber){
                    System.out.printf("Too high. Guess again: ");
                    totalguesses++;

                }

                if (userguess == correctnumber){
                    totalguesses++;
                    System.out.printf("You got it in %d guesses! ", totalguesses);
                    correct = 3;

                }

            }

            System.out.printf("Do you wish to play again (Y/N)? ");

            yesno = scan.next().charAt(0);

        }

        scan.close();

    }
}

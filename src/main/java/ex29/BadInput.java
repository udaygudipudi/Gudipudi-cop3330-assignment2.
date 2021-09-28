package ex29;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Uday Gudipudi
 */

import java.util.*;

public class BadInput {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int check = 0;

        while (check == 0){

            System.out.print("What is the rate of return? ");

            if(scan.hasNextInt()){

                int rate = scan.nextInt();

                if (rate == 0){

                    System.out.printf("Sorry. That's not a valid input. %n");

                }
                else {

                    int years = 72 / rate;

                    System.out.printf("It will take %d years to double your initial investment.", years);

                    check = 3;

                }

            }

            else{

                scan.next();

                System.out.println("Sorry. That's not a valid input. ");

            }

        }
        scan.close();
    }
}

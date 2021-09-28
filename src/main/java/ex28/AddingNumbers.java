package ex28;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Uday Gudipudi
 */

import java.util.*;

public class AddingNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numbers;
        int total = 0;

        numbers = new int[5];

        for(int i = 0; i < 5; i++){

            System.out.printf("Enter a number: ");
            numbers[i]  = scan.nextInt();

        }

        for(int i = 0; i < 5; i++){

            total = total + numbers[i];
        }

        System.out.printf("The total is %d. ", total);

        scan.close();
    }

}

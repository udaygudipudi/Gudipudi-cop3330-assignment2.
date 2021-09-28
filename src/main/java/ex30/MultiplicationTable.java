package ex30;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Uday Gudipudi
 */

public class MultiplicationTable {

    public static void main(String[] args) {

        int[][] table = new int[13][13];

        for(int i = 1; i < 13; i++ ){

            for(int j = 1; j < 13; j++){

                table[i][j] = i * j;

            }

        }
        for(int i = 1; i < 13; i++ ){

            for(int j = 1; j < 13; j++){

                System.out.printf("%d  ",table[i][j]);

            }

            System.out.printf("%n");

        }
    }
}

package ex33;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Uday Gudipudi
 */

import java.util.*;

public class Magic8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int range = 4;

        Random rand = new Random();

        int answer = rand.nextInt(range);

        String[] answers = {"Yes", "No", "Maybe", "Ask again later."};


        System.out.print("What's your question? ");
        String question = scan.next();

        System.out.printf("%s ",answers[answer]);

        scan.close();

    }
}

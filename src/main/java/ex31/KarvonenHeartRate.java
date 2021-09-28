package ex31;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Uday Gudipudi
 */

import java.util.*;

public class KarvonenHeartRate {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int check = 0;

        while (check == 0){

            System.out.printf("Resting Pulse: ");

            if(scan.hasNextDouble()){

                double pulse = scan.nextDouble();

                System.out.printf("Age: ");

                if(scan.hasNextDouble()){

                    double age  = scan.nextDouble();

                    System.out.printf("Intensity: \t|");
                    System.out.printf("Rate:");

                    for(double i = 55; i < 96; i = i + 5){

                        System.out.printf("%n");

                        double a = 220 - age;
                        double b = a - pulse;
                        double c = i / 100;
                        double d = b * c;
                        double e = d + pulse;

                        System.out.printf("%.0f%%       \t|",i);
                        System.out.printf("%.0f bpm",e);
                    }


                }

                check = 3;

            }
            else {

                scan.next();

                System.out.println("Sorry. That's not a valid input.");
            }

        }

        scan.close();
    }
}

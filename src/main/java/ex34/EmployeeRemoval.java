package ex34;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Uday Gudipudi
 */

import java.util.*;

public class EmployeeRemoval {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.printf("There are 5 employees: %n");

        String[] employees = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};

        for(int i = 0; i < 5; i++){

            System.out.printf("%s %n", employees[i]);

        }

        System.out.printf("Enter an employee name to remove: ");
        String employee = scan.next();

        System.out.printf("There are 4 employees: %n");


        if(employee.equals("John")){

            System.out.printf("%s %n", employees[1]);
            System.out.printf("%s %n", employees[2]);
            System.out.printf("%s %n", employees[3]);
            System.out.printf("%s %n", employees[4]);

        }

        if(employee.equals("Jackie")){

            System.out.printf("%s %n", employees[0]);
            System.out.printf("%s %n", employees[2]);
            System.out.printf("%s %n", employees[3]);
            System.out.printf("%s %n", employees[4]);

        }

        if(employee.equals("Chris")){

            System.out.printf("%s %n", employees[0]);
            System.out.printf("%s %n", employees[1]);
            System.out.printf("%s %n", employees[3]);
            System.out.printf("%s %n", employees[4]);

        }

        if(employee.equals("Amanda")){

            System.out.printf("%s %n", employees[0]);
            System.out.printf("%s %n", employees[1]);
            System.out.printf("%s %n", employees[2]);
            System.out.printf("%s %n", employees[4]);

        }

        if(employee.equals("Jeremy")){

            System.out.printf("%s %n", employees[0]);
            System.out.printf("%s %n", employees[1]);
            System.out.printf("%s %n", employees[2]);
            System.out.printf("%s %n", employees[3]);

        }

        scan.close();

    }
}

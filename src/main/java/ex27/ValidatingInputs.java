package ex27;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Uday Gudipudi
 */

import java.util.*;

public class ValidatingInputs {

    public static int validatefname(String fname){

        int error = 0;

        if(fname.length() == 0){

            System.out.printf("The first name must be filled in. %n");

            error++;

        }

        if(fname.length() < 2){

            System.out.printf("The first name must be at least 2 characters long. %n");

            error++;

        }

        return error;
    }

    public static int validatelname(String lname){

        int error = 0;

        if(lname.length() == 0){

            System.out.printf("The last name must be filled in. %n");

            error++;

        }

        if(lname.length() < 2){

            System.out.printf("The last name must be at least 2 characters long. %n");

            error++;

        }

        return error;
    }

    public static int validatezip(String zip){

        int error = 0;

        if(zip.length() != 5){

            System.out.printf("The zipcode must be a 5 digit number. %n");

            error++;

        }

        if (zip.matches(".*[a-z].*")) {

            System.out.printf("The zipcode must be a 5 digit number. %n");

            error++;

        }

        return error;
    }

    public static int validateid(String id){

        int error = 0;

        if(id.length() != 7){

            System.out.printf("The employee ID must be in the format of AA-1234. %n ");

            error++;

        }

        char[] array = new char[id.length()];

        for (int i = 0; i < id.length(); i++) {

            array[i] = id.charAt(i);
        }

        if (Character.isLetter(id.charAt(0)) && Character.isLetter(id.charAt(1)) && array[2] == '-'&& Character.isDigit(id.charAt(3)) && Character.isDigit(id.charAt(4)) && Character.isDigit(id.charAt(5)) && Character.isDigit(id.charAt(6))) {

            return error;

        }
        else{

            System.out.printf("The employee ID must be in the format of AA-1234. %n ");

            error++;

            return error;

        }

    }

    public static void validateInput(String fname, String lname, String zipcode, String id){

        int fnameerror = 0;
        int lnameerror = 0;
        int ziperror = 0;
        int iderror = 0;
        int error = 0;

        fnameerror = validatefname(fname);
        lnameerror = validatelname(lname);
        ziperror = validatezip(zipcode);
        iderror = validateid(id);

        error = fnameerror + lnameerror + ziperror + iderror;

        if (error == 0){

            System.out.printf("There were no errors found. ");

        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.printf("Enter the first name: ");
        String fname = scan.next();

        System.out.printf("Enter the last name: ");
        String lname = scan.next();

        System.out.printf("Enter the ZIP code: ");
        String zip = scan.next();

        System.out.printf("Enter the employee ID: ");
        String id = scan.next();

        validateInput(fname, lname, zip, id);

    }
}

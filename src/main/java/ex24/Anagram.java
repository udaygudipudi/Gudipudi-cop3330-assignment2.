package ex24;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Uday Gudipudi
 */


import java.util.*;
import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(char[] firststring, char[] secondstring){

        int firststringl = firststring.length;
        int secondstringl = secondstring.length;

        int length = firststringl;

        if(firststringl != secondstringl){

            return false;

        }

        Arrays.sort(firststring);
        Arrays.sort(secondstring);

        for (int i = 0; i < length ; i++){

            if (firststring[i] != secondstring[i]){

                return false;
            }

        }

        return true;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.printf("Enter two strings and I'll tell you if they are anagrams: %n");

        System.out.printf("Enter the first string: ");
        String firststring = scan.next();


        System.out.printf("Enter the second string: ");
        String secondstring = scan.next();

        int firstlength = firststring.length();
        int secondlength = secondstring.length();

        char[] charstring1 = new char[firstlength];

        for (int i = 0; i < firstlength; i++) {

            charstring1[i] = firststring.charAt(i);
        }

        char[] charstring2 = new char[secondlength];

        for (int i = 0; i < secondlength; i++) {

            charstring2[i] = secondstring.charAt(i);
        }

        if (isAnagram(charstring1, charstring2)){

            System.out.println(""+firststring+" and "+secondstring+" are anagrams.");

        }
        else{

            System.out.println(""+firststring+" and "+secondstring+" are not anagrams.");

        }

        scan.close();
    }
}


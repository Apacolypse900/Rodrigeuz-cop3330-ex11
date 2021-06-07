package com.examples;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jesus Rodriguez
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        int euros;
        double exchangerate;
        double total;
        double rounded;

        System.out.print("How many euros are exchanging? ");
            euros = myObj.nextInt();

        System.out.print("What is the exchange rate? ");
            exchangerate = myObj.nextFloat();

        total = (euros * exchangerate);
        rounded = Math.round(total * 100)/100.0;

        System.out.println(euros + " euros at an exchange rate of " + exchangerate + " is");
        System.out.println(rounded + " U.S. dollars");

    }
}

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises;
import java.util.Scanner;

public class TaxCalculator
{
    public static void main( String[] args ) {
        final double tax = 5.5;
        final String state = "WI";
        Scanner in = new Scanner(System.in);

        //input
        System.out.print("What is the order amount? ");
        String input = in.nextLine();
        double amount = Double.parseDouble(input);
        System.out.print("What is the state? ");
        String userState = in.nextLine();

        //processing and output
        String subtotalStatement = "";
        String taxStatement = "";
        double total = amount;

        if (userState.equalsIgnoreCase(state))
        {
            double taxAmount = tax * amount / 100;
            total = amount + taxAmount;
            subtotalStatement = "The subtotal is $" + amount + ".\n";
            taxStatement = "The tax is $" + taxAmount + ".\n";
        }

        if(total * 1000 % 10 > 5)
        {
            total += 0.01;
        }

        String totalStatement = "The total is $" + total + ".";
        System.out.println(subtotalStatement + taxStatement + totalStatement);
    }
}

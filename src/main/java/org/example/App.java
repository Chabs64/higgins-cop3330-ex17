package org.example;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Chad Higgins
 */

/*
Sometimes you have to perform a more complex calculation based on some provided inputs
and then use that result to make a determination.

Create a program that prompts for your weight, gender, total alcohol consumed (in ounces),
and the amount of time since your last drink. Calculate your blood alcohol content (BAC) using this formula

BAC = (A × 5.14 / W × r) − .015 × H
where

A is total alcohol consumed, in ounces (oz).
W is body weight in pounds.
r is the alcohol distribution ratio:
0.73 for men
0.66 for women
H is number of hours since the last drink.
Display whether or not it’s legal to drive by comparing the blood alcohol content to 0.08.

Example Output
Enter a 1 is you are male or a 2 if you are female: 1
How many ounces of alcohol did you have? 3
What is your weight, in pounds? 175
How many hours has it been since your last drink? 1

Your BAC is 0.049323
It is legal for you to drive.

Enter a 1 is you are male or a 2 if you are female: 1
How many ounces of alcohol did you have? 5
What is your weight, in pounds? 175
How many hours has it been since your last drink? 1

Your BAC is 0.092206
It is not legal for you to drive.

Constraint
Prevent the user from entering non-numeric values.
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a 1 is you are male or a 2 if you are female: ");
        int gender = 0;
        while(gender != 1 && gender != 2)
        {
            gender = in.nextInt();
        }

        double dRatio = 0;
        if(gender == 1)
        {
            dRatio = 0.73;
        }
        else
        {
            dRatio = 0.66;
        }

        System.out.println("How many ounces of alcohol did you have? ");
        double amountAlcohol = 0;
        while(amountAlcohol <= 0)
        {
            amountAlcohol = in.nextDouble();
        }

        System.out.println("What is your weight, in pounds?");
        double yourWeight = 0;
        while(yourWeight <= 0)
        {
            yourWeight = in.nextDouble();
        }

        System.out.println("How many hours has it been since your last drink?");
        double time = -1;
        while(time < 0)
        {
            time = in.nextInt();
        }

        //BAC = (A × 5.14 / W × r) − .015 × H
        /*
        A is total alcohol consumed, in ounces (oz).
        W is body weight in pounds.
        r is the alcohol distribution ratio:
        0.73 for men, 0.66 for women
        H is number of hours since the last drink.
        Display whether or not it’s legal to drive by comparing the blood alcohol content to 0.08.
         */

        double BAC = (amountAlcohol*5.14/yourWeight*dRatio)-(.015*time);

        double LegalBAC = 0.08;
        if(BAC < LegalBAC)
        {
            System.out.println("Your BAC is "+BAC+"\nIt is legal for you to drive.");
        }
        else
        {
            System.out.println("Your BAC is "+BAC+"\nIt is not legal for you to drive.");
        }
    }
}

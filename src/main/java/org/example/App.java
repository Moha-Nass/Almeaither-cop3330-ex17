package org.example;

import java.util.Scanner;

/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Mohammed_Almeaither
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Exercise 17 - Blood Alcohol Calculator");

        double male, ouncesalcohol, weight, hours, BAC,ratio = 0.00;


        System.out.print("Enter a 1 is you are male or 2 if you are female: ");
        Scanner in = new Scanner(System.in);
        male = Double.parseDouble(in.next());

        if (male== 1)
        {
            ratio = 0.73;
        }
        else {
            ratio = 0.66;
        }
        System.out.print("How many ounces of alcohol did you have? ");
        ouncesalcohol = Double.parseDouble(in.next());


        System.out.print("What is your weight, in pounds? ");
        weight = in.nextInt();


        System.out.print("How many hours has it been since your last drink?");
        hours = Double.parseDouble(in.next());

        BAC = ouncesalcohol * 5.14*ratio /weight;
        BAC = BAC - 0.15 * hours;


        System.out.println("Your BAC is "+BAC);
        if(BAC>0.08)
            System.out.println("It is not legal for you to derive.");
        else
            System.out.println("It is legal for you to derive.");


    }
}

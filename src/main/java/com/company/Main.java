package com.company;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Sean McCormack
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.printf("What is your weight in pounds? ");
        double weight = Integer.parseInt(scan.nextLine());
        System.out.printf("What is your height in inches? ");
        double height= Integer.parseInt(scan.nextLine());

        double bmi = Math.ceil(((double)(weight/(height*height)))*703*10)/10;
        System.out.println("Your BMI is "+bmi);
        // write your code here
    }
}

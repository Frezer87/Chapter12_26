package com.frezer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double value = 0.0, sum = 0.0;

        do {
            System.out.println("Enter a number, Enter 0 to get the result ");

            try {
                value = keyboard.nextDouble();
                sum += value;

            } catch (InputMismatchException e) {
                System.out.println("Your input is not valid, enter a number ");

            }
        }while (value!=0);
        System.out.println("The sum is: " + sum);
    }
}

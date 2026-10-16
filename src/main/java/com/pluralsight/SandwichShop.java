package com.pluralsight;

import java.util.*;

public class SandwichShop {
    public static void main(String[] args){

        //Setting up the scanner.
        Scanner myScanner = new Scanner(System.in);

        System.out.println("   1. Regular - $5.45");
        System.out.println("   2. Large -   $8.95");
        System.out.println("What sandwich would you like?");

        int size = myScanner.nextInt();

        // Asking for sandwich
        double price = 0;

        if (size == 1) {
            price = 5.45;
        } else {
            price = 8.95;
        }

        System.out.println(price);

        // Asking for customer info

        System.out.println("Enter your age: ");
        int age = myScanner.nextInt();

        double discount = 0.0;

        if (age <= 17) {
            discount = price * 0.10;
            price = price - discount;
        } else if (age >= 65) {
            discount = price * 0.20;
            price = price - discount;
        } else {
            price = price;
        }

        System.out.println("Your total is: " + String.format("$%.2f", price));
    }
}
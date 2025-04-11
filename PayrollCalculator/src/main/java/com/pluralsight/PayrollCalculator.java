package com.pluralsight;

import java.util.*;

public class PayrollCalculator {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println();

        System.out.print("Please enter number of hours worked: ");
        String hourString = scanner.nextLine();
        double hoursWorked = Double.parseDouble(hourString);
        System.out.println();

        System.out.print("Enter your pay rate: ");
        String payString = scanner.nextLine();
        double payRate = Double.parseDouble(payString);
        System.out.println();

        double grossPay = 0;

        if (hoursWorked <= 40) {
            grossPay = hoursWorked * payRate;

        }
        else {
            grossPay = (40 * payRate) + ((hoursWorked - 40) * (payRate * 1.5));
        }

        System.out.printf(name + ", your gross pay for the week is: $" + "%.2f", grossPay);



    }
}

package com.pluralsight;

import java.util.*;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number:");
        double firstNumber = scanner.nextDouble(); //this input works
        System.out.println();

        System.out.print("Enter the second number:");
        double secondNumber = scanner.nextDouble(); //this input works
        scanner.nextLine();
        System.out.println();


        System.out.println("what math operation would you like to do?");
        System.out.println("(A)ddition");
        System.out.println("(S)ubtraction");
        System.out.println("(M)ultiplication");
        System.out.println("(D)ivision");

        System.out.print("Input your choice here: ");
        String operationType = scanner.nextLine(); //program is not pausing here for input
        System.out.println();


        double solution = 0;

        if (operationType.equalsIgnoreCase("A")) {
            solution = firstNumber + secondNumber;
        }
        else if (operationType.equalsIgnoreCase("S")) {
            solution =  firstNumber - secondNumber;
        }
        else if (operationType.equalsIgnoreCase("M")) {
            solution = firstNumber * secondNumber;
        }
        else if (operationType.equalsIgnoreCase("D")) {
            solution = firstNumber / secondNumber;
        }
        else {
            System.out.println("ERROR");
        }

        System.out.println("The answer is: " + solution);

    }
}

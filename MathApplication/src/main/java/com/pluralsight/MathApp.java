package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

//        Question 1:
//        declare variables here
        double bobSalary = 52000;
        double garySalary = 200000.98;

//        then code the solution
        double highestSalary = Math.max(bobSalary, garySalary);

//        then use System.out.println("The answer is " + answer);
        System.out.println("The highest salary is " + highestSalary);

        //Question 2

        //variables
        double carPrice = 13000.50;
        double truckPrice = 15000.75;

        //solution
        double cheaperVehicle = Math.min(carPrice, truckPrice);

        //output
        System.out.println("The cheaper vehicle is " + cheaperVehicle);

        //Question 3

        //variables
        double circleRadius = 7.25;

        //solution
        double circleArea = Math.PI * Math.pow(circleRadius, 2); //circleRadius * circleRadius

        //output
        System.out.println("The area of the circle is " + circleArea);

        //Question 4

        //variables
        int number = 5;

        //solution
        double numberRoot = Math.sqrt(number);

        //output
        System.out.println("The number's square root is " + numberRoot);

        //Question 5


        //Variables
        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;

        //solution
        double distance = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2))); //square root of (x2-x1)^s + (y2-y1)^2

        //output
        System.out.println("The distance between the points is: " + distance);


        //Question 6

        //variables
        double rawValue = -3.8;

        //solution
        double absValue = Math.abs(rawValue);

        //output
        System.out.println("The absolute value is " + absValue);

        //Question 7

        //variables
        double randomFrac;

        //solution
        randomFrac = Math.random();

        //output
        System.out.printf("Here's a random number from 0 to 1: %.3f", randomFrac);


    }
}

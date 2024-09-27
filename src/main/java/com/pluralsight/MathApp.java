package com.pluralsight;

public class MathApp {
    public static void main(String[] args){
        // Question 1:
        double bobSalary = 85000.00;
        double garySalary = 90000.00;
        double highestSalary = Math.max(bobSalary, garySalary);
        if (highestSalary == bobSalary)
            System.out.println("Bob has the higher salary with " + highestSalary);
        else{
            System.out.println("Gary has the higher salary with " + highestSalary);
        }

        //Question 2:
        int carPrice = 40000;
        int truckPrice = 60000;
        int cheapestPrice = Math.min(carPrice, truckPrice);
        if (cheapestPrice == truckPrice)
            System.out.println("The truck is cheaper: " + cheapestPrice);
        else{
            System.out.println("The car is cheaper: " + cheapestPrice);
        }

        //Qeustion 3:
        double radius = 7.25;
        double pi = Math.PI;
        double area = pi * Math.pow(radius, 2);

        System.out.println("The area of a circle with radius " + radius + " is: " + area);

        //Question 4:
        double originalVal = 5.0;
        double originalValSqRt = Math.sqrt(originalVal);

        System.out.println("The square of " + originalVal + " is: " + originalValSqRt);

        //Question 5:
        double x1 = 5.0;
        double x2 = 85.0;
        double y1 = 10.0;
        double y2 = 50.0;
        double distanceFormula = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow(y2-y1, 2));
        System.out.println("The distance between (5,10) and (85,50) is: " + distanceFormula);

        //Question 6:
        double negativeVal = -3.8;
        double absVal = Math.abs(negativeVal);
        System.out.println("The absolute value of " + negativeVal + " is: " + absVal);

        //Question 7:
        double randNum = Math.random();
        System.out.println("Here is a random number between 0 and 1: " + randNum);
    }
}

package org.launchcode.java.studios.areaofacircle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius = 0;
        //double pi = 3.14159265358979;
        Scanner input = new Scanner(System.in);
//        System.out.println("What is the radius:");
//        try {
//            radius = input.nextDouble();
//        } catch(InputMismatchException error) {
//            System.out.println("Please enter a valid radius " + error);
//         //   return;
//        }
//
//        if(radius <= 0) {
//            System.out.println("Please enter a valid radius.");
//        //    return;
//        }

        do {
             System.out.println("What is the radius:");
        try {
            radius = input.nextDouble();
        } catch(InputMismatchException error) {
            System.out.println("Please enter a valid radius " + error);
            return;
        }

        if(radius <= 0) {
            System.out.println("Please enter a valid radius.");
        //    return;
        }
        } while (radius < 0);


        double areaOfCircle = Circle.getArea(radius);
        input.close();
        System.out.println("The area of the circle is " + areaOfCircle);

    }
}



package org.launchcode;
import java.util.Scanner;


public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius;
        radius = input.nextDouble();

        input.close();
//        double area = Math.PI * (radius * radius);
        double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
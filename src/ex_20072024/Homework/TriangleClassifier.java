package ex_20072024.Homework;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        // Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides, determine
        // if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal), or
        // scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.
        // side1, side2, side3 ->

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lengths side1: ");
        int side1 = sc.nextInt();
        System.out.println("Enter the lengths side2: ");
        int side2 = sc.nextInt();
        System.out.println("Enter the lengths side3: ");
        int side3 = sc.nextInt();

        if (side1 == side2 && side2 == side3 && side1 == side3){
            System.out.println("The triangle is Equilateral");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("The triangle is Isosceles");
        }
        else {
            System.out.println("scalene");
        }
        sc.close();
    }
}

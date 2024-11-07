package ex_20072024.Homework;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = sc.nextInt();

        if (year % 4 == 0){
            System.out.println("Its Leap Year");
        }
        else {
            System.out.println("Its Not Leap Year");
        }
        sc.close();
    }
}

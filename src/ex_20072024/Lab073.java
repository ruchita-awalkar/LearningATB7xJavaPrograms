package ex_20072024;

import java.util.Scanner;

public class Lab073 {
    public static void main(String[] args) {
        // Max num in 2 inputs

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. 1");
        int num1 = sc.nextInt();

        System.out.println("Enter no. 2");
        int num2 = sc.nextInt();

        //System.out.println(Math.max(num1,num2));

        if (num1 > num2){
            System.out.println(num1);
        }
        else if (num2 > num1){
            System.out.println(num2);
        }
        else {
            System.out.println("Both are equal");
        }
    }
}

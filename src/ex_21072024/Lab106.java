package ex_21072024;

import java.util.Scanner;

public class Lab106 {
    public static void main(String[] args) {
        // Factorial program
        //n = 5 -> fact = 5*4*3*2*1 = 120
        //n = 3 -> fact = 3*2*1 = 6

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int fact = 1;
        for (int i =1; i<=n; i++){
            fact = fact*i;
        }
        System.out.println("Factorial is -> "+ fact);
    }
}

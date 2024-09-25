package ex_20072024;

import java.util.Scanner;

public class Lab081 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the char to check if its vowel");
        char user_input = sc.next().charAt(0);

        switch (user_input){
            case 'a', 'e','i','o','u':
                System.out.println("its Vowel");
                break;
            default:
                System.out.println("Its not a vowel");
        }
    }
}

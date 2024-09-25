package ex_20072024;

import java.util.Scanner;

public class Lab078 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char and check if its vowel or not");
        char user_input = sc.next().charAt(0);

        switch (user_input){
            case 'a':
                System.out.println("Its Vowel");
                break;
            case 'e':
                System.out.println("Its Vowel");
                break;
            case 'i':
                System.out.println("Its Vowel");
                break;
            case 'o':
                System.out.println("Its Vowel");
                break;
            case 'u':
                System.out.println("Its Vowel");
                break;
            default:
                System.out.println("Not a vowel, its a consonant");
        }
    }
}

package ex_20072024;

import java.util.Scanner;

public class Lab072 {
    public static void main(String[] args) {
        //take user input and check num is even or odd

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int user_input = sc.nextInt();

        if(user_input%2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}

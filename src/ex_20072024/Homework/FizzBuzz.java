package ex_20072024.Homework;

public class FizzBuzz {
    public static void main(String[] args) {
//Write a program that prints numbers from 1 to 100.
// However, for multiples of 3, print "Fizz" instead of the number,
// and for multiples of 5, print "Buzz."
// For numbers that are multiples of both 3 and 5, print "FizzBuzz.

        int a = 1;
        for (int i = 1; i <= 100; i++)
        {
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (a % 5 == 0) {
                System.out.println("Buzz");
            } else if (a % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(a);
            }
            a++;

        }
    }
}

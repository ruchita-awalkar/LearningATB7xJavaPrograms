package ex_27042024;

import java.util.Scanner;

public class Lab118 {
    public static void main(String[] args) {
        //enter 5 subject marks and find the avg marks from them.

        Scanner sc = new Scanner(System.in);
        float [] marks = new float[5];
        for(int i=0; i < marks.length; i++){
            System.out.println("Marks of the subject"+ (i+1));
            marks[i] = sc.nextFloat();
        }

        float avg = marks[0]+marks[1]+marks[2]+marks[3]+marks[4]/5;
        System.out.println("Average is ->"+ avg);

        sc.close();
    }
}

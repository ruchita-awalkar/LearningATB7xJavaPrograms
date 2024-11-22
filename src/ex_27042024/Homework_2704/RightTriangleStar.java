package ex_27042024.Homework_2704;

public class RightTriangleStar {
    public static void main(String[] args) {

        /*
        *
        **
        ***
        ****
        *****
         */

        for(int i = 1; i <= 5; i++){

            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}

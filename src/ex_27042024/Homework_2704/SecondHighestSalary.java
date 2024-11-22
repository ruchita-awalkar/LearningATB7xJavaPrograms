package ex_27042024.Homework_2704;

import java.util.Arrays;

public class SecondHighestSalary {
    public static void main(String[] args) {

        int[] salary = {7, 10, 4, 13, 25,28,30, 21, 9, 8, 17};
        int max = salary[0];
        int Second_highest = salary[0];
        
        for (int i=1; i < salary.length; i++){
            if (salary[i] > max){
                Second_highest = max;
                max = salary[i];
            }
             else if (salary[i] > Second_highest && salary[i] != max) {
                Second_highest = salary[i];
            }

        }
        System.out.println("The highest salary is: "+max);
        System.out.println("The second-highest salary is: "+Second_highest);


        //Alternate option
//        Arrays.sort(salary);
//        System.out.println(salary[salary.length - 2]);


    }
}

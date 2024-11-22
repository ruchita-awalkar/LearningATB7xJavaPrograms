package ex_27042024;

import java.util.Arrays;

public class LAb119 {
    public static void main(String[] args) {
        //find the max and min salary in array

        int [] salary = {14,8,20,4,7,9,25,28};

        int max = 1;
        int min = salary[0];
        for (int i=0; i < salary.length; i++){
            if (salary[i] > max){
                max = salary[i];
            }
            if (min > salary[i]){
                min = salary[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

//        Arrays.sort(salary);
//        System.out.println(salary[salary.length - 2]);
    }
}

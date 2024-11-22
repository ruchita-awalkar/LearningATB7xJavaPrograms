package ex_27042024;

public class Lab120 {
    public static void main(String[] args) {
        //2D array

        int [][] arr_2d = {
                {34, 12, 11},
                {22, 33, 44},
                {45, 78, 90}
        };

       for(int i=0; i < arr_2d.length; i++){
           for(int j=0; j < arr_2d[i].length; j++){
               System.out.println(arr_2d[i][j]);
           }
       }

    }
}

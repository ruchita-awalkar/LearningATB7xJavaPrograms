package ex_14072024;

public class Lab047 {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45F;
        //int total = course + GST; //implicit narrowing by jvm
        int total = course + (int)GST; //explicit narrowing - .45 money loss
        System.out.println(total);


    }
}

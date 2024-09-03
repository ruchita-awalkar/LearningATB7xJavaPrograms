package ex_14072024;

public class Lab048 {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45F;
        //int total = course + GST; //implicit narrowing by jvm
        float total = course + GST; //explicit narrowing
        System.out.println(total);
    }
}

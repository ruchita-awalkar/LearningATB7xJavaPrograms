package ex_21072024;

public class Lab101 {
    public static void main(String[] args) {

        int i;
        for (i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5) {
                continue;
            }
            System.out.println("after");
        }
    }
}

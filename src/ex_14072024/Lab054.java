package ex_14072024;

public class Lab054 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);
        //A -> ++a, Exp = 11 / a = 11
        //+
        //B -> a++, Exp = 11 / a =12
        //+
        //C -> a++, Exp = 12 / a = 13
    }
}

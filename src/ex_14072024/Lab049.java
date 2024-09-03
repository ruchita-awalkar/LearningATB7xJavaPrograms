package ex_14072024;

public class Lab049 {
    public static void main(String[] args) {
        //Increment (++), Decrement (--) operators
        // pre and post

        //pre increment - value is incremented first and then stored in result
//        int a = 10;
//        int b = ++a; // a=a+1
//        System.out.println(a);
//        System.out.println(b);

        int a = 10;
        System.out.println(++a);

        //Post increment - value is stored in result first and incremented later
        int a_post = 10;
        System.out.println(a_post++);
        System.out.println(a_post);

    }
}

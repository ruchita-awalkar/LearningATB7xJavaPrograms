package ex_14072024;

public class Lab056 {
    public static void main(String[] args) {
        String name = "Pramod";

        String name2 = new String("Pramod");
        //we can create string in 2 ways
        // = , new operator
        // = store value in String constant pool
        // new - object (heap)

        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(4));
        System.out.println(name.charAt(10)); // Exception
    }
}

package ex_14072024;

public class Lab061 {
    public static void main(String[] args) {
        String s1 = new String("Pramod");
        String s2 = new String("Pramod");
        String s3 = new String("Pramod");

        System.out.println(s1==s2); //check for reference
        System.out.println(s2==s3); //check for reference
        System.out.println(s2.equals(s3)); //check for content
    }
}

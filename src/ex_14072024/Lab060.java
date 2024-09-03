package ex_14072024;

public class Lab060 {
    public static void main(String[] args) {
        String name = "The Testing Academy"; //SCP
        String name1 = "The Testing Academy"; //SCP

//        System.out.println(name == name1); // check for the reference
//        System.out.println(name.equals(name1)); //check for the content

        String name2 = new String("The Testing Academy");

        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2)); // check for content
    }
}

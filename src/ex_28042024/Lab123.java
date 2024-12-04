package ex_28042024;

public class Lab123 {
    public static void main(String[] args) {

        Person person = new Person();
        person.name = "Pramod";
        person.roll_no = 5;

        Person person2 = new Person();
        person2.name = "Dutta";
        person2.roll_no = 10;

        person.read();
        person2.walk();
    }

}

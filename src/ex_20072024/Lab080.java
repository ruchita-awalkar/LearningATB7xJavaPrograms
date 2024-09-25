package ex_20072024;

public class Lab080 {
    public static void main(String[] args) {
        //jdk>13

        int itemcode = 004;

        switch (itemcode){
            case 001 -> System.out.println("its a laptop");
            case 002 -> System.out.println("its a desktop");
            case 003, 004 -> System.out.println("its a Mobile");
        }
    }
}

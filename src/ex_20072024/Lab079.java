package ex_20072024;

public class Lab079 {
    public static void main(String[] args) {
    //jdk>13
        int itemcode = 010;

        switch (itemcode){
            case 001,002,003 :
                System.out.println("Its electronic gadget");
                break;
            case 004,005,006:
                System.out.println("Its Mechanical gadget");
                break;
            default:
                System.out.println("None");
        }
    }
}

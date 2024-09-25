package ex_20072024;

public class Lab082 {
    public static void main(String[] args) {

        char code = 'A';
        int val = switch (code){
            case 'A':
                yield 65; //return
            case 'B':
                yield 66;
            default:
                throw new IllegalStateException("unexpected value " + code);

        };
        System.out.println(val);

    }
}

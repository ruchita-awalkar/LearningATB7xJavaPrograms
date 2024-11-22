package ex_27042024;

public class Lab121 {
    public static void main(String[] args) {

        String s1 = "Pramod";
        s1 = "Dutta";

        System.out.println(s1);

        StringBuffer stringBuffer = new StringBuffer("Testing");
        stringBuffer.append("Academy");
        stringBuffer.append("7x");
        System.out.println(stringBuffer);

        StringBuilder stringBuilder = new StringBuilder("Pramod");
        stringBuilder.append("Dutta");
        stringBuilder.append("Ji");
        System.out.println(stringBuilder);
    }
}

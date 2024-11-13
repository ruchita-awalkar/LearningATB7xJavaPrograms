package ex_21072024;

public class Lab111 {
    public static void main(String[] args) {
        //Function type
        //1. Without parameters and without return type
        //2. Without parameters but with return type
        //3. With parameters and without return type
        //4. With parameters and wit return type

        function_type1();
        System.out.println(" ------------------ ");

        String name = function_type2();
        System.out.println(name);
        System.out.println(" ------------------ ");

        function_type3("Software Testing");
        System.out.println(" ------------------ ");

        int result = function_type4(4,5);
        System.out.println("Output is -> "+result);
        System.out.println(" ------------------ ");
    }

    static void function_type1(){
        System.out.println("1. Without parameters and without return type");
    }

    static String function_type2(){
        System.out.println("2. Without parameters but with return type");
        return "TestingAcademy";
    }

    static void function_type3(String name) {
        System.out.println("3. With parameters and without return type");
        System.out.println("You have shared - "+ name);
    }

    static int function_type4(int a,int b){
        System.out.println("4. With parameters and wit return type");
        return a+b;
    }
}

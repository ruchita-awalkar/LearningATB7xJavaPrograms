package ex_20072024;

import java.util.Scanner;

public class Lab077 {
    public static void main(String[] args) {
        //Web automation which browser to use

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name!!!");
        String browserName = sc.next();
        browserName = browserName.toLowerCase();

        switch (browserName){
            case "chrome":
                System.out.println("Starting the chrome browser");
                break;
            case "firefox":
                System.out.println("Starting the Firefox browser");
                break;
            case "edge":
                System.out.println("Executing the edge code");
            default:
                System.out.println("I have no idea which browser is this");
                break;

        }
    }
}

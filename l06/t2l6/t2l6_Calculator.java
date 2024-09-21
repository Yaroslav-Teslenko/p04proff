package l06.t2l6;


import java.util.Scanner;

/**
 * @author Yar
 * This main class
 */
public class t2l6_Calculator {
    double a, b;
    public static void main(String[] args) throws Exception {



        Scanner input = new Scanner(System.in);


        try {
            System.out.print("Input first number a=");
            a = input.nextDouble();
            System.out.print("Input second number b=");
            b = input.nextDouble();


            //----
            System.out.print("Input operations sign ");
            selectOperation(input.next(), a, b);
        } catch (RuntimeException e) {
            System.out.println("Input errors: " + e);
//            System.out.println();
//            StackTraceElement[] tt= e.getStackTrace();
//            for (int i = 0; i < tt.length; i++) {
//                System.out.println(tt[i].toString());;
//            }
        }

    }

    public static void selectOperation(String sign, double a, double b) throws Exception {
        switch (sign) {
            case "+" -> add(a, b);
            case "-" -> sub(a, b);
            case "*" -> mul(a, b);
            case "/" -> div(a, b);
            default -> throw new Exception("Its a wrong sign");
        }
    }

    ;

    /**
     * calculate sum
     *
     * @return a+b
     */
    public static void add(double a, double b) {
        System.out.print("a+b=");
        System.out.println(a + b);
    }

    ;

    /**
     * calculate sub
     *
     * @return a-b
     */
    public static void sub(double a, double b) {
        System.out.print("a-b=");
        System.out.println(a - b);
    }

    ;

    /**
     * calculate mul
     *
     * @return a*b
     */
    public static void mul(double a, double b) {
        System.out.print("a-b=");
        System.out.println(a * b);
    }

    ;

    /**
     * calculate div
     *
     * @return a/b
     */
    public static void div(double a, double b) throws Exception {
        if (b == 0) throw new Exception("Cannot be divided by 0");
        else {
            System.out.print("a/b=");
            System.out.println(a / b);
        }
    }


}

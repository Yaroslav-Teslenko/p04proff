package l06.t2l6;


import java.util.Scanner;

/**
 * @author Yar
 * This main class
 */
public class t2l6_Calculator {
    private double a, b;
    private  String sign;
    public void selectOperation() throws Exception {
        switch (sign) {
            case "+" -> add(a, b);
            case "-" -> sub(a, b);
            case "*" -> mul(a, b);
            case "/" -> div(a, b);
            default -> throw new Exception("Its a wrong sign");
        }
    }

    public t2l6_Calculator() {
        this.a = 0;
        this.b = 0;
        this.sign = "+";
    }
    public t2l6_Calculator(double a, double b, String sign) {
        this.a = a;
        this.b = b;
        this.sign = sign;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    /**
     * calculate sum
     *
     * @return a+b
     */
    public void add(double a, double b) {
        System.out.print("a+b=");
        System.out.println(a + b);
    }



    /**
     * calculate sub
     *
     * @return a-b
     */
    public void sub(double a, double b) {
        System.out.print("a-b=");
        System.out.println(a - b);
    }



    /**
     * calculate mul
     *
     * @return a*b
     */
    public void mul(double a, double b) {
        System.out.print("a-b=");
        System.out.println(a * b);
    }



    /**
     * calculate div
     *
     * @return a/b
     */
    public void div(double a, double b) throws Exception {
        if (b == 0) throw new Exception("Cannot be divided by 0");
        else {
            System.out.print("a/b=");
            System.out.println(a / b);
        }
    }


}

package l02.t2l2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class t2l2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Input text: ");
            list.add(scanner.nextLine());
            list.set(i, doubleValues1(list.get(i)));
            System.out.println(list.get(i));
        }
        //doubleValues(list);
        System.out.println(list);

    }

    public static void doubleValues(List<String> list) {
        int size = list.size()*2;
        for (int i = 0; i < size ; i+=2) {
            //System.out.println(i);
            list.add(i, list.get(i));
        }

    }
    public static String doubleValues1(String str) {
        String newStr="";
        for (int i = 0; i < str.length(); i++) {
            newStr+= new String(new char[]{str.charAt(i),str.charAt(i)});
        }
        return newStr;

    }
};

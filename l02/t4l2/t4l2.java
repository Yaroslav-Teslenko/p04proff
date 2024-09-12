package l02.t4l2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class t4l2 {
    public static void main(String[] args) {
        Map<String, String> family = new HashMap<>();
        family.put("Kyiv", "Smith");
        family.put("London", "Windzor");
        family.put("Madrid", "Lopes");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input city: ");
        String city=scanner.next();
        System.out.println(family.get(city));

    }
};

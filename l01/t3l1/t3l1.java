package l01.t3l1;

import java.util.Arrays;

public class t3l1 {
    public static void main(String[] args) {
/*        Car c1 = new Car(190, 8000, "BMW", "Red");
        Car c2 = new Car(190, 2000, "Opel", "Black");
        Car c3 = new Car(185, 10000, "Mercedes", "White");*/

        Car c1 = new Car(110, 1000, "BMW", "Red");
        Car c2 = new Car(190, 1000, "BMW", "Black");
        Car c3 = new Car(190, 100, "BMW", "White");

        Car[] c = {c1, c2, c3};

        Arrays.sort(c);   // ClassCastException
        for (Car temp : c) {
            System.out.println(temp);
        }
    }
};

package l01.t2l1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class t2l1 {

    /*Виведення на екран елементів List: Створити список, заповнити його на 10 елементів
    та вивести на екран вміст, використовуючи iterator.*/
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int)(100*Math.random()));
        }
        System.out.println(list);
        System.out.println("***");

        ListIterator lite= list.listIterator();
        while (lite.hasNext()) {
            Object tmp= lite.next();
            lite.set((int)tmp/2);
        }
        System.out.println(list);

        Iterator ite= list.iterator();
        while (ite.hasNext()) {
            Object tmp= ite.next();
            ite.remove();
        }
        System.out.println(list);



    }
};

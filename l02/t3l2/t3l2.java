package l02.t3l2;

import java.util.*;

public class t3l2 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input N: ");
        int n=scanner.nextInt();
        getIntegerList(n, list);
        System.out.println(list);
        System.out.println(getMinimum(list));
        System.out.println(list);
    }
    public static void getIntegerList(int n, List<Integer> list){
        for (int i = 0; i < n; i++) {

          list.add((int)(100*Math.random()));

        }
    }

    public static int getMinimum(List<Integer> list){
        Collections.sort(list);
        return ((LinkedList<Integer>)list).getFirst();
    }
};

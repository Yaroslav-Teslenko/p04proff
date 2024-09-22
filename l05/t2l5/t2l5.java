package l05.t2l5;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class t2l5 {

    /*Напишіть програму, яка виводитиме всю інформацію про клас, користувач сам вибирає, який саме клас цікавить.*/

    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        //Integer num=scanner.nextInt();
        int num = 1;
        String className = "";
        System.out.println("1.   ");
        System.out.println(new testClass().getClass());
        //System.out.println(scanner.getClass().getName());
        switch (num) {
            case 1 : {  className = "l05.t2l5.testClass"; break;}
            case 2 : { className = "java.util.Scanner"; break;}
        }

        try {
            Class objClass = Class.forName(className);
            System.out.println("Name: " + objClass.getSimpleName());
            System.out.println("Fullname: " + objClass.getName());
            System.out.println("Name: parent" + objClass.getSuperclass());

            System.out.println("Modifiers___________");
            int modifiers = objClass.getModifiers();
            if (isModifierSet(modifiers, Modifier.PUBLIC)) System.out.println(" PUBLIC");
            if (isModifierSet(modifiers, Modifier.PRIVATE)) System.out.println(" PRIVATE");

            if (isModifierSet(modifiers, Modifier.FINAL)) System.out.println("  FINAL");

            System.out.println("Fields___________");
            Field[] fields = objClass.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(field.getName());
                modifiers = field.getModifiers();
                if (isModifierSet(modifiers, Modifier.PUBLIC)) System.out.println("  PUBLIC");
                if (isModifierSet(modifiers, Modifier.PRIVATE)) System.out.println("  PRIVATE");
            }

            System.out.println("Fields___________");
            Method[ ] methods = objClass.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println(method.getName());
                modifiers = method.getModifiers();
                if (isModifierSet(modifiers, Modifier.PUBLIC)) System.out.println("  PUBLIC");
                if (isModifierSet(modifiers, Modifier.PRIVATE)) System.out.println("  PRIVATE");
            }
        } catch (ClassNotFoundException e) {
        }


    }

    public static boolean isModifierSet(int allModifiers, int specificModifier) {
        return (allModifiers & specificModifier) > 0;
    }
};

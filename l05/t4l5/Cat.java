package l05.t4l5;

import java.lang.reflect.Field;

public class Cat extends Animal{
    public static void main(String[] args) {
        Animal animal= new Animal();
        System.out.println(animal.getAge());
        System.out.println(animal.getSize());
        System.out.println(animal.getColor());
        System.out.println("-----");
        int age;
        try{
            Field field = animal.getClass().getDeclaredField("age");
            field.setAccessible(true);
            field.set(animal,5);
            field = animal.getClass().getDeclaredField("size");
            field.set(animal,"small");
            field = animal.getClass().getDeclaredField("color");
            field.set(animal,"green");
         } catch (Exception e){}

        System.out.println(animal.getAge());
        System.out.println(animal.getSize());
        System.out.println(animal.getColor());
    }

}

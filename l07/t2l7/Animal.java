package l07.t2l7;

import java.io.Serializable;

public class Animal implements Serializable {
    private   int age=1;
    public String color="yeelow";
    protected String size="Big";

    public Animal() {

    }
    public Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}

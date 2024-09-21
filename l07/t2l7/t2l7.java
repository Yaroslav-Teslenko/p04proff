package l07.t2l7;



import java.io.*;

public class t2l7 {
    /*Необхідно здійснити десеріалізацію з файлу попереднього проекту (Animal) та вивести на екран вміст.*/
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setAge(14);
        animal.setSize("Big");
        animal.setColor("grey");

        // Створюємо об'єкт класу файл та вказуємо файл
        String nameF = System.getProperty("user.dir") + "/l07/t2l7/test.txt";
        try {


            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nameF));
            // Серіалізуємо об'єкт  у байт-код
            oos.writeObject(animal);
            oos.flush();
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nameF));
            // Десеріалізуємо об'єкт Car з байт-коду
            Animal animal1= (Animal) ois.readObject();
            ois.close();
            System.out.println(animal1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
};

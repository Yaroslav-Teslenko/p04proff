package com.itvdn.javaProfessional.ex_001_serialization.serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // Створюємо об'єкт класу файл та вказуємо файл
        File f = new File("D:/Course/Java Professional Course/007_Serialization_XML_and_JSON/007_Samples/src/com/itvdn/javaProfessional/ex_001_serialization/serialization/file1");
        Car c = new Car(5000, "BMW");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
        // Серіалізуємо об'єкт Car у байт-код
        oos.writeObject(c);
        oos.flush();
        oos.close();
    }
}

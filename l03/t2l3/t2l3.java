package l03.t2l3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class t2l3 {
    /*Створіть файл, запишіть у нього довільні дані та закрийте файл. Потім знову
    відкрийте цей файл, прочитайте дані і виведіть їх на консоль.*/
    public static void main(String[] args) {
        String path = System.getProperty("user.dir") + "/l03/t2l3/";
        //System.out.println(path);
        File newFile;
        try {
            newFile = createFile(path + "testfile.txt");
            saveToFile(newFile);
            showOnConsole(newFile);
            showOnConsole1(newFile);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static File createFile(String nameFile) throws IOException {
        File newFile = new File(nameFile);
        boolean created = newFile.createNewFile();
        if (created) System.out.println("File has been created");
        return newFile;
    }

    public static void saveToFile(File file) throws IOException {
        FileWriter writer = new FileWriter(file, false);
        String text = "Интерфейсы – это абстрактные типы данных, которые представляют коллекции. "
                + "Интерфейсы позволяют управлять коллекциями вне зависимости от деталей их представления. "
                + "В объектно-ориентированных языках интерфейсы обычно формируют иерархию.";
        writer.write(text);
        writer.close();
    }

    public static void showOnConsole(File file) throws IOException {
        FileReader reader = new FileReader(file);
        int c;
        while ((c = reader.read()) != -1) {
            System.out.print((char) c);
        }
        reader.close();
    }

    public static void showOnConsole1(File file) throws IOException {
        FileReader reader = new FileReader(file);
        char[] buf = new char[5];
        int c;
        while ((c = reader.read(buf)) > 0) {
            if (c < 5) {
                buf = Arrays.copyOf(buf, c);

            }
            System.out.println(buf);
        }
        reader.close();
    }
};

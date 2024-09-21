package l04.t2l4;


import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.lang.reflect.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class t2l4 {
    /*Напишіть жартівливу програму «Дешифратор», яка в текстовому файлі могла б замінити всі прийменники слово «Java».*/
    public static void main(String[] args) {
        String nameFile = System.getProperty("user.dir") + "/l04/t2l4/t2l4.txt";
        String regex = "(java)";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
           try {
            List<String> lines = Files.readAllLines(Paths.get(nameFile));
            for (int i = 0; i < lines.size(); i++) {
                lines.set(i, pattern.matcher(lines.get(i)).replaceAll("YYYY"));
                System.out.println(lines.get(i));
            }
            Files.writeString(Paths.get(nameFile), lines.toString());
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }}
}

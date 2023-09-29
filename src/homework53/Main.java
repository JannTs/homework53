package homework53;
/**
 * Task 1
 * Написать метод, читающий текстовый файл и возвращающий строку,
 * состоящую из строчек этого файла.
 */

import java.io.*;
import java.util.*;

public class Main {
    public static String readLinesToString(String fileName) throws IOException {
        List<String> strings = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String strLine;
            while ((strLine = br.readLine()) != null) {
                strings.add(strLine);
            }
        }
        return String.join(" ", strings);
    }

    public static void main(String[] args) {
        try {
            String fileName = "str lines.txt";
            System.out.println(readLinesToString(fileName));
        } catch (IOException exception) {
            exception.getMessage();
        }
    }
}


import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        File sourceFile = new File("D:/projects/lab4/src/file.txt");
        File destinationFile = new File("D:/projects/lab4/src/newFile.txt");

        try (Scanner scanner = new Scanner(sourceFile);
             FileWriter writer = new FileWriter(destinationFile)) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                writer.write(line);
                writer.write(System.lineSeparator());
            }

        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Ошибка при записи файла: " + e.getMessage());
        }
    }
}
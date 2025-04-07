package app;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {
    private final static String BASE_PATH = "files/";

    // запис
    public String writeFile(String fileName, String fileContent) {
        try (FileWriter fw = new FileWriter(BASE_PATH + fileName + ".txt")) {
            fw.write(fileContent);
            return "Success.";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    // читання
    public String readFile(String path) {
        try (FileReader reader = new FileReader(path)) {
            int symbol;
            StringBuilder stringBuilder = new StringBuilder();

            while ((symbol = reader.read()) != -1) {
                stringBuilder.append((char) symbol);
            }

            return stringBuilder.toString();
        } catch (IOException ex) {
            return ex.getMessage();
        }
    }
}
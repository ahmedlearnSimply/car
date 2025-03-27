package services;

import java.io.*;
import java.io.IOException;
import java.util.List;

public class fileStorageUtil {
    // save to file
    public static <T> void saveToFile(List<T> dataList, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(dataList);
        } catch (IOException e) {
            System.out.println("Error saving to file" + fileName);
        }
    }

    // load from file
    public static <T> List<T> LoadFromFile(String fileName) {
        File file = new File(fileName);

        if (!file.exists())
            return null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<T>) ois.readObject();

        } catch (IOException | ClassNotFoundException e1) {
            System.out.println("Error Loading fronm file" + fileName);
            return null;
        }
    }
}

package week_4_curriculum.week_4_curriclulum.class_actitvity4a;

import java.io.FileWriter;

public class FileWriterEx {
    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try{
            FileWriter fw = new FileWriter(desktopPath + "/new.csv");

            fw.write("I'm learning to write into a csv file");
            fw.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Successfully written into a CSV file");
    }
}

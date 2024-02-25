package week_4_curriculum.week_4_curriclulum.class_actitvity4a;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterEx {
    public static void main(String[] args) throws IOException {
        String desktopPath = System.getProperty("user.home") + "/Desktop";
        FileWriter wr = new FileWriter(desktopPath + "/output.csv");
        BufferedWriter br = new BufferedWriter(wr);
        br.write("I am still learning how to write into a CSV file");
        br.close();
        wr.close();
        System.out.println("Write successfully");
    }
}

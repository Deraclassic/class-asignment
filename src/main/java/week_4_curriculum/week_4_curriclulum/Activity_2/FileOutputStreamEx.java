package week_4_curriculum.week_4_curriclulum.Activity_2;
import java.io.FileOutputStream;
public class FileOutputStreamEx {
    public static void main(String[] args) {
        String desktopPath =System.getProperty("user.home") + "/Desktop";

        try {
            FileOutputStream out = new FileOutputStream(desktopPath + "/output.csv");
            String wr = "I am still learning how to write into a CSV file";
            byte[] bytes = wr.getBytes();
            out.write(bytes);
            out.close();

            System.out.println("Successful");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    }


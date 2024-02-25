package week_4_curriculum.week_4_curriclulum.class_actitvity4a;

import java.awt.*;
import java.io.File;

public class DeleteFileEx {
    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        File file = new File (desktopPath + "/output.csv");

        if(file.delete()){
            System.out.println("File deleted successfully");
        }else {
            System.out.println("failed to delete file");
        }
    }
}

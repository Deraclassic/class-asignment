package CSV;

import java.io.*;

public class csv {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/java/CSV/studentList - Sheet1.csv");
        boolean exist = file.exists();
        System.out.println(exist);
        long size = file.length();
        System.out.println(size);


        try {
            BufferedReader buffer = new BufferedReader(new FileReader(file));
            String line = " ";
            while ((line = buffer.readLine()) != null){
                String [] array = line.split(",");
                //System.out.println(line);
                System.out.println("Student name: " + array[0]);
            }
        }catch (FileNotFoundException e){

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    }
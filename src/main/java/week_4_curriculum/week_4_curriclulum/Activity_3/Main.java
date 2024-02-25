package week_4_curriculum.week_4_curriclulum.Activity_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] student = {
                new Student(001,"Oko","Amed","12/12/1901","Male", 20),
                new Student(002,"Eva","Ada","12/11/2001","female", 29),
                new Student(003,"James","Praise","12/11/2006","male", 22),
                new Student(004,"Okonkwo","Sani","12/11/1997","female", 35),
                new Student(005,"Mary","Rose","12/11/1987","female", 15)
        };

        String desktopPath = System.getProperty("user.home" ) + "/Desktop";

        try{
            FileWriter fw = new FileWriter(desktopPath + "/studentFile.csv");

            fw.write("Admission number, " + "First Name, " + " LastName, " + "Date of Birth, " + "Gender, " + "Age" + "\n");
            for(Student student1: student){
                fw.write(student1.getAdmissionNumber() + ", ");
                fw.write(student1.getFirstName() + ", ");
                fw.write(student1.getLastName() + ", ");
                fw.write(student1.getDateOfBirth() + ", ");
                fw.write(student1.getGender() + ", ");
                fw.write(student1.getAge() + ", " + "\n");

            }
            System.out.println("Student data has been written into the CSV file successfully");
            fw.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try{
            FileReader fr = new FileReader(desktopPath + "/studentFile.csv");
            BufferedReader br = new BufferedReader(fr);

            int i;
            while((i = br.read()) != -1){
                System.out.print((char) i);
            }
            fr.close();
            br.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

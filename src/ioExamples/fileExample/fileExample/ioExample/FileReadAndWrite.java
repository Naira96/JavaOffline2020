package ioExamples.fileExample.fileExample.ioExample;

import java.io.*;

public class FileReadAndWrite {
    private static final String FILE_PATH = "C:\\Users\\User\\JavaOffline2020\\src\\ioExamples\\fileExample\\fileExample\\ioExample\\example.txt";


    public static void main(String[] args) {

        //        write();
        read();
    }


    public static void write() throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            bw.append("Hasdfello Frasdfom JAVA \r\n");
            bw.append("Hasdfasdfello From JAVA!!!!!!!!!!!!!!!!!");
        }
    }

    public static void read() {
        try (BufferedReader inputStream = new BufferedReader(new FileReader(FILE_PATH))) {
//            String line = "";
//            while ((line = inputStream.readLine()) != null) {
//                System.out.println(line);
//            }
            int c;
            while ((c = inputStream.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

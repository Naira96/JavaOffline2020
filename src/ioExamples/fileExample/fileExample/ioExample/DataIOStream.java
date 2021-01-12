package ioExamples.fileExample.fileExample.ioExample;

import java.io.*;

public class DataIOStream {
    private static final String FILE_PATH = "C:\\Users\\User\\JavaOffline2020\\src\\ioExamples\\fileExample\\fileExample\\ioExample\\example.txt";

    public static void main(String[] args) {

        // write();
        //read();

    }

//    public static void write() throws IOException {
//        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(FILE_PATH))) {
//            out.writeInt(33);
//            out.writeInt(66);
//            out.writeBoolean(false);
//            out.writeUTF("Բարև");
//        }
//    }

    public static void read() throws IOException {
        DataInputStream inputStream = new DataInputStream(new FileInputStream(FILE_PATH));
        System.out.println(inputStream.readInt());
        System.out.println(inputStream.readInt());
        System.out.println(inputStream.readBoolean());
        System.out.println(inputStream.readUTF());

        inputStream.close();
    }
}



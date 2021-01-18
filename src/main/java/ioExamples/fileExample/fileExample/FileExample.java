package ioExamples.fileExample.fileExample;

import java.io.File;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) {

        File folder = new File("D:\\gitc2018");
        System.out.println(folder.isFile());
        System.out.println(folder.isDirectory());
        File[] list = folder.listFiles();
        File parent = folder.getParentFile();
        for (File file : parent.listFiles()) {
            System.out.println(file.getName());
        }
        for (File s : list) {
            System.out.println(s.getAbsoluteFile());
        }

        File file = new File("D:\\gitc2018\\example.txt");
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.length());
        System.out.println(new Date(file.lastModified()));
//        file.delete();
//        if (!file.exists()) {
//            try {
//                boolean newFileCreated = file.createNewFile();
//                if (newFileCreated) {
//                    System.out.println("folder created");
//                }
//            } catch (IOException e) {
//                System.out.println("Can't create folder");
//
//            }
//        }
//        System.out.println(file.exists());


    }
}

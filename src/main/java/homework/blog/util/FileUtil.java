package homework.blog.util;

import homework.blog.model.Post;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class FileUtil {

    private static final String POST_PATH = "C:\\Users\\User\\JavaOffline2020\\src\\homework\\blog\\file\\post.txt";


   public static void serializePostPath(List<Post> postList){
       createdFileIfNotExists(POST_PATH);
       try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(POST_PATH))){
           outputStream.writeObject(postList);

       }catch (IOException e){
           System.out.println(POST_PATH + " does not exists");
       }


   }


    public static List<Post> deserializePostList () {
       createdFileIfNotExists(POST_PATH);
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(POST_PATH))) {
            return (List<Post>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(POST_PATH + " does not exists/or empty");
            return new LinkedList<>();
        }
    }
        private static void createdFileIfNotExists(String path){
            File file = new File(path);
            if (!file.exists()){
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    System.out.println(path + " file can not be created");
                }
            }
        }




}

package adPortal.util;

import adPortal.model.Ad;
import adPortal.model.User;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FileUtil {

    private static final String USER_MAP_PATH = "C:\\Users\\User\\JavaOffline2020\\src\\homework\\adPortal\\file\\user.Map.txt";
    private static final String AD_LIST_PATH = "C:\\Users\\User\\JavaOffline2020\\src\\homework\\adPortal\\file\\adList.txt";

    public static void serializeUserMap(Map<String, User> userMap) {
        createdFileIfNotExists(USER_MAP_PATH);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(USER_MAP_PATH))) {
            outputStream.writeObject(userMap);

        }catch (IOException e){
            System.out.println(USER_MAP_PATH + " does not exists/or empty");
        }
    }


    public static Map<String, User> deserializeUserMap(){
        createdFileIfNotExists(USER_MAP_PATH);
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(USER_MAP_PATH))){
            return (Map<String, User>) inputStream.readObject();
        }catch (IOException | ClassNotFoundException e){
            System.out.println(USER_MAP_PATH + " does not exists/or empty");
         return new HashMap<>();
        }
    }


    public static void serializeAdList(List<Ad> adList){
        createdFileIfNotExists(AD_LIST_PATH);
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(AD_LIST_PATH))){
            outputStream.writeObject(adList);
        }catch (IOException e){
            System.out.println(AD_LIST_PATH + " does not exists/or empty");
        }
    }


    public static List<Ad> deserializeAdList (){
       createdFileIfNotExists(AD_LIST_PATH);
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(AD_LIST_PATH))){
            return (List<Ad>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e){
            System.out.println(AD_LIST_PATH + " does not exists/or empty");
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
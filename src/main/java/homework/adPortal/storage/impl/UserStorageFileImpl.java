package homework.adPortal.storage.impl;

import homework.adPortal.model.User;
import homework.adPortal.storage.UserStorage;
import homework.adPortal.util.FileUtil;

import java.util.Map;

public class UserStorageFileImpl implements UserStorage {

    private Map<String, User> userMap;

    public  UserStorageFileImpl(){
        userMap = FileUtil.deserializeUserMap();
    }

    @Override
    public void add(User user) {
        userMap.put(user.getPhoneNumber(), user);
        FileUtil.serializeUserMap(userMap);
    }

    @Override
    public User getByPhone(String phone) {
        return userMap.get(phone);
    }
}

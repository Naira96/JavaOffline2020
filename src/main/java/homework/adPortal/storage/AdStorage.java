package homework.adPortal.storage;

import homework.adPortal.model.Ad;
import homework.adPortal.model.Category;
import homework.adPortal.model.User;

public interface AdStorage {

    void add(Ad ad);

    void printAllAds();

    void printMyAds(User user);

    void printByCategory(Category category);

    void deleteMyAds(User user);

    void deleteAdByTitle(String title, User currentUser);


}

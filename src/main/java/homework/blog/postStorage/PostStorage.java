package homework.blog.postStorage;

import homework.blog.exception.PostNotFoundException;
import homework.blog.model.Category;
import homework.blog.model.Post;

public interface PostStorage {

    void add(Post post);

    Post getPostByTitle(String title) throws PostNotFoundException;

    void searchPostsByKeyword(String keyword);

    void printAllPosts();

    void printPostsByCategory(Category category);


}

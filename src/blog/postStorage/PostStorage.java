package blog.postStorage;

import blog.PostNotFoundException;
import blog.model.Post;

public interface PostStorage   {

    void add(Post post);
    Post getPostByTitle(String title) throws PostNotFoundException;
    void searchPostsByKeyword(String keyword);
    void printAllPosts();
    void printPostsByCategory(String category);
}

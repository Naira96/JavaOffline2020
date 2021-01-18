package homework.blog.postStorage.impl;

import homework.blog.exception.PostNotFoundException;
import homework.blog.model.Category;
import homework.blog.model.Post;
import homework.blog.postStorage.PostStorage;
import homework.blog.util.FileUtil;

import java.util.LinkedList;
import java.util.List;

public class PostStorageImpl implements PostStorage {

    private List<Post> postList;

    public PostStorageImpl(){
        postList = FileUtil.deserializePostList();
        FileUtil.serializePostPath(postList);
    }

    @Override
    public void add(Post post) {
        postList.add(post);
       FileUtil.serializePostPath(postList);
    }

    @Override
    public Post getPostByTitle(String title) throws PostNotFoundException {
        for (Post post : postList) {
            if (post.getTitle().equals(title)){
                return post;
            }
        }
        throw new PostNotFoundException("Post with title " + title + " does not exist");
    }

    @Override
    public void searchPostsByKeyword(String keyword) {
        for (Post post : postList) {
            if (post.getText().contains(keyword) || post.getTitle().contains(keyword)) {
                System.out.println(post);
            }
        }
    }

    @Override
    public void printAllPosts() {
        System.out.println(postList);
    }

    @Override
    public void printPostsByCategory(Category category) {
        for (Post post : postList) {
            if (post.getCategory() == (category)) {
                System.out.println(post);
            }
        }
    }


//    @Override
//    public void add(Post post) {
//        postList.add(post);
//        FileUtil.serializePostPath(postList);
//    }
//
//
//    @Override
//    public Post getPostByTitle(String title) throws PostNotFoundException {
//        for (Post post : postList) {
//            if (post.getTitle().equals(title)){
//                return post;
//            }
//        }
//        throw new PostNotFoundException("Post with title " + title + " does not exist");
//    }
//
//
//    @Override
//    public void searchPostsByKeyword(String keyword) {
//        for (Post post : postList) {
//            if (post.getText().contains(keyword) || post.getTitle().contains(keyword)) {
//                System.out.println(post);
//            }
//        }
//    }
//
//    @Override
//    public void printPostsByCategory(Category category) {
//        for (Post post : postList) {
//            if (post.getCategory() == (category)) {
//                System.out.println(post);
//            }
//        }
//    }
//
//    @Override
//    public void printAllPosts() {
//        System.out.println(postList);
//    }
//
////    public boolean isEmpty(){
////        return size ==0;
////    }
}

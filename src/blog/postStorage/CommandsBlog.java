package blog.postStorage;

public interface CommandsBlog {
    String EXIT = "0";
    String ADD_POST = "1";
    String GET_POST_BY_TITLE = "2";
    String SEARCH_POST = "3";
    String POSTS_BY_CATEGORY = "4";
    String ALL_POSTS = "5";
}

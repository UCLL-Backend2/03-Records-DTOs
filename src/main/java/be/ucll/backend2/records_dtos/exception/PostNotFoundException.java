package be.ucll.backend2.records_dtos.exception;

public class PostNotFoundException extends Exception {
    public PostNotFoundException(long id) {
        super("Post with id " + id + " not found");
    }
}

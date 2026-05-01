package outdrive.exceptions;

public class UserNotFoundException extends Exception {

    public UserNotFoundException(String userId) {
        super("User not found: " + userId);
    }
}
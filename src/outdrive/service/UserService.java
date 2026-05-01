package outdrive.service;

import outdrive.model.User;
import outdrive.exceptions.UserNotFoundException;
import java.util.ArrayList;

public class UserService {
    private ArrayList<User> users = new ArrayList<>();
    private int idCounter = 1;

    public void addUser(String name, String phone, String password) {
        String id = "U" + String.format("%03d", idCounter++);
        User u = new User(id, name, phone, "", password);
        users.add(u);
        System.out.println("Registered! Your ID is: " + id);
    }

    public User login(String id, String password) {
        for (User u : users) {
            if (u.getUserId().equalsIgnoreCase(id.trim()) && u.getPassword().equals(password)) {
                return u;
            }
        }
        return null;
    }

    public User findById(String id) throws UserNotFoundException {
        for (User u : users) {
            if (u.getUserId().equalsIgnoreCase(id.trim())) {
                return u;
            }
        }
        throw new UserNotFoundException(id);
    }

    public void listAllUsers() {
        if (users.isEmpty()) {
            System.out.println("No users found.");
            return;
        }
        for (User u : users) {
            System.out.println(u);
        }
    }
}

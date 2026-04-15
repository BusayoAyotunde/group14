package model;

public class User {
    private String userId;
    private String name;
    private String phoneNumber;
    private String password;

    public User(String userId, String name, String phoneNumber, String password) {
        this.userId = userId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public String getUserId() { return userId; }
    public String getName() { return name; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getPassword() { return password; }

    @Override
    public String toString() {
        return "ID: " + userId + " | Name: " + name + " | Phone: " + phoneNumber;
    }
}

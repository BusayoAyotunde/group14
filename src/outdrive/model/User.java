package outdrive.model;

public class User {
    private String userId;
    private String name;
    private String phoneNumber;
    private String licenseNumber;
    private String password;

    public User(String userId, String name, String phoneNumber, String licenseNumber, String password) {
        this.userId = userId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.licenseNumber = licenseNumber;
        this.password = password;
    }

    public String getUserId() { return userId; }
    public String getName() { return name; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getLicenseNumber() { return licenseNumber; }
    public String getPassword() { return password; }

    // To check if user has a valid Driver's License
    public boolean hasValidLicense() {
        return licenseNumber != null && !licenseNumber.trim().isEmpty();
    }

    @Override
    public String toString() {
        return "ID: " + userId + " | Name: " + name + " | Phone: " + phoneNumber + " | Driver's License: " + licenseNumber;
    }
}

public class User {

    private int userID;
    private String fullName;
    private String email;
    private String password;
    private String role;

    public User(int userID, String fullName, String email,
                String password, String role) {
        this.userID = userID;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public int getUserID() {
        return userID;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    public boolean login(String email, String password) {
        return this.email.equals(email) &&
               this.password.equals(password);
    }

    public void logout() {
        System.out.println("User logged out.");
    }

    public void updateProfile(String fullName, String email) {
        this.fullName = fullName;
        this.email = email;
    }
}
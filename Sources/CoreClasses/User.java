public class User {

    private int userID;
    private String fullName;
    private String email;
    private String password;
    private String role;

    public User(int userID, String fullName, String email, String password, String role) {
        setUserID(userID);
        setFullName(fullName);
        setEmail(email);
        setPassword(password);
        setRole(role);
    }

    public void setUserID(int userID) {
        if (userID <= 0)
            throw new IllegalArgumentException("Invalid user ID.");
        this.userID = userID;
    }

    public void setFullName(String fullName) {
        if (fullName == null || fullName.trim().isEmpty())
            throw new IllegalArgumentException("Name cannot be empty.");
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        if (email == null || !email.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$"))
            throw new IllegalArgumentException("Invalid email.");
        this.email = email;
    }

    public void setPassword(String password) {
        if (password == null || password.length() < 6)
            throw new IllegalArgumentException("Password must have at least 6 characters.");
        this.password = password;
    }

    public void setRole(String role) {
        if (!"Student".equalsIgnoreCase(role) &&
            !"Administrator".equalsIgnoreCase(role))
            throw new IllegalArgumentException("Invalid role.");
        this.role = role;
    }

    public void updateProfile(String name, String email) {
        if (name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("Name cannot be empty.");

        if (email == null || !email.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$"))
            throw new IllegalArgumentException("Invalid email.");

        this.fullName = name;
        this.email = email;
    }

    public int getId() {
        return userID;
    }

    public String getName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }
}

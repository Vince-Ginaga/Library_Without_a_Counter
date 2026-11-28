public class Administrator extends User {
    private int adminID;

    public Administrator(int userID, String fullName,
                         String email, String password,
                         String role, int adminID) {
        super(userID, fullName, email, password, role);
        this.adminID = adminID;
    }

    public int getAdminID() {
        return adminID;
    }

    public void manageBooks() {
    }

    public void manageStudents() {
    }

    public void manageLibrary() {
    }

    public void generateReports() {
    }

    public void managePenalties() {
    }
}
public class Student extends User {
    private String studentID;

    public Student(int userID, String fullName, String email,
                   String password, String role, String studentID) {
        super(userID, fullName, email, password, role);
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void searchBook() {
    }

    public void reserveBook() {
    }

    public void borrowBook() {
    }

    public void returnBook() {
    }

    public void viewBorrowingHistory() {
    }

    public void viewPenalty() {
    }
}
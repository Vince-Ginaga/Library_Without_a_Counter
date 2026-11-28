public class Student extends User {

    private String studentID;

    public Student(int userID, String studentID, String name,
                   String email, String password) {
        super(userID, name, email, password, "Student");

        if (studentID == null || studentID.trim().isEmpty())
            throw new IllegalArgumentException("Student ID cannot be empty.");

        this.studentID = studentID;
    }

    public void reserveBook(Book book) {
        if (book == null || !book.checkAvailability())
            throw new IllegalArgumentException("Book is not available.");

        book.updateStatus("Reserved");
    }

    public void borrowBook(Book book) {
        if (book == null || !book.checkAvailability())
            throw new IllegalArgumentException("Book is not available.");

        book.updateStatus("Borrowed");
    }

    public void returnBook(Book book) {
        if (book == null || !"Borrowed".equalsIgnoreCase(book.getStatus()))
            throw new IllegalArgumentException("Book is not currently borrowed.");

        book.updateStatus("Available");
    }

    public String getStudentID() {
        return studentID;
    }
}

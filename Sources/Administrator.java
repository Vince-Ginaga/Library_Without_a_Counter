public class Administrator extends User {

    private int adminID;

    public Administrator(int userID, int adminID, String name,
                         String email, String password) {
        super(userID, name, email, password, "Administrator");

        if (adminID <= 0)
            throw new IllegalArgumentException("Invalid admin ID.");

        this.adminID = adminID;
    }

    public void manageBooks(Library library, Book book) {
        if (library == null || book == null)
            throw new IllegalArgumentException("Invalid book information.");

        library.addBook(book);
    }

    public void removeBook(Library library, int bookID) {
        if (library == null || bookID <= 0)
            throw new IllegalArgumentException("Invalid book information.");

        library.removeBook(bookID);
    }

    public Report generateReports(int reportID, String reportType, String content) {
        if (reportID <= 0)
            throw new IllegalArgumentException("Invalid report ID.");

        if (reportType == null || reportType.trim().isEmpty())
            throw new IllegalArgumentException("Report type cannot be empty.");

        if (content == null || content.trim().isEmpty())
            throw new IllegalArgumentException("Report content cannot be empty.");

        return new Report(reportID, reportType, content);
    }

    public int getAdminID() {
        return adminID;
    }
}

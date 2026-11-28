public class Borrowing {
    private int borrowingID;
    private int borrowingDate;
    private int dueDate;
    private int returnDate;
    private String status;

    private Book book;

    public Borrowing(int borrowingID,
                     int borrowingDate,
                     int dueDate,
                     Book book,
                     String status) {
        this.borrowingID = borrowingID;
        this.borrowingDate = borrowingDate;
        this.dueDate = dueDate;
        this.book = book;
        this.status = status;
    }

    public int getBorrowingID() {
        return borrowingID;
    }

    public int getBorrowingDate() {
        return borrowingDate;
    }

    public int getDueDate() {
        return dueDate;
    }

    public int getReturnDate() {
        return returnDate;
    }

    public String getStatus() {
        return status;
    }

    public Book getBook() {
        return book;
    }

    public void createBorrowing() {
        status = "Borrowed";
    }

    public void processReturn(int returnDate) {
        this.returnDate = returnDate;
        status = "Returned";
    }

    public boolean calculateOverdue() {
        return returnDate > dueDate;
    }

    public boolean checkDueDate(int currentDate) {
        return currentDate > dueDate;
    }
}
import java.time.LocalDate;

public class Borrowing {

    private int borrowingID;
    private LocalDate borrowingDate;
    private LocalDate dueDate;
    private LocalDate returnDate;
    private String status;

    public Borrowing(int borrowingID, LocalDate borrowingDate, LocalDate dueDate) {
        if (borrowingID <= 0)
            throw new IllegalArgumentException("Invalid borrowing ID.");

        validateDates(borrowingDate, dueDate);

        this.borrowingID = borrowingID;
        this.borrowingDate = borrowingDate;
        this.dueDate = dueDate;
        this.status = "Borrowed";
    }

    private void validateDates(LocalDate borrowingDate, LocalDate dueDate) {
        if (borrowingDate == null || dueDate == null)
            throw new IllegalArgumentException("Dates cannot be empty.");

        if (dueDate.isBefore(borrowingDate))
            throw new IllegalArgumentException("Due date cannot be before borrowing date.");
    }

    public void createBorrowing(LocalDate borrowingDate, LocalDate dueDate) {
        validateDates(borrowingDate, dueDate);

        this.borrowingDate = borrowingDate;
        this.dueDate = dueDate;
        this.returnDate = null;
        this.status = "Borrowed";
    }

    public void processReturn(LocalDate returnDate) {
        if (!"Borrowed".equals(status))
            throw new IllegalArgumentException("Book is not currently borrowed.");

        if (returnDate == null || returnDate.isBefore(borrowingDate))
            throw new IllegalArgumentException("Invalid return date.");

        this.returnDate = returnDate;
        this.status = "Returned";
    }

    public boolean calculateOverdue() {
        LocalDate date = returnDate == null ? LocalDate.now() : returnDate;
        return date.isAfter(dueDate);
    }

    public void checkDueDate() {
        if (dueDate == null)
            throw new IllegalStateException("Due date is not set.");

        System.out.println("Due date: " + dueDate);
    }
}

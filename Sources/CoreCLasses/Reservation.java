public class Reservation {
    private int reservationID;
    private int reservationDate;
    private int expirationDate;
    private String status;

    private Book book;

    public Reservation(int reservationID,
                       int reservationDate,
                       int expirationDate,
                       String status,
                       Book book) {
        this.reservationID = reservationID;
        this.reservationDate = reservationDate;
        this.expirationDate = expirationDate;
        this.status = status;
        this.book = book;
    }

    public int getReservationID() {
        return reservationID;
    }

    public int getReservationDate() {
        return reservationDate;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public String getStatus() {
        return status;
    }

    public Book getBook() {
        return book;
    }

    public void createReservation() {
        status = "Reserved";
    }

    public void cancelReservation() {
        status = "Cancelled";
    }

    public String checkReservationStatus() {
        return status;
    }
}
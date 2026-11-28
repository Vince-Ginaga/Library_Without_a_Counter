import java.time.LocalDate;

public class Reservation {

    private int reservationID;
    private LocalDate reservationDate;
    private LocalDate expirationDate;
    private String status;

    public Reservation(int reservationID, LocalDate reservationDate,
                       LocalDate expirationDate) {
        if (reservationID <= 0)
            throw new IllegalArgumentException("Invalid reservation ID.");

        validateDates(reservationDate, expirationDate);

        this.reservationID = reservationID;
        this.reservationDate = reservationDate;
        this.expirationDate = expirationDate;
        this.status = "Active";
    }

    private void validateDates(LocalDate date, LocalDate expiration) {
        if (date == null || expiration == null)
            throw new IllegalArgumentException("Dates cannot be empty.");

        if (expiration.isBefore(date))
            throw new IllegalArgumentException("Expiration cannot be before reservation date.");
    }

    public void createReservation(LocalDate date, LocalDate expiration) {
        validateDates(date, expiration);

        this.reservationDate = date;
        this.expirationDate = expiration;
        this.status = "Active";
    }

    public void cancelReservation() {
        if (!"Active".equals(status))
            throw new IllegalArgumentException("Reservation is not active.");

        this.status = "Cancelled";
    }

    public void checkReservationStatus() {
        if ("Active".equals(status) &&
            LocalDate.now().isAfter(expirationDate)) {
            this.status = "Expired";
        }
    }
}

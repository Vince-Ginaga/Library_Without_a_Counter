import java.time.LocalDate;

public class Notification {

    private int notificationID;
    private LocalDate dateSent;
    private String message;
    private String status;

    public Notification(int notificationID) {
        if (notificationID <= 0)
            throw new IllegalArgumentException("Invalid notification ID.");

        this.notificationID = notificationID;
        this.status = "Unread";
    }

    public void sendNotification(String message) {
        if (message == null || message.trim().isEmpty())
            throw new IllegalArgumentException("Message cannot be empty.");

        this.message = message;
        this.dateSent = LocalDate.now();
        this.status = "Unread";
    }

    public void markAsRead() {
        if (!"Unread".equals(status))
            throw new IllegalArgumentException("Notification is already read.");

        this.status = "Read";
    }

    public void viewNotification() {
        if (message == null)
            throw new IllegalStateException("No notification available.");

        System.out.println(message);
    }
}
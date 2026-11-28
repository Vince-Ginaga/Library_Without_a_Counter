public class Notification {
    private int notificationID;
    private int dateSent;
    private String message;
    private String status;

    public Notification(int notificationID,
                        int dateSent,
                        String message,
                        String status) {
        this.notificationID = notificationID;
        this.dateSent = dateSent;
        this.message = message;
        this.status = status;
    }

    public int getNotificationID() {
        return notificationID;
    }

    public int getDateSent() {
        return dateSent;
    }

    public String getMessage() {
        return message;
    }

    public String getStatus() {
        return status;
    }

    public void sendNotification() {
        status = "Sent";
    }

    public void viewNotification() {
        System.out.println(message);
    }

    public void markAsRead() {
        status = "Read";
    }
}
public class Penalty {
    private int penaltyID;
    private double amount;
    private String reason;
    private String paymentStatus;

    public Penalty(int penaltyID, double amount,
                   String reason, String paymentStatus) {
        this.penaltyID = penaltyID;
        this.amount = amount;
        this.reason = reason;
        this.paymentStatus = paymentStatus;
    }

    public int getPenaltyID() {
        return penaltyID;
    }

    public double getAmount() {
        return amount;
    }

    public String getReason() {
        return reason;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void calculatePenalty(double amount) {
        this.amount = amount;
    }

    public void processPayment() {
        paymentStatus = "Paid";
    }

    public void updatePaymentStatus(String status) {
        paymentStatus = status;
    }
}
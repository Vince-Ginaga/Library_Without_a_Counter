public class Penalty {

    private int penaltyID;
    private double amount;
    private String reason;
    private String paymentStatus;

    public Penalty(int penaltyID, double amount, String reason) {
        if (penaltyID <= 0)
            throw new IllegalArgumentException("Invalid penalty ID.");

        if (amount < 0 || Double.isNaN(amount) || Double.isInfinite(amount))
            throw new IllegalArgumentException("Invalid penalty amount.");

        if (reason == null || reason.trim().isEmpty())
            throw new IllegalArgumentException("Reason cannot be empty.");

        this.penaltyID = penaltyID;
        this.amount = amount;
        this.reason = reason;
        this.paymentStatus = "Unpaid";
    }

    public void calculatePenalty(double amount) {
        if (amount < 0 || Double.isNaN(amount) || Double.isInfinite(amount))
            throw new IllegalArgumentException("Invalid penalty amount.");

        this.amount = amount;
    }

    public void processPayment() {
        if (amount <= 0)
            throw new IllegalArgumentException("Invalid payment amount.");

        if ("Paid".equals(paymentStatus))
            throw new IllegalArgumentException("Penalty is already paid.");

        this.paymentStatus = "Paid";
    }

    public void updatePaymentStatus(String status) {
        if (!"Paid".equalsIgnoreCase(status) &&
            !"Unpaid".equalsIgnoreCase(status))
            throw new IllegalArgumentException("Invalid payment status.");

        this.paymentStatus = status;
    }
}

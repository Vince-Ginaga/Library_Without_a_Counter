import java.time.LocalDate;

public class Report {

    private int reportID;
    private String reportType;
    private LocalDate dateGenerated;
    private String reportContent;

    public Report(int reportID, String reportType, String reportContent) {
        if (reportID <= 0)
            throw new IllegalArgumentException("Invalid report ID.");

        validateText(reportType, "Report type");
        validateText(reportContent, "Report content");

        this.reportID = reportID;
        this.reportType = reportType;
        this.reportContent = reportContent;
        this.dateGenerated = LocalDate.now();
    }

    private void validateText(String value, String field) {
        if (value == null || value.trim().isEmpty())
            throw new IllegalArgumentException(field + " cannot be empty.");
    }

    public void setReportType(String reportType) {
        validateText(reportType, "Report type");
        this.reportType = reportType;
    }

    public void setReportContent(String reportContent) {
        validateText(reportContent, "Report content");
        this.reportContent = reportContent;
    }

    public void generateReport(String content) {
        validateText(content, "Report content");

        this.reportContent = content;
        this.dateGenerated = LocalDate.now();
    }
}

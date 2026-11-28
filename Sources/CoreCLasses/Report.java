public class Report {
    private int reportID;
    private String reportType;
    private int dateGenerated;
    private String reportContent;

    public Report(int reportID,
                  String reportType,
                  int dateGenerated,
                  String reportContent) {
        this.reportID = reportID;
        this.reportType = reportType;
        this.dateGenerated = dateGenerated;
        this.reportContent = reportContent;
    }

    public int getReportID() {
        return reportID;
    }

    public String getReportType() {
        return reportType;
    }

    public int getDateGenerated() {
        return dateGenerated;
    }

    public String getReportContent() {
        return reportContent;
    }

    public void addBook() {
    }

    public void removeBook() {
    }

    public void updateBook() {
    }

    public void searchBook() {
    }

    public void viewAvailableBooks() {
    }
}
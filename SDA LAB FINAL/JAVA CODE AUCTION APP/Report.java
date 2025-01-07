import java.util.Date;

public class Report {
    private String reportId;
    private Date startDate;
    private Date endDate;

    public Report(String reportId, Date startDate, Date endDate) {
        this.reportId = reportId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void export(String format) {
        System.out.println("Report " + reportId + " exported as " + format + " format.");
    }

      // Getter for reportId
    public String getReportId() {
        return reportId;
    }

    // Getters for other fields (if needed)
    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }
}

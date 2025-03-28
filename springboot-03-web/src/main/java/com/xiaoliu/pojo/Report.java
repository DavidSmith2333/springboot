package com.xiaoliu.pojo;

public class Report {

    private Integer id;
    private String reportType;
    private String reportTitle;
    private String reportDate;

    public Report() {
    }

    public Report(Integer id, String reportType, String reportTitle, String reportDate) {
        this.id = id;
        this.reportType = reportType;
        this.reportTitle = reportTitle;
        this.reportDate = reportDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getReportTitle() {
        return reportTitle;
    }

    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    @Override
    public String toString() {
        return "Report{" +
                "id=" + id +
                ", reportType='" + reportType + '\'' +
                ", reportTitle='" + reportTitle + '\'' +
                ", reportDate='" + reportDate + '\'' +
                '}';
    }
}

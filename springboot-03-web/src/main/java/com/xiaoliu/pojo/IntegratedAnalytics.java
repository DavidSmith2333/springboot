package com.xiaoliu.pojo;

public class IntegratedAnalytics {

    private Integer id;
    private String companyName;
    private String companyBluePrint;
    private String companyWelfare;
    private String companyRecentDecisions;
    private String companyAnnouncement;

    public IntegratedAnalytics() {
    }

    public IntegratedAnalytics(Integer id, String companyName, String companyBluePrint, String companyWelfare, String companyRecentDecisions, String companyAnnouncement) {
        this.id = id;
        this.companyName = companyName;
        this.companyBluePrint = companyBluePrint;
        this.companyWelfare = companyWelfare;
        this.companyRecentDecisions = companyRecentDecisions;
        this.companyAnnouncement = companyAnnouncement;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyBluePrint() {
        return companyBluePrint;
    }

    public void setCompanyBluePrint(String companyBluePrint) {
        this.companyBluePrint = companyBluePrint;
    }

    public String getCompanyWelfare() {
        return companyWelfare;
    }

    public void setCompanyWelfare(String companyWelfare) {
        this.companyWelfare = companyWelfare;
    }

    public String getCompanyRecentDecisions() {
        return companyRecentDecisions;
    }

    public void setCompanyRecentDecisions(String companyRecentDecisions) {
        this.companyRecentDecisions = companyRecentDecisions;
    }

    public String getCompanyAnnouncement() {
        return companyAnnouncement;
    }

    public void setCompanyAnnouncement(String companyAnnouncement) {
        this.companyAnnouncement = companyAnnouncement;
    }

    @Override
    public String toString() {
        return "IntegratedAnalytics{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", companyBluePrint='" + companyBluePrint + '\'' +
                ", companyWelfare='" + companyWelfare + '\'' +
                ", companyRecentDecisions='" + companyRecentDecisions + '\'' +
                ", companyAnnouncement='" + companyAnnouncement + '\'' +
                '}';
    }
}

package com.mylibrary.model;

public class Journal extends Book {
    private String journalName;
    private String issueMonth;

    public Journal(String title, String author, String ISBN, String genre, String status, String journalName, String issueMonth) {
        super(title, author, ISBN, genre, status);
        this.journalName = journalName;
        this.issueMonth = issueMonth;
    }

    public String getJournalName() {
        return journalName;
    }

    public void setJournalName(String journalName) {
        this.journalName = journalName;
    }

    public String getIssueMonth() {
        return issueMonth;
    }

    public void setIssueMonth(String issueMonth) {
        this.issueMonth = issueMonth;
    }
}

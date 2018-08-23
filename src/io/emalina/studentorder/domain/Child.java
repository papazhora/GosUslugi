package io.emalina.studentorder.domain;

import java.time.LocalDate;

public class Child extends Person {

    private String certificateNumber;
    private LocalDate issueDate;
    private String issueDepartament;

    public Child(String surName, String givenName,
                 String patronymic, LocalDate dateOfBirth) {
        super(surName, givenName, patronymic, dateOfBirth);
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public String getIssueDepartament() {
        return issueDepartament;
    }

    public void setIssueDepartament(String issueDepartament) {
        this.issueDepartament = issueDepartament;
    }
}

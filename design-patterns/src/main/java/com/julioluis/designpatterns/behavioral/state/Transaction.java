package com.julioluis.designpatterns.behavioral.state;

import java.time.LocalDate;
import java.time.LocalTime;

public class Transaction {
    private Status status;
    private LocalDate updatedDate;
    private LocalTime updatedTime;
    private String Comment;

    public Transaction(Status status, LocalDate updatedDate, LocalTime updatedTime, String comment) {
        this.status = status;
        this.updatedDate = updatedDate;
        this.updatedTime = updatedTime;
        Comment = comment;
    }

    public Status getStatus() {
        return status;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    public LocalTime getUpdatedTime() {
        return updatedTime;
    }

    public String getComment() {
        return Comment;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "status=" + status +
                ", updatedDate=" + updatedDate +
                ", updatedTime=" + updatedTime +
                ", Comment='" + Comment + '\'' +
                '}';
    }
}

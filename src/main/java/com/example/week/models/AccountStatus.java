package com.example.week.models;

public enum AccountStatus {
    ACTIVE(1),
    DEACTIVE(0),
    DELETED(-1);
    private int status;

    AccountStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}

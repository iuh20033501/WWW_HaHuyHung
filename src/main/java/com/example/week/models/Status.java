package com.example.week.models;

public enum Status {
    ACTIVE(1),
    DEACTIVE(0),
    DELETED(-1);

    private final int value;

    Status(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

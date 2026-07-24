package org.example.taskfawry.model;

public class Violation {

    private String message;
    private int amount;

    public Violation(String message, int amount) {
        this.message = message;
        this.amount = amount;
    }

    public String getMessage() {
        return message;
    }

    public int getAmount() {
        return amount;
    }

}
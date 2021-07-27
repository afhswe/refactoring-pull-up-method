package org.example;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class Customer {
    private LocalDateTime lastBillDate;
    private double lastBillAmount;

    public LocalDateTime lastBillDate() {
        return lastBillDate;
    }

    public void setLastBillDate(LocalDateTime date) {
        lastBillDate = date;
    }

    public double lastBillAmount() {
        return lastBillAmount;
    }

    protected void addBill(LocalDateTime date, double amount) {
        lastBillDate = date;
        lastBillAmount = amount;
    }

    protected abstract double ChargeFor(LocalDateTime start, LocalDateTime end);
}

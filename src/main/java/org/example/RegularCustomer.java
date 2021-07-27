package org.example;

import java.time.Duration;
import java.time.LocalDateTime;

public class RegularCustomer extends Customer {
    public void createBill(LocalDateTime date) {
        addBill(date, ChargeFor(lastBillDate(), date));
    }

    protected double ChargeFor(LocalDateTime start, LocalDateTime end) {
        return (Duration.between(start, end)).toDays() * 100.0;
    }
}

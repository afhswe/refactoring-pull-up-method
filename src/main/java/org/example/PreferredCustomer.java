package org.example;

import java.time.Duration;
import java.time.LocalDateTime;

public class PreferredCustomer extends Customer {
    public void createBill(LocalDateTime date) {
        addBill(date, ChargeFor(lastBillDate(), date));
    }

    protected double ChargeFor(LocalDateTime start, LocalDateTime end) {
        return (Duration.between(start, end)).toDays() * 80.0;
    }
}

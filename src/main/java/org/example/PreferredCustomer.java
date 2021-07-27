package org.example;

import java.time.Duration;
import java.time.LocalDateTime;

public class PreferredCustomer extends Customer {
    protected double ChargeFor(LocalDateTime start, LocalDateTime end) {
        return (Duration.between(start, end)).toDays() * 80.0;
    }
}

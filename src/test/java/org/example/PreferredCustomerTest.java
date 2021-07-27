package org.example;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class PreferredCustomerTest {
    @Test
    public void createsBillForDateAndAmount() {
        var customer = new PreferredCustomer();
        customer.setLastBillDate(LocalDateTime.of(
                LocalDate.of(2021, 7, 21),
                LocalTime.of(15, 30, 30)));
        customer.createBill(
                LocalDateTime.of(
                        LocalDate.of(2021, 7, 27),
                        LocalTime.of(15, 30, 30))
        );
        assertThat(customer.lastBillDate(), equalTo(LocalDateTime.of(
                LocalDate.of(2021, 7, 27),
                LocalTime.of(15, 30, 30))));
        assertThat(customer.lastBillAmount(), equalTo(480.0));
    }
}

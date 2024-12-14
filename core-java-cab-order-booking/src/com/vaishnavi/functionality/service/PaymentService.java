package com.vaishnavi.functionality.service;

import com.vaishnavi.functionality.model.Payment;

import java.util.ArrayList;
import java.util.List;

public class PaymentService {
    private List<Payment> paymentList = new ArrayList<>();

    public void processPayment(Payment payment) {
        paymentList.add(payment);
        System.out.println("Payment processed successfully: " + payment);
    }

    public void viewPayments() {
        if (paymentList.isEmpty()) {
            System.out.println("No payments found.");
        } else {
            System.out.println("Payment Records:");
            for (Payment payment : paymentList) {
                System.out.println(payment);
            }
        }
    }
}


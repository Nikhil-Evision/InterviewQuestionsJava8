package com.evision.transactionhandling.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Payment_info")
public class PaymentInfo {
    @Id
    @GeneratedValue()
    private String paymentId;
    private String accountNumber;
    private double amount;
    private String cardType;
    private long passengerId;
}

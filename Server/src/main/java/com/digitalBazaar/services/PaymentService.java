package com.digitalBazaar.services;

import com.digitalBazaar.payload.PaymentDetails;

public interface PaymentService {

    public PaymentDetails CreateOrder(Double amount);

}

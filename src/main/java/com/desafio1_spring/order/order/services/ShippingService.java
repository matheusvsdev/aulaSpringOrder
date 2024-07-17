package com.desafio1_spring.order.order.services;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(double basicValue) {
        if (basicValue < 100.00) {
            return 20.00;
        } else if (basicValue < 200.00) {
            return 12.00;
        }else {
            return 0.00;
        }
    }
}

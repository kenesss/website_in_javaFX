package com.example.softfinalproject;

// Adapter for CashController
public class CashControllerAdapter implements PaymentController {
    private final CashController cashController;

    public CashControllerAdapter(CashController cashController) {
        this.cashController = cashController;
    }

    @Override
    public void processPayment() {

    }
}

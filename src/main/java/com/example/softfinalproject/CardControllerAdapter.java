package com.example.softfinalproject;

import java.io.IOException;

// Adapter for CardController
public class CardControllerAdapter implements PaymentController {
    private final CardController cardController;

    public CardControllerAdapter(CardController cardController) {
        this.cardController = cardController;
    }

    @Override
    public void processPayment() throws IOException {

    }
}

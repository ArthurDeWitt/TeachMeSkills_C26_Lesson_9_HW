package com.teachmeskills.lesson9.HW.Homework2;

class VisaCard extends Card {
    private static final double LIMIT = 2000;

    public VisaCard(String cardNumber, String cvc, double balance, String currency, int cardId) {
        super(cardNumber, cvc, balance, currency, cardId);
    }

    @Override
    public boolean checkLimit(double amount) {
        return amount <= LIMIT;
    }
}
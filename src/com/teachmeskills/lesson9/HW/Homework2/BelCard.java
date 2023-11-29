package com.teachmeskills.lesson9.HW.Homework2;

class BelCard extends Card {
    private static final double LIMIT = 1000;
    private static final String currency = "BYN" ;

    public BelCard(String cardNumber, String cvc, double balance, int cardId) {
        super(cardNumber, cvc, balance, currency, cardId);
    }

    @Override
    public boolean checkLimit(double amount) {
        return amount <= LIMIT;
    }
}

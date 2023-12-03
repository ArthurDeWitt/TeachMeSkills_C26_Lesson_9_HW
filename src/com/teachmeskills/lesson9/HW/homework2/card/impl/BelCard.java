package com.teachmeskills.lesson9.HW.homework2.card.impl;

import com.teachmeskills.lesson9.HW.homework2.card.Card;

public class BelCard extends Card {
    private static final double LIMIT = 1000;
    private static final String currency = "BYN" ;

    public BelCard(String cardNumber, String cvc, double balance, int cardID) {
        super(cardNumber, cvc, balance, currency, cardID);
    }

    @Override
    public boolean checkLimit(double amount) {
        return amount <= LIMIT;
    }
}

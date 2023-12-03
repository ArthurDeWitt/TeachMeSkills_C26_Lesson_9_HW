package com.teachmeskills.lesson9.HW.homework2.card.impl;

import com.teachmeskills.lesson9.HW.homework2.card.Card;

public class VisaCard extends Card {
    private static final double LIMIT = 2000;

    public VisaCard(String cardNumber, String cvc, double balance, String currency, int cardID) {
        super(cardNumber, cvc, balance, currency, cardID);
    }

    @Override
    public boolean checkLimit(double amount) {
        return amount <= LIMIT;
    }
}
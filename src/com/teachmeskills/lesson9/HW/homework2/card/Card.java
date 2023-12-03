package com.teachmeskills.lesson9.HW.homework2.card;


public abstract class Card {
    private String cardNumber;
    private String cvc;
    private double balance;
    private String currency;
    private int cardID;

    public Card(String cardNumber, String cvc, double balance, String currency, int cardId) {
        this.cardNumber = cardNumber;
        this.cvc = cvc;
        this.balance = balance;
        this.currency = currency;
        this.cardID = cardId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public abstract boolean checkLimit(double amount);
}
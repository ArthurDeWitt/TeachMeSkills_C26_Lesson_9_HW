package com.teachmeskills.lesson9.HW.Homework2;


abstract class Card {
    private String cardNumber;
    private String cvc;
    private double balance;
    private String currency;
    private int cardId;

    public Card(String cardNumber, String cvc, double balance, String currency, int cardId) {
        this.cardNumber = cardNumber;
        this.cvc = cvc;
        this.balance = balance;
        this.currency = currency;
        this.cardId = cardId;
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
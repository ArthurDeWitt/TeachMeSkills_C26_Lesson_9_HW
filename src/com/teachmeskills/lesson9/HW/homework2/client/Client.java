package com.teachmeskills.lesson9.HW.homework2.client;

import com.teachmeskills.lesson9.HW.homework2.card.Card;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String firstName;
    private String lastName;
    private String passportNumber;
    private String dateOfBirth;
    private Address address;
    private List<Card> cards;
    private double commissionPercentage;

    public Client(String firstName, String lastName, String passportNumber, String dateOfBirth,
                  String postalCode, String country, String city, String street, String houseNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportNumber = passportNumber;
        this.dateOfBirth = dateOfBirth;
        this.cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void transferMoney(int fromCardId, int toCardId, double amount) {
        Card fromCard = cards.get(fromCardId - 1);
        Card toCard = cards.get(toCardId - 1);

        if (fromCard.getBalance() >= amount && fromCard.checkLimit(amount)) {
            double convertedAmount = amount;

            if (!fromCard.getCurrency().equals(toCard.getCurrency())) {
                double exchangeRate = getExchangeRate(fromCard.getCurrency(), toCard.getCurrency());
                convertedAmount = amount * exchangeRate;
            }

            double commission = convertedAmount * (commissionPercentage / 100);
            double transferAmount = convertedAmount - commission;

            fromCard.setBalance(fromCard.getBalance() - amount);
            toCard.setBalance(toCard.getBalance() + transferAmount);

            System.out.println(firstName + " " + lastName);
            System.out.println("Number of cards: " + cards.size());
            System.out.println("Card " + fromCardId + " - amount before transfer: " + (fromCard.getBalance() + amount));
            System.out.println("Card " + fromCardId + " - amount after transfer: " + fromCard.getBalance());
            System.out.println("Card " + toCardId + " - amount before transfer: " + (toCard.getBalance() - transferAmount));
            System.out.println("Card " + toCardId + " - amount after transfer: " + toCard.getBalance());
            System.out.println("Transfer fee: " + commission);
        } else {
            System.out.println("Insufficient funds on the card / over limit");
        }
    }

    private double getExchangeRate(String fromCurrency, String toCurrency) {
        // Логика получения курса обмена валюты
        double exchangeRate = 1.0;

        if (fromCurrency.equals("BYN") && toCurrency.equals("USD")) {
            exchangeRate = 0.5;
        } else if (fromCurrency.equals("USD") && toCurrency.equals("BYN")) {
            exchangeRate = 2.0;
        }

        return exchangeRate;
    }
}
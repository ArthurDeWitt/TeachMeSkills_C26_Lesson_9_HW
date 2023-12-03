package com.teachmeskills.lesson9.HW.homework2;
/*
Создайте программу для перевода с одной банковской карты клиента на его другую карту.
Данные для перевода задаются с консоли.
Есть клиент.
В системе храниться информация о имени, фамилии, номере паспорта, дате рождения клинета.
А так же его почтовый индекс, страна, город, улица и номер дома.
У клиента может быть банковская карта (одна или более).
Сделать метод для перевода суммы с одной краты на другую.
Каждая карта содержит номер карты, CVC/CVV, текущую сумму на карте, код(id) карты.
Карты могут быть трех видов: BelCard, MasterCard, VisaCard.
Для переводов существуют лимиты. Лимиты проверяются только для карты с которой делается перевод.
Для каждого типа карты существуют свои лимиты.
Карты могут быть в разной валюте - следовательно, предусмотреть конвертацию.
За перевод снимается коммисия (задается в процентах).
Предусмотреть различные проверки и валидации.
Сценарий для проверки:
с консоли вводится код(id) карты с... (например, 1)
с консоли вводится код(2) карты на... (например, 2)
с консоли вводится сумма перевода.
В результате работы программы выводится сообщение:
Имя-Фамилия клиента
Количество карт клиента
Карта 1 - сумма до перевода
Карта 1 - сумма после перевода
Карта 2 - сумма до перевода
Карта 2 - сумма после перевода
Комиссия за перевод.
 */
import com.teachmeskills.lesson9.HW.homework2.card.impl.BelCard;
import com.teachmeskills.lesson9.HW.homework2.card.impl.MasterCard;
import com.teachmeskills.lesson9.HW.homework2.card.impl.VisaCard;
import com.teachmeskills.lesson9.HW.homework2.client.Client;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод информации о клиенте
        System.out.print("Enter the client's name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter the client's surname: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter the client's passport number: ");
        String passportNumber = scanner.nextLine();

        System.out.print("Enter the client's date of birth in DD/MM/YYYY: ");
        String dateOfBirth = scanner.nextLine();

        System.out.print("Enter the customer's postcode: ");
        String postalCode = scanner.nextLine();

        System.out.print("Enter the customer's country: ");
        String country = scanner.nextLine();

        System.out.print("Enter the customer's city: ");
        String city = scanner.nextLine();

        System.out.print("Enter the customer's street: ");
        String street = scanner.nextLine();

        System.out.print("Enter the customer's house number: ");
        String houseNumber = scanner.nextLine();

        // Создание объекта клиента
        Client client = new Client(firstName, lastName, passportNumber, dateOfBirth,
                postalCode, country, city, street, houseNumber);

        // Ввод данных для перевода
        System.out.print("Enter the amount of the transfer: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter the number of the card from which the transfer is made: ");
        int fromCardId = scanner.nextInt();

        System.out.print("Enter the number of the card to which the transfer is to be made: ");
        int toCardId = scanner.nextInt();

        // Создание и добавление карт клиента
        BelCard belCard1 = new BelCard("1234", "123", 5000.0,  1);
        BelCard belCard2 = new BelCard("5678", "456", 3000.0,  2);
        MasterCard masterCard1 = new MasterCard("9876", "789", 10000.0, "BYN", 3);
        VisaCard visaCard1 = new VisaCard("5432", "987", 8000.0, "USD", 4);

        client.addCard(belCard1);
        client.addCard(belCard2);
        client.addCard(masterCard1);
        client.addCard(visaCard1);

        // Выполнение перевода
        client.transferMoney(fromCardId, toCardId, amount);

        scanner.close();
    }
}

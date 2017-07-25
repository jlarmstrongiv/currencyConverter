package com.jlastudioiv;

public class Main {

    public static void main(String[] args) {
	// write your code here

        MoneyLabel USD = MoneyLabel.USD;
        MoneyLabel EUR = MoneyLabel.EUR;
        MoneyLabel JPY = MoneyLabel.JPY;
        MoneyLabel XBC = MoneyLabel.XBC;

        Rate usdRate = new Rate(USD, 1, 0.86, 111.88, 0.00039);

        Money myMoney = new Money(usdRate, 100, EUR);
        myMoney.print();
        myMoney.convertToUsd();
        myMoney.convertToEur();
        System.out.println("");
        Money myMoneyTwo = new Money(usdRate, 100, JPY);
        myMoneyTwo.print();
        myMoneyTwo.convertToEur();
        System.out.println("");
        Money myMoneyThree = new Money(usdRate, 10, EUR);
        myMoneyThree.print();
        myMoneyThree.convertToJpy();
    }
}

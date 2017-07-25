package com.jlastudioiv;

public class Money {
    private MoneyLabel USD = MoneyLabel.USD;
    private MoneyLabel EUR = MoneyLabel.EUR;
    private MoneyLabel JPY = MoneyLabel.JPY;
    private MoneyLabel XBC = MoneyLabel.XBC;

    private Rate rate;
    private double moneyAmount;
    private MoneyLabel moneyLabel;

    public Money(Rate rate, double moneyAmount, MoneyLabel moneyLabel) {
        this.rate = rate;
        this.moneyAmount = moneyAmount;
        this.moneyLabel = moneyLabel;
    }

    public MoneyLabel getMoneyLabel() {
        return moneyLabel;
    }

    public void convertToBase() {
        if (moneyLabel != rate.getBaseLabel()) {
            if (moneyLabel == USD) {
                moneyAmount = moneyAmount / rate.getUsdRate();
            } else if (moneyLabel == EUR) {
                moneyAmount = moneyAmount / rate.getEurRate();
            } else if (moneyLabel == JPY) {
                moneyAmount = moneyAmount / rate.getJpyRate();
            } else if (moneyLabel == XBC) {
                moneyAmount = moneyAmount / rate.getXbcRate();
            }
            moneyLabel = rate.getBaseLabel();
            System.out.println("inbetween conversion start");
            print();
            System.out.println("inbetween conversion end");
        }
    }

    public void convertToUsd() {
        if (moneyLabel != USD) {
            convertToBase();
            moneyLabel = USD;
            moneyAmount = moneyAmount * rate.getUsdRate();
            print();
        }
    }
    public void convertToEur() {
        if (moneyLabel != EUR) {
            convertToBase();
            moneyLabel = EUR;
            moneyAmount = moneyAmount * rate.getEurRate();
            print();
        }
    }
    public void convertToJpy() {
        if (moneyLabel != JPY) {
            convertToBase();
            moneyLabel = JPY;
            moneyAmount = moneyAmount * rate.getJpyRate();
            print();
        }
    }
    public void convertToXbc() {
        if (moneyLabel != XBC) {
            convertToBase();
            moneyLabel = XBC;
            moneyAmount = moneyAmount * rate.getXbcRate();
            print();
        }
    }

//    public void convertToUsd() {
//        // if the base symbol is not usd
//        // convert value to usd
//
//        // compare money value to base value
//        // convert to usd
//        // convert to target currency
//        convertToBase();
//        moneyLabel = USD;
//        moneyAmount = moneyAmount * rate.getUsdRate();
//    }
//    public void convertToEur() {
//        if (moneyLabel != rate.getBaseLabel()) {
//            moneyLabel = rate.getBaseLabel();
//            if (moneyLabel == USD) {
//                moneyAmount = moneyAmount / rate.getUsdRate();
//            } else if (moneyLabel == EUR) {
//                moneyAmount = moneyAmount / rate.getEurRate();
//            } else if (moneyLabel == JPY) {
//                moneyAmount = moneyAmount / rate.getJpyRate();
//            } else if (moneyLabel == XBC) {
//                moneyAmount = moneyAmount / rate.getXbcRate();
//            }
//        }
//    }
//    public void convertToJpy() {
//        convertToBase();
//        moneyLabel = JPY;
//        moneyAmount = moneyAmount * rate.getJpyRate();
//    }
//    public void convertToXbc() {
//        convertToBase();
//        moneyLabel = XBC;
//        moneyAmount = moneyAmount * rate.getXbcRate();
//    }
//    public void convertToBase() {
//        MoneyLabel baseCurrency = rate.getBaseLabel();
//        if (baseCurrency == USD) {
//            moneyLabel = USD;
//
//        } else if (baseCurrency == EUR) {
//            moneyLabel = USD;
//
//        } else if (baseCurrency == JPY) {
//            moneyLabel = USD;
//
//        } else if (baseCurrency == XBC) {
//            moneyLabel = USD;
//
//        } else {
//            System.out.println("Critical Error");
//        }
//     }
//    public void convertToUsd() {
//        if (getMoneyLabel() == MoneyLabel.USD) {
//            System.out.println(getMoneyLabel() + " " + moneyAmount);
//        } else if (rate.getBaseLabel() == MoneyLabel.USD) {
//            moneyLabel = MoneyLabel.USD;
//            moneyAmount = moneyAmount * rate.getUsdRate();
//            System.out.println(getMoneyLabel() + " " + moneyAmount);
//        } else {
//            convertToBase();
//            moneyLabel = MoneyLabel.USD;
//            moneyAmount = moneyAmount * rate.getUsdRate();
//            System.out.println(getMoneyLabel() + " " + moneyAmount);
//        }
//    }
//    public void convertToEur() {
//        if (getMoneyLabel() == MoneyLabel.EUR) {
//            System.out.println(getMoneyLabel() + " " + moneyAmount);
//        } else if (rate.getBaseLabel() == MoneyLabel.EUR) {
//            moneyLabel = MoneyLabel.EUR;
//            moneyAmount = moneyAmount * rate.getEurRate();
//            System.out.println(getMoneyLabel() + " " + moneyAmount);
//        } else {
//            convertToBase();
//            moneyLabel = MoneyLabel.EUR;
//            moneyAmount = moneyAmount * rate.getEurRate();
//            System.out.println(getMoneyLabel() + " " + moneyAmount);
//        }
//    }
//    public void convertToJpy() {
//        if (getMoneyLabel() == MoneyLabel.JPY) {
//            System.out.println(getMoneyLabel() + " " + moneyAmount);
//        } else if (rate.getBaseLabel() == MoneyLabel.JPY) {
//            moneyLabel = MoneyLabel.JPY;
//            moneyAmount = moneyAmount * rate.getJpyRate();
//            System.out.println(getMoneyLabel() + " " + moneyAmount);
//        } else {
//            convertToBase();
//            moneyLabel = MoneyLabel.JPY;
//            moneyAmount = moneyAmount * rate.getJpyRate();
//            System.out.println(getMoneyLabel() + " " + moneyAmount);
//        }
//    }
//    public void convertToUsd() {
//        if (getMoneyLabel() == MoneyLabel.USD) {
//            System.out.println(getMoneyLabel() + " " + moneyAmount);
//        } else if (rate.getBaseLabel() == MoneyLabel.USD) {
//            moneyLabel = MoneyLabel.USD;
//            moneyAmount = moneyAmount * rate.getUsdRate();
//            System.out.println(getMoneyLabel() + " " + moneyAmount);
//        } else {
//            convertToBase();
//            moneyLabel = MoneyLabel.USD;
//            moneyAmount = moneyAmount * rate.getUsdRate();
//            System.out.println(getMoneyLabel() + " " + moneyAmount);
//        }
//    }

//    public void convertToEur() {
//        if (getMoneyLabel() == MoneyLabel.EUR) {
//            System.out.println("already label");
//        } else {
//            convertToBase();
//            moneyLabel = MoneyLabel.EUR;
//            moneyAmount = moneyAmount * rate.getEurRate();
//            System.out.println(moneyAmount);
//        }
//    }
//    public void convertToJpy() {
//        if (getMoneyLabel() == MoneyLabel.JPY) {
//            System.out.println("already label");
//        } else {
//            convertToBase();
//            moneyLabel = MoneyLabel.JPY;
//            moneyAmount = moneyAmount * rate.getJpyRate();
//            System.out.println(moneyAmount);
//        }
//    }
//    public void convertToXbc() {
//        if (getMoneyLabel() == MoneyLabel.XBC) {
//            System.out.println("already label");
//        } else {
//            convertToBase();
//            moneyLabel = MoneyLabel.XBC;
//            moneyAmount = moneyAmount * rate.getXbcRate();
//            System.out.println(moneyAmount);
//        }
//    }
//    public void convertToBase() {
//        MoneyLabel baseMoneyLabel = rate.getBaseLabel();
//        if (baseMoneyLabel == MoneyLabel.USD) {
//            convertToUsd();
//        } else if (baseMoneyLabel == MoneyLabel.EUR) {
//            convertToEur();
//        } else if (baseMoneyLabel == MoneyLabel.JPY) {
//            convertToJpy();
//        } else if (baseMoneyLabel == MoneyLabel.XBC) {
//            convertToXbc();
//        }
//    }
    public void print() {
        System.out.println(getMoneyLabel() + " " + moneyAmount);
    }
}

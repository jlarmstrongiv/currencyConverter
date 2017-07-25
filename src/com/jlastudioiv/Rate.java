package com.jlastudioiv;

public class Rate implements IRate {
    private MoneyLabel baseLabel;
    private double usdRate;
    private double eurRate;
    private double jpyRate;
    private double xbcRate;

    public Rate(MoneyLabel baseLabel, double usdRate, double eurRate, double jpyRate, double xbcRate) {
        this.usdRate = usdRate;
        this.eurRate = eurRate;
        this.jpyRate = jpyRate;
        this.xbcRate = xbcRate;
        this.baseLabel = baseLabel;
    }

    public MoneyLabel getBaseLabel() {
        return baseLabel;
    }

    public double getUsdRate() {
        return usdRate;
    }

    public double getEurRate() {
        return eurRate;
    }

    public double getJpyRate() {
        return jpyRate;
    }

    public double getXbcRate() {
        return xbcRate;
    }
}

package com.company.cmodels;

public class BeanCoffee extends Coffee {
    public BeanCoffee(String coffeeType, int priceForL, int sortsCount, double packVolume) {
        super(coffeeType, priceForL, sortsCount, packVolume);
    }

    @Override
    public int calculateSortPrice(int sort) {
        return super.getPriceForL() / sort;
    }
}

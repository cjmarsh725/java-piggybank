package com.lambdaschool;

public class Penny implements Money
{
    private static final double individualWorth = 0.01;
    private int amount;

    public Penny()
    {
        amount = 1;
    }

    public Penny(int amount)
    {
        this.amount = amount;
    }

    @Override
    public double getValue()
    {
        return individualWorth * amount;
    }

    @Override
    public String getContents()
    {
        return amount + " Penny";
    }
}

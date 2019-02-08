package com.lambdaschool;

public class Nickle implements Money
{
    private static final double individualWorth = 0.05;
    private int amount;

    public Nickle()
    {
        amount = 1;
    }

    public Nickle(int amount)
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
        return amount + " Nickle";
    }
}

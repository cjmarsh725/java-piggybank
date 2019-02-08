package com.lambdaschool;

public class Dollar implements Money
{
    private static final double individualWorth = 1.0;
    private int amount;

    public Dollar()
    {
        amount = 1;
    }

    public Dollar(int amount)
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
        return "$" + amount;
    }
}

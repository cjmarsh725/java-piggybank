package com.lambdaschool;

public class Dime implements Money
{
    private static final double individualWorth = 0.1;
    private int amount;

    public Dime()
    {
        amount = 1;
    }

    public Dime(int amount)
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
        return amount + " Dime";
    }
}

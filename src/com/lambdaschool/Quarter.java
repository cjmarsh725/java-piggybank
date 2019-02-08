package com.lambdaschool;

public class Quarter implements Money
{
    private static final double individualWorth = 0.25;
    private int amount;

    public Quarter()
    {
        amount = 1;
    }

    public Quarter(int amount)
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
        return amount + " Quarter";
    }
}

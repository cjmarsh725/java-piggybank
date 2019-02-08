package com.lambdaschool;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Money> piggyBank = new ArrayList<>();
        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickle(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));
        double total = 0;
        for (Money m : piggyBank)
        {
            total += m.getValue();
            System.out.println(m.getContents());
        }
        System.out.println("The piggy bank holds $" + total);
    }
}

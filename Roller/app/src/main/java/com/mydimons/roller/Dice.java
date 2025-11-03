package com.mydimons.roller;

public class Dice {
    private final int maxNumber;

    public int roll()
    {
        return (int)(Math.random() * maxNumber); // 0 to 100
    }

    public Dice(int maxNumber1)
    {
        maxNumber = maxNumber1;
    }
}

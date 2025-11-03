package com.mydimons.roller;

public class Dice {
    private final int maxNumber;
    public int rolledNumber;
    public void roll()
    {
        rolledNumber = (int)(Math.random() * (maxNumber + 1)); // 0 to 100
    }

    public Dice(int maxNumber1)
    {
        maxNumber = maxNumber1;
    }
}

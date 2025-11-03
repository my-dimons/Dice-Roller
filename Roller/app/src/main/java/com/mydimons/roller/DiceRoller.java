package com.mydimons.roller;
import java.util.ArrayList;
import java.util.List;

public class DiceRoller {
    List<Dice> dice = new ArrayList<>();
    public DiceRoller(int rolls, int diceSides)
    {
        // create dice
        for (int i = 0; i < rolls; i++)
        {
            dice.add(new Dice(diceSides));
        }
    }

    private void RollAllDice()
    {
        for (Object die : dice.toArray())
        {
            
        }
    }
}

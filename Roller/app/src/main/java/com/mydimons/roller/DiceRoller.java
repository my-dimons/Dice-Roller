package com.mydimons.roller;
import java.util.ArrayList;
import java.util.List;

public class DiceRoller {
    List<Dice> dice = new ArrayList<>();
    private int diceRolls;

    List<Integer> diceAfterRoll = new ArrayList<>();
    public DiceRoller(int rolls, int diceSides)
    {
        // create dice
        for (int i = 0; i < rolls; i++)
        {
            dice.add(new Dice(diceSides));
        }

        while (!dice.isEmpty())
            rollAllDice();

        System.out.println("\nTook " + diceRolls + " rolls to get to 0\n");

        System.out.println("Average percent lost: " + Math.round(getAverageDicePercentLoss(rolls)) + "%");
    }

    private double getAverageDicePercentLoss(int rolls) {
        double percent = 0;
        for (int i = 0; i < diceAfterRoll.size(); i++)
        {
            int lastTrialDiceAmount = i - 1 < 0 ? rolls : diceAfterRoll.get(i - 1);

            percent += (float) diceAfterRoll.get(i) / lastTrialDiceAmount * 100;
        }

        return  percent / diceAfterRoll.size();
    }

    private void rollAllDice()
    {
        List<Dice> newDice = new ArrayList<>();

        for (int i = 0; i < dice.size(); i++)
        {
            dice.get(i).roll();

            if (dice.get(i).rolledNumber == 0)
            {
                newDice.add(dice.get(i));
            }
        }

        System.out.println("Now " + newDice.size() + " dice remain");

        diceAfterRoll.add(newDice.size());
        diceRolls++;
        dice = newDice;
    }
}

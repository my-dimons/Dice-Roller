package com.mydimons.roller;

import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number of dice: ");
        int rolls = scan.nextInt();

        System.out.print("Input number of sides: ");
        int sides = scan.nextInt() - 1;

        DiceRoller roller = new DiceRoller(rolls, sides);
    }
}
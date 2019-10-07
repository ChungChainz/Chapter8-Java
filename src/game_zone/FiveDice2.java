package game_zone;

import java.util.Random;

public class FiveDice2 {
    public static void main(String[] args)
    {
        Random rand = new Random();

        int[] userDieRolls = new int [5];
        int[] compDieRolls = new int [5];
        int userTotal = 0;

        for(int i = 0; i < 5; ++i)
        {
            int compDie = rand.nextInt(6)+1;
            compDieRolls[i] = compDie;

            int userDie = rand.nextInt(6)+1;
            userDieRolls[i] = userDie;

            userTotal = userTotal + userDieRolls[i];
        }
        System.out.print("You rolled " + userDieRolls[0] + userDieRolls[1] + userDieRolls[2] + userDieRolls[3]
                + userDieRolls[4]);
        System.out.print("\nComputer rolled " + compDieRolls[0] + compDieRolls[1] + compDieRolls[2] + compDieRolls[3]
                + compDieRolls[4]);

      result(userDieRolls,compDieRolls,userTotal);
    }
    public static void result(int[]userDieRolls, int[] compDieRolls, int userTotal)
    {
        if(userTotal % 5 == 0)
        {
            System.out.println("You have 5 of a kind.");
        }
        else if (userDieRolls[0] == userDieRolls[1] == userDieRolls[2])
    }
}

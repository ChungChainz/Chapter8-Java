package game_zone;

import java.util.Random;

public class FiveDice2 {
    public static void main(String[] args)
    {
        Random rand = new Random();

        int[] userDieRolls = new int [5];
        int[] compDieRolls = new int [5];

        for(int i = 0; i < 5; ++i) {
            int compDie = rand.nextInt(6) + 1;
            compDieRolls[i] = compDie;

            int userDie = rand.nextInt(6) + 1;
            userDieRolls[i] = userDie;

        }

        int compMatch;
        int userMatch;
        String computerName = "Computer";
        String userName = "You";
        result(computerName, compDieRolls, 5);
        result(userName, userDieRolls, 5);
        compMatch = ofAKind(compDieRolls, 5);
       userMatch = ofAKind(userDieRolls, 5);
        if(compMatch == 1){
            System.out.println("Computer has nothing");
            }
        else
        {
            System.out.println("Computer has " + compMatch + " of a kind");
        }
        if(userMatch == 1) {
            System.out.println("You have nothing");
        }
        else{
            System.out.println("You have " + userMatch + " of a kind");}
        if(compMatch > userMatch){
            System.out.println("Computer wins");
        }
        else
        if(compMatch < userMatch){
            System.out.println("You win");
        }
        else{
            System.out.println("It's a tie");
        }

    }
    public static void result(String name, int[] die, int dieRolls)
    {
        int x;
        String dice = "";
        for(x = 0; x < dieRolls; ++x){
            dice = dice + die[x] + " ";
        }
        System.out.println(name + " rolled: " + dice);
    }
    public static int ofAKind(int[] die, int num)
    {
        int[] same = new int[num];
        int x, y;
        int highest;
        for(x = 0; x < num; ++x)
            same[x] = 1;
        for(x = 0; x < num - 1; ++x)
        {
            for(y = x + 1; y < num; ++y)
                if(die[x] == die[y])
                {
                    same[x]++;
                }
        }
        highest = same[0];
        for(x = 1; x < num; ++x)
            if(same[x] > highest)
                highest = same[x];
        return highest;
    }

    }


package exercises;

import java.util.Scanner;

public class DistanceFromAverage {
    public static void main(String[] args)
    {
        double values;
        double loops;
        double total = 0;
        double counter = 1;
        double avg;
        double difference;
        double[] numArray = new double[20];

        Scanner input = new Scanner(System.in);
        System.out.println("How many values are you entering? (Up to 20)");
        loops = input.nextDouble();
        if(loops <= 20) {
                for (int i = 0; i < loops; ++i) {
                    System.out.println("Enter your value " + (i + 1) + " here (up to 20) >>>");
                    values = input.nextDouble();
                    numArray[i] = values;
                }
                for (int j = 0; j < loops; ++j) {
                    total = total + numArray[j];
                    avg = total / counter;
                    difference = numArray[j] - avg;
                    ++counter;
                    System.out.println("The entered number is " + numArray[j] + ", it is "
                            + difference + " away from the average of " + avg);
                }
        }
        else
        {
            System.out.println("INVALID VALUE!");
        }

    }

}

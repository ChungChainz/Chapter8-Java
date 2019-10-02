package exercises;

import java.util.Scanner;

public class DistanceFromAverage {
    public static void main(String[] args)
    {
        double userEntry;

        double[] numArray = new double[20];

        for(int i = 0; i < numArray.length; ++i)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your value" + (i+1) + "here >>>" );
            userEntry = input.nextDouble();

        }


    }

}

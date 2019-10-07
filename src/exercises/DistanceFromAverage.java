package exercises;

import java.util.Scanner;

import static java.lang.Math.abs;

public class DistanceFromAverage {
    public static void main(String[] args)
    {
        double values;
        double total = 0;
        int counter = 0;
        double avg;
        double difference;
        boolean quit = true;
        double[] numArray = new double[20];

        Scanner input = new Scanner(System.in);
        while (quit) {

            System.out.println("Enter your value here (up to 20) >>>");
            values = input.nextDouble();
            numArray[counter] = values;
            counter++;
            if(counter == 20)
            {
                quit = false;
            }
            else if(values == 99999)
            {
                quit = false;
            }
            else{
               numArray[counter] = values;
                total = total + values;
            }
            counter++;
        }
        avg = total/counter;
        for(int i = 0; i<counter; ++i)
        {
            difference = numArray[i] - avg;
            System.out.println("The average was " + avg + "\nFirst entry was " + numArray[i] +
            "\n The difference was" + abs(difference) + "Total Count " + counter);
        }

    }

}

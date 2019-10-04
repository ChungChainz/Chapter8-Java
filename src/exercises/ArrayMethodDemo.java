package exercises;

import java.util.Scanner;

public class ArrayMethodDemo {
    public static void main(String[] args)
    {
        int arrayNumbers;
        int[] tenArray = new int[10];

        Scanner input = new Scanner(System.in);
        System.out.println("Type in 10 integer numbers: ");
        for(int i = 0; i < 10; ++i) {
            System.out.println("Enter Integers here >>> ");
            arrayNumbers = input.nextInt();
            tenArray[i] = arrayNumbers;
        }
        showIntegers(tenArray);
        reverseIntegers(tenArray);
        sumIntegers(tenArray);
        limitedIntegers(tenArray);
        higherIntegers(tenArray);
    }
    public static void showIntegers(int[] tenArray)
    {
        System.out.println("In Order:\n");
        for(int v = 0; v < 10; ++v ) {
            System.out.println(tenArray[v]);
        }
    }
    public static void reverseIntegers(int[] tenArray)
    {
        System.out.println("Reverse Order:\n");
        for(int j = 9; j > 0; --j )
        {
            System.out.println(tenArray[j]);
        }
    }
    public static void sumIntegers(int[] tenArray)
    {
       int sum = 0;
        for (int l = 0; l < 10; ++l)
        {
            sum = tenArray[l] + sum;
        }
        System.out.println("Sum of the Integers =: " + sum);
    }
    public static void limitedIntegers(int[] tenArray)
    {
        int limit = 20;

        System.out.println("Numbers under the limit '20':\n");

        for (int n = 0; n < 10; ++n)
        {
            if(limit > tenArray[n])
          {
              System.out.println(tenArray[n]);
          }
        }

    }
    public static void higherIntegers(int[] tenArray) {
        int average;
        int total = 0;

        System.out.println("Numbers above the average:\n");

        for (int a = 0; a < 10; ++a) {
            total = tenArray[a] + total;
            }
        average = total / tenArray.length;
        for(int b = 0; b < 10; ++b)
            if (average < tenArray[b]) {
            System.out.println(tenArray[b]);
        }
    }
}

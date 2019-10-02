package YouDoIt;

import javax.swing.*;

public class FindPrice {
    public static void main(String[] args)
    {
        final int NUMBER_OF_ITEMS = 10;
        int[] validValues = {101, 108, 201, 213, 266, 304, 311, 409, 411, 412};

        double[] prices = {0.29, 1.23, 3.50, 0.69, 6.79, 3.19, 0.99, 0.89, 1.26, 8.00};

        String quitProgram;
        String strItem;
        int itemOrdered;
        double itemPrice = 0;
        int quit = 0;
        do {
            boolean validItem = false;

            strItem = JOptionPane.showInputDialog(null, "Enter the item number you want to order?");
            itemOrdered = Integer.parseInt(strItem);

            for (int i = 0; i < NUMBER_OF_ITEMS; ++i) {
                if (itemOrdered == validValues[i]) {
                    validItem = true;
                    itemPrice = prices[i];
                }
            }
            if (validItem) {
                JOptionPane.showMessageDialog(null, "The price for item  " +
                        itemOrdered + " is " + itemPrice);
            } else {
                JOptionPane.showMessageDialog(null, "Sorry - Invalid Entry");
            }
            quitProgram = JOptionPane.showInputDialog(null, "Do you want to order more? " +
                    "Type '1' to continue, if not type '999' to Quit...");
            quit = Integer.parseInt(quitProgram);

        }while(quit != 999);
    }
}

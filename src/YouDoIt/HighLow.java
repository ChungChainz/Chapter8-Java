package YouDoIt;

public class HighLow {
    public static void displayHighLow(int[] scoresArray)
    {
        int high = 0;
        int low = 100;
        for(int j = 0; j < scoresArray.length; j++)
        {
            if (scoresArray[j] > high)
            {
                high = scoresArray[j];
            }
            else if(scoresArray[j] < low)
            {
                low = scoresArray[j];
            }
        }
        System.out.println("The high is " + high + ". The low is " + low + ".");
    }
}

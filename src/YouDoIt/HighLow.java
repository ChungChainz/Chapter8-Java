package YouDoIt;

public class HighLow {
    public static void displayHighLow(int[] arr)
    {
        int high = 0;
        int low = 100;
        for(int j = 0; j < arr.length; j++)
        {
            if (arr[j] > high)
            {
                high = arr[j];
            }
            else if(arr[j] < low)
            {
                low = arr[j];
            }
        }
        System.out.println("The high is " + high + ". The low is " + low + ".");
    }
}

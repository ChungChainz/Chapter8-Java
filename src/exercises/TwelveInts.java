package exercises;

public class TwelveInts {
    public static void main(String[] args)
    {

        int[] twelve ={4,5,6,7,8,9,10,11,12,13,14,15};

        for(int i = 0; i < twelve.length; ++i)
        {
            System.out.println(twelve[i]);
        }
        for(int j = 11; j >= 0; --j)
        {
            System.out.println(twelve[j]);
        }

    }
}

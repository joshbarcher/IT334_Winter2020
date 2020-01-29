package chairs;

import java.util.Arrays;

public class SortingChairs
{
    public static void main(String[] args)
    {
        Chair[] chairs = {
            new Chair(3, "metal", false, "gray", 29.99),
            new Chair(4, "wooden", true, "brown", 59.99),
            new Chair(1, "ceramic", true, "beige", 19.99),
            new Chair(5, "plastic", false, "white", 39.99)
        };

        for (int i = 0; i < chairs.length; i++)
        {
            System.out.println(chairs[i]);
        }

        System.out.println();
        Arrays.sort(chairs);

        for (int i = 0; i < chairs.length; i++)
        {
            System.out.println(chairs[i]);
        }
    }
}

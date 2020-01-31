package chairs;

import java.util.Comparator;

public class ChairComparator implements Comparator
{
    @Override
    public int compare(Object chair1, Object chair2)
    {
        if (chair1 instanceof Chair && chair2 instanceof Chair)
        {
            Chair actualChair1 = (Chair)chair1;
            Chair actualChair2 = (Chair)chair2;

            return actualChair1.getNumLegs() - actualChair2.getNumLegs();
        }
        throw new IllegalArgumentException("Cannot compare chairs with non-chairs");
    }
}

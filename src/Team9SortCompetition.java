public class Team9SortCompetition extends SortCompetition
{
    public int challengeOne(int[] arr)
    {

    }

    public int challengeTwo(String[] arr, String query)
    {

    }

    public int challengeThree(int[] arr)
    {

    }

    public int challengeFour(int[][] arr)
    {

    }

    public int challengeFive(Comparable[] arr, Comparable query)
    {

    }

    //Add a custom greeting so your sorter can introduce itself
    public String greeting()
    {

    }

    public static int[] merge(int[] left, int[] right)
    {
        int[] merged = new int[left.length + right.length];
        int l = 0;
        int r = 0;
        int i = 0;
        for (; i < merged.length; i++)
        {
            try
            {
                while (left[l] <= right[r])
                {
                    merged[i] = left[l];
                    l++;
                    i++;
                }
                while (right[r] <= left[l])
                {
                    merged[i] = right[r];
                    r++;
                    i++;
                }
            }
            catch (ArrayIndexOutOfBoundsException exception)
            {
                break;
            }
        }
        if (l < r)
        {
            while (l < left.length)
            {
                merged[i] = left[l];
                l++;
                i++;
            }
        }
        if (r < l)
        {
            while (r < right.length)
            {
                merged[i] = right[r];
                r++;
                i++;
            }
        }
        return merged;
    }
}

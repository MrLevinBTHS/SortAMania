public class Team9SortCompetition extends SortCompetition
{
    public int challengeOne(int[] arr)
    {
        SortingUtil.quickSort(arr);
        return (arr[4999] + arr[5000]) / 2;
    }

    public int challengeTwo(String[] arr, String query)
    {
        SortingUtil.timSort(arr);
        for (int i = 0; i < 10000; i++)
        {
            if (query.equals(arr[i]))
            {
                return i;
            }
        }
        return -1;
    }

    public int challengeThree(int[] arr)
    {
        SortingUtil.insertionSort(arr);
        return (arr[49999] + arr[50000]) / 2;
    }

    public int challengeFour(int[][] arr)
    {
        int[] median = new int[1000];
        for (int i = 0; i < 1000; i++)
        {
            SortingUtil.quickSort(arr[i]);
            median[i] = (arr[i][499] + arr[i][500])/2;
        }
        SortingUtil.mergeSort(median);
        return (median[499] + median[500])/2;
    }

    public int challengeFive(Comparable[] arr, Comparable query)
    {
        SortingUtil.timSort(arr);
        for (int i = 0; i < 10000; i++)
        {
            if (query.equals(arr[i]))
            {
                return i;
            }
        }
        return -1;
    }

    //Add a custom greeting so your sorter can introduce itself
    public String greeting()
    {
        return "lagging";
    }
}

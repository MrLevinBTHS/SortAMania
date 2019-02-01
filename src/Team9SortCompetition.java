public class Team9SortCompetition extends SortCompetition
{
    public int challengeOne(int[] arr)
    {
        SortingUtil.mergeSort(arr);
        return (arr[4999] + arr[5000]) / 2;
    }

    public int challengeTwo(String[] arr, String query)
    {

    }

    public int challengeThree(int[] arr)
    {
        SortingUtil.insertionSort(arr);
        return (arr[49999] + arr[50000]) / 2;
    }

    public int challengeFour(int[][] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            SortingUtil.mergeSort(arr[i]);
            
        }
    }

    public int challengeFive(Comparable[] arr, Comparable query)
    {

    }

    //Add a custom greeting so your sorter can introduce itself
    public String greeting()
    {

    }
}

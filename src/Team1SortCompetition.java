public class Team1SortCompetition extends SortCompetition {
    @Override
    public int challengeOne(int[] arr)
    {
        util.mergeSort(arr);
        return util.findMedian(arr);
    }

    @Override
    public int challengeTwo(String[] arr, String query)
    {
        util.strmergeSort(arr);
        return util.queryCheck(query, arr);
    }



    @Override
    public int challengeThree(int[] arr)
    {
        util.insertionSort(arr);
        return util.findMedian(arr);
    }

    @Override
    public int challengeFour(int[] arr)
    {
        util.insertionSort(arr);
        return util.medianofMedians(arr);

    }

    @Override
    public int challengeFive(Comparable[] arr, Comparable query) {
        util.thingymergeSort(arr);
        return util.thingyqueryCheck(query,arr);
    }

    @Override
    public String greeting() {
        return "Hello, we are team 1!";
    }
}
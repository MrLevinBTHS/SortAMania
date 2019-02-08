public class SortingUtil
{
    //challengeOne
    //quicksort


    //challengeTwo



    //challengeThree
    public static void insertionSort(int[] arr)
    {
        for (int i = 1; i < arr.length; i++)
        {
            int h = i-1;
            int temp = arr[i];
            while (h >= 0 && temp < arr[h])
            {
                arr[h+1] = arr[h];
                h--;
            }
            arr[h+1] = temp;
        }
    }


    //challengeFour
    //quicksort


    //challengeFive
    //timsort
    private static void merge(Comparable[] elements, int from, int mid, int to, Comparable[] temp)
    {
        int i = from;
        int j = mid + 1;
        int k = from;
        while (i <= mid && j <= to)
        {
            if (elements[i].compareTo(elements[j]) < 1)
            {
                temp[k] = elements[i];
                i++;
            }
            else
            {
                temp[k] = elements[j];
                j++;
            }
            k++;
        }
        while (i <= mid)
        {
            temp[k] = elements[i];
            i++;
            k++;
        }
        while (j <= to)
        {
            temp[k] = elements[j];
            j++;
            k++;
        }
        for (k = from; k <= to; k++)
        {
            elements[k] = temp[k];
        }
    }
    public static void mergeSort(Comparable[] elements)
    {
        int n = elements.length;
        Comparable[] temp = new Comparable[n];
        mergeSortHelper(elements, 0, n - 1, temp);
    }
    private static void mergeSortHelper(Comparable[] elements, int from, int to, Comparable[] temp)
    {
        if (from < to)
        {
            int middle = (from + to) / 2;
            mergeSortHelper(elements, from, middle, temp);
            mergeSortHelper(elements, middle + 1, to, temp);
            merge(elements, from, middle, to, temp);
        }
    }
}

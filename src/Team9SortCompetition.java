public class Team9SortCompetition extends SortCompetition
{
    public int challengeOne(int[] arr)
    {
        mergeSort(arr);
        return (arr[4999] + arr[5000]) / 2;
    }

    public int challengeTwo(String[] arr, String query)
    {
        mergeSort(arr);
        return binarySearch(arr, query);
    }

    public int challengeThree(int[] arr)
    {
        insertionSort(arr);
        return (arr[49999] + arr[50000]) / 2;
    }

    public int challengeFour(int[][] arr)
    {
        int[] median = new int[1000];
        for (int i = 0; i < 1000; i++)
        {
            mergeSort(arr[i]);
            median[i] = (arr[i][499] + arr[i][500])/2;
        }
        int value = (median[499] + median[500])/2;
        insertionSort(median, arr);
        return value;
    }

    public int challengeFive(Comparable[] arr, Comparable query)
    {
        mergeSort(arr);
        return binarySearch(arr, query);
    }

    public String greeting()
    {
        return "Arrays.sort(out my life);";
    }

    //challengeOne
    private static void merge(int[] elements, int from, int mid, int to, int[] temp)
    {
        int i = from;
        int j = mid + 1;
        int k = from;
        while (i <= mid && j <= to)
        {
            if (elements[i] < elements[j])
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
    private static void mergeSort(int[] elements)
    {
        int n = elements.length;
        int[] temp = new int[n];
        mergeSortHelper(elements, 0, n - 1, temp);
    }
    private static void mergeSortHelper(int[] elements, int from, int to, int[] temp)
    {
        if (from < to)
        {
            int middle = (from + to) / 2;
            mergeSortHelper(elements, from, middle, temp);
            mergeSortHelper(elements, middle + 1, to, temp);
            merge(elements, from, middle, to, temp);
        }
    }

    //challengeTwo
    private static void merge(String[] elements, int from, int mid, int to, String[] temp)
    {
        int i = from;
        int j = mid + 1;
        int k = from;
        while (i <= mid && j <= to)
        {
            if (elements[i].compareTo(elements[j]) < 0)
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
    private static void mergeSort(String[] elements)
    {
        int n = elements.length;
        String[] temp = new String[n];
        mergeSortHelper(elements, 0, n - 1, temp);
    }
    private static void mergeSortHelper(String[] elements, int from, int to, String[] temp)
    {
        if (from < to)
        {
            int middle = (from + to) / 2;
            mergeSortHelper(elements, from, middle, temp);
            mergeSortHelper(elements, middle + 1, to, temp);
            merge(elements, from, middle, to, temp);
        }
    }

    private static int binarySearch(String arr[], String query)
    {
        int l = 0;
        int r = 9999;
        while (l <= r)
        {
            int m = (l+r)/2;
            if (query.compareTo(arr[m]) < 0)
            {
                r = m - 1;
            }
            if (query.compareTo(arr[m]) > 0)
            {
                l = m + 1;
            }
            else
            {
                return m;
            }
        }
        return -1;
    }

    //challengeThree
    private static void insertionSort(int[] arr)
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
    private static void insertionSort(int median[], int arr[][])
    {
        for (int i = 1; i < arr.length; i++)
        {
            int h = i-1;
            int mtemp = median[i];
            int[] atemp = arr[i];
            while (h >= 0 && mtemp < median[h])
            {
                median[h+1] = median[h];
                arr[h+1] = arr[h];
                h--;
            }
            median[h+1] = mtemp;
            arr[h] = atemp;
        }
    }

    //challengeFive
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
    private static void mergeSort(Comparable[] elements)
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

    private static int binarySearch(Comparable arr[], Comparable query)
    {
        int l = 0;
        int r = 9999;
        while (l <= r)
        {
            int m = (l+r)/2;
            if (query.compareTo(arr[m]) < 0)
            {
                r = m - 1;
            }
            if (query.compareTo(arr[m]) > 0)
            {
                l = m + 1;
            }
            else
            {
                return m;
            }
        }
        return -1;
    }
}

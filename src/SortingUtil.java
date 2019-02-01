public class SortingUtil
{
    //challengeOne
    private static void merge(int[] elements, int from, int mid, int to, int[] temp)
    {
        merged = new int[arr.length];
        left = 0;
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
    public static void mergeSort(int[] elements)
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



    //challengeThree
    public static void Swap(int[] array, int x, int y)
    {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
    public static void insertionSort(int[] list1)
    {
        for (int i = 1; i < list1.length; i++)
        {
            for (int ii = i; ii > 0; ii--)
            {
                if (list1[ii] < list1[ii - 1])
                {
                    Swap(list1, ii, ii - 1);
                }
                else
                {
                    break;
                }
            }
        }
    }


    //challengeFour



    //challengeFive

}

public class SortingUtil
{
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

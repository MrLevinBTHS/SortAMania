// Team 10 Sort Competition: Ari Khaytser and Linyao Pan
//AP CSA
public class Team10SortCompetition extends SortCompetition {
    @Override
    public int challengeOne(int[] arr) {
        quickSort(arr, 0, arr.length-1);
        return getMedian(arr);
    }

    @Override
    public int challengeTwo(String[] arr, String query) {
        quickSort(arr, 0, arr.length-1);
        return binarySearch(arr, query);
    }

    @Override
    public int challengeThree(int[] arr) {
        mergeSort(arr);
        return  getMedian(arr);
    }

    @Override
    public int challengeFour(int[][] arr) {
        for(int i = 0; i < arr.length; i++){
            insertionSort(arr[i]);
        }
        quickSort(arr, 0, arr.length-1);
        int[] medians = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            medians[i] = getMedian(arr[i]);
        }
        return getMedian(medians);
    }

    @Override
    public int challengeFive(Comparable[] arr, Comparable query) {
        insertionSort(arr);
        return binarySearch(arr, query);
    }

    @Override
    public String greeting() {
        return "THIS IS TEAM 10, WHO THE HELLA FREAKIN YOU?";
    }

    public static void swap(int[][] arr, int a, int b){
        int[] temp = arr[a];
        arr[a]=arr[b];
        arr[b] = temp;
    }


    public static void swap(Comparable[] arr, int a, int b){
        Comparable temp = arr[a];
        arr[a]=arr[b];
        arr[b] = temp;
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b] = temp;
    }

    public static void swap(String[] arr, int a, int b){
        String temp = arr[a];
        arr[a]=arr[b];
        arr[b] = temp;
    }

    public static void swap(double[] arr, int a, int b){
        double temp = arr[a];
        arr[a]=arr[b];
        arr[b] = temp;
    }

    //Quicksort for Int Arrays
    public static void quickSort(int[][] arr, int low, int high)
    {
        if (low < high)
        {
            int split = quickSortHelper(arr, low, high);

            quickSort(arr, low, split - 1);  // Before pi
            quickSort(arr, split +1, high); // After pi
        }
    }

    public static int quickSortHelper(int[][] arr, int low, int high){
        int[] top = arr[high];
        int i = low -1;

        for (int j = low; j < high; j++){
            if(getMedian(arr[j]) <= getMedian(top)){
                i++;
                swap(arr, i ,j);
            }
        }
        i++;
        swap(arr, i, high);
        return i;
    }
    //

    //Quicksort for Ints
    public static void quickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            int split = quickSortHelper(arr, low, high);

            quickSort(arr, low, split - 1);  // Before pi
            quickSort(arr, split +1, high); // After pi
        }
    }

    public static int quickSortHelper(int[] arr, int low, int high){
        int top = arr[high];
        int i = low -1;

        for (int j = low; j < high; j++){
            if(arr[j] <= top){
                i++;
                swap(arr, i ,j);
            }
        }
        i++;
        swap(arr, i, high);
        return i;
    }
    //

    public static void mergeSort(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];
        mergeSortHelper(arr,0,n-1,temp);
    }

    public static void merge(int[] elements, int from, int mid, int to, int[] temp){
        int i = from;
        int j = mid + 1;
        int k = from;
        while (i <= mid && j <= to){
            if (elements[i] < elements[j]){
                temp[k] = elements[i];
                i++;
            }
            else{
                temp[k] = elements[j];
                j++;
            }
            k++;
        }
        while (i <= mid){
            temp[k] = elements[i];
            i++;
            k++;
        }
        while (j <= to){
            temp[k] = elements[j];
            j++;
            k++;
        }
        for (k = from; k <= to; k++){
            elements[k] = temp[k];
        }
    }
    public static void mergeSortHelper(int[] arr, int left, int right, int[] temp){
        if (left < right){
            int mid = (left+right)/2;
            mergeSortHelper(arr,left, mid,temp);
            mergeSortHelper(arr,mid+1,right,temp);
            merge(arr, left, mid, right, temp);
        }
    }

    //QuickSort for Strings
    public static void quickSort(String[] arr, int low, int high)
    {
        if (low < high)
        {
            int split = quickSortHelper(arr, low, high);

            quickSort(arr, low, split - 1);  // Before pi
            quickSort(arr, split +1, high); // After pi
        }
    }

    public static int quickSortHelper(String[] arr, int low, int high){
        String top = arr[high];
        int i = low -1;

        for (int j = low; j < high; j++){
            if(arr[j].compareTo(top) < 0){
                i++;
                swap(arr, i ,j);
            }
        }

        i++;
        swap(arr, i, high);
        return i;
    }
    ////
    public static int binarySearch(int[] arr, int target)
    {
        int min=0;
        int max=0;
        while(min<= max)
        {
            int middle= (min+max)/2;
            if(target> arr[middle])
            {
                min=middle+1;

            } else if(target< arr[middle])
            {
                max=middle-1;
            }else
            {
                return middle;
            }
        }
        return -1;
    }

    public static int binarySearch(Comparable[] arr, Comparable x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int res = x.compareTo(arr[m]);
            if (res == 0)
                return m;
            if (res > 0)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }

    public static int binarySearch(String[] arr, String x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int res = x.compareTo(arr[m]);
            if (res == 0)
                return m;
            if (res > 0)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }


    public static int[] randIntArr(int count){
        int[] lol = new int[count];
        for(int i = 0; i < count; i++){
            lol[i] = (int)(Math.random() * 10001);
        }
        return lol;
    }

    public static double[] randDoubleArr(int count){
        double[] lol = new double[count];
        for(int i = 0; i < count; i++){
            lol[i] = (Math.random() * 10001);
        }
        return lol;
    }

    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            for (int j = i; j > 0; j--){
                if(arr[j-1] > arr[j]){
                    swap(arr, j, j-1);
                }
                else {
                    break;
                }
            }
        }
    }

    public static void insertionSort(Comparable[] arr){
        for (int i = 1; i < arr.length; i++){
            for (int j = i; j > 0; j--){
                if(arr[j-1].compareTo(arr[j]) > 0){
                    swap(arr, j, j-1);
                }
                else {
                    break;
                }
            }
        }
    }

    public static String[] randStringArr(int length, int count){
        String[] arr = new String[count];
        while (count > 0){
            int i = 0;
            String s = "";
            while (i < length){
                char c = (char)((Math.random()*26)+97);
                s += c;
                i++;
            }
            count --;
            arr[count] = s;

        }
        return arr;
    }

    public static String print(int[] arr)
    {
        String result="";

        for(int num: arr)
        {
            result += " " + num;
        }
        return result;
    }

    public static String print(String[] arr)
    {
        String result="";

        for(String num: arr)
        {
            result += " " + num;
        }
        return result;
    }

    public static int getMedian(int[] sortedArray){
        int l = sortedArray.length;
        int mid = l/2;
        if(l == 0){
            return -1;
        }
        if (l % 2 == 0){
            return ((sortedArray[mid]+sortedArray[mid-1])/2);
        }
        else {
            return (sortedArray[mid]);
        }
    }

}

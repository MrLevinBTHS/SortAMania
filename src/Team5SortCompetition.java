public class Team5SortCompetition extends SortCompetition   {


    public static int binarySearch(String[] arr, String word){
        int leftPos = 0;
        int rightPos = arr.length-1;
        while (leftPos <= rightPos ){
            int mid = (leftPos + rightPos )/2;
            if (arr[mid].compareTo(word)>0){
                rightPos  = mid -1;
            }
            else if (arr[mid].compareTo(word)<0){
                leftPos = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static int binarySearch(Comparable[] arr, Comparable thing){
        int leftPos = 0;
        int rightPos = arr.length-1;
        while (leftPos <= rightPos ){
            int mid = (leftPos + rightPos )/2;
            if(arr[mid]==thing){
                return mid;
            }
            else if (arr[mid].compareTo(thing)>0){
                rightPos  = mid -1;
            }
            else if (arr[mid].compareTo(thing)<0){
                leftPos = mid + 1;
            }
        }
        return -1;
    }







    public static int median(int[] arr){
        int len = arr.length;
        int median = arr[(int)(len/2)];
        if(len%2==0){
            median = arr[(len/2)-1]+arr[len/2];
            median = median/2;
        }
        return median;
    }

    // String arrays
    public static void swap(String[] arr,int i, int j){
        String t = arr[i];
        arr[i] = arr[j];
        arr[j]=t;
    }


    public static void selectionSort(String[] arr){
        int n = arr.length;

        for (int i = 0; i < n-1; i++)
        {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j].compareTo(arr[min])<0) {
                    min = j;
                }
            }
            swap(arr, min , i);
        }
    }


    public static void BubbleSort(String[] arr){
        int x = arr.length-1;
        int stop;
        int swaps = 1;
        while(swaps>0){
            swaps = 0;
            stop = x;
            for(int i = 0;i<stop;i++){
                if(arr[i].compareTo(arr[i+1])>0){
                    swap(arr,i,i+1);
                    swaps++;
                    x = i;
                }
            }
        }
    }
    public static void InsertionSort (String[] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j>0;j--){
                if(arr[j].compareTo( arr[j-1])<0){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    // int arrays
    public static int[] copy(int[] i){
        int[] arr = new int[i.length];
        for (int j=0; j<i.length; j++){
            arr[j] = i[j];
        }
        return arr;
    }

    public static void swap(int[] arr,int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j]=t;
    }

    public static void swap(int[][] arr, int i, int j){
        int[] t = copy(arr[i]);
        arr[i] = copy(arr[j]);
        arr[j] = t;
    }

    public static void InsertionSort (int[][] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j>0;j--){
                if(median(arr[j])<median(arr[j+1])){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    public static void selectionSort(int[] list1){
        int n = list1.length;

        for (int i = 0; i < n-1; i++)
        {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (list1[j] < list1[min]) {
                    min = j;
                }
            }
            swap(list1, min , i);
        }
    }

    public static void BubbleSort(int[] arr){
        int x = arr.length-1;
        int stop;
        int swaps = 1;
        while(swaps>0){
            swaps = 0;
            stop = x;
            for(int i = 0;i<stop;i++){
                if(arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                    swaps++;
                    x = i;
                }
            }
        }
    }

    public static void InsertionSort (int[] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    // Merge #1
    public static void mergeSort(int[] arr) {
        int length = arr.length;
        int[] temp = new int[length];
        mergeSortHelper(arr, 0, length-1, temp);
    }

    private static void mergeSortHelper(int[] arr, int low, int high, int[] temp)
    {
        if (low < high)
        {
            int mid = (low + high) / 2;
            mergeSortHelper(arr, low, mid, temp);
            mergeSortHelper(arr, mid + 1, high, temp);
            merge(arr, low, mid, high, temp);
        }
    }

    private static void merge(int[] arr, int low, int mid, int high, int[] temp)
    {
        int i = low;
        int j = mid + 1;
        int k = low;
        while (i <= mid && j <= high)
        {
            if (arr[i] < arr[j])
            {
                temp[k] = arr[i];
                i++;
            }
            else
            {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid)
        {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= high)
        {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for (k = low; k <= high; k++)
        {
            arr[k] = temp[k];
        }
    }


//////////////////////////////////////////////////////////////////////////

    // Merge #2
    public static void mergeSort(int[][] arr) {
        int length = arr.length;
        int[][] temp = new int[length][arr[0].length];
        mergeSortHelper(arr, 0, length-1, temp);
    }

    private static void mergeSortHelper(int[][] arr, int low, int high, int[][] temp)
    {
        if (low < high)
        {
            int mid = (low + high) / 2;
            mergeSortHelper(arr, low, mid, temp);
            mergeSortHelper(arr, mid + 1, high, temp);
            merge(arr, low, mid, high, temp);
        }
    }

    private static void merge(int[][] arr, int low, int mid, int high, int[][] temp)
    {
        int i = low;
        int j = mid + 1;
        int k = low;
        while (i <= mid && j <= high)
        {
            if (median(arr[i]) < median(arr[j]))
            {
                temp[k] = copy(arr[i]);
                i++;
            }
            else
            {
                temp[k] = copy(arr[j]);
                j++;
            }
            k++;
        }
        while (i <= mid)
        {
            temp[k] = copy(arr[i]);
            i++;
            k++;
        }
        while (j <= high)
        {
            temp[k] = copy(arr[j]);
            j++;
            k++;
        }
        for (k = low; k <= high; k++)
        {
            arr[k] = copy(temp[k]);
        }
    }


    // Merge #3
    public static void mergeSort(Comparable[] arr) {
        int length = arr.length;
        Comparable[] temp = new Comparable[length];
        mergeSortHelper(arr, 0, length-1, temp);
    }

    private static void mergeSortHelper(Comparable[] arr, int low, int high, Comparable[] temp)
    {
        if (low < high)
        {
            int mid = (low + high) / 2;
            mergeSortHelper(arr, low, mid, temp);
            mergeSortHelper(arr, mid + 1, high, temp);
            merge(arr, low, mid, high, temp);
        }
    }

    private static void merge(Comparable[] arr, int low, int mid, int high, Comparable[] temp)
    {
        int i = low;
        int j = mid + 1;
        int k = low;
        while (i <= mid && j <= high)
        {
            if (arr[i].compareTo(arr[j]) < 0)
            {
                temp[k] = arr[i];
                i++;
            }
            else
            {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid)
        {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= high)
        {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for (k = low; k <= high; k++)
        {
            arr[k] = temp[k];
        }
    }

    public static int look (String[] arr,String word){
        for(int i=0; i<arr.length;i++){
            if (arr[i].equals(word)){
                return i;
            }
        }
        return -1;
    }

    public static int look (Comparable[] arr,Comparable thing){
        for(int i=0; i<arr.length;i++){
            if (arr[i] == thing){
                return i;
            }
        }
        return -1;
    }


    // Challenges
    public int challengeOne(int[] arr){
        mergeSort(arr);
        return median(arr);
    }

    public int challengeTwo(String[] arr, String query){
        InsertionSort(arr);
        return binarySearch(arr, query);
    }

    public int challengeThree(int[] arr){
        InsertionSort(arr);
        return median(arr);
    }

    public int challengeFour(int[][] arr){

        for(int i = 0;i<arr.length;i++){
            mergeSort(arr[i]);
        }
        mergeSort(arr);
        int len = arr.length;
        int median = (median(arr[(len/2)-1]) + median(arr[len/2]))/2;
        return median;
    }

    public int challengeFive(Comparable[] arr, Comparable query){
        mergeSort(arr);
        return binarySearch(arr,query);
    }

    //Add a custom greeting so your sorter can introduce itself
    public String greeting(){
        return ("i hate jazmine");
    }

}

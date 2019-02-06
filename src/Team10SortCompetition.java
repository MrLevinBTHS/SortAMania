public class Team10SortCompetition extends SortCompetition {
    @Override
    public int challengeOne(int[] arr) {
        quickSort(arr, 0, arr.length-1);
        return getMedian(arr);
    }

    @Override
    public int challengeTwo(String[] arr, String query) {

    }

    @Override
    public int challengeThree(int[] arr) {
        return 0;
    }

    @Override
    public int challengeFour(int[][] arr) {
        return 0;
    }

    @Override
    public int challengeFive(Comparable[] arr, Comparable query) {
        return 0;
    }

    @Override
    public String greeting() {
        return "WIP";
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
        public static Comparable[] randomThingArray(int num)
        {
            Comparable[] things = new Comparable[num];
            for(int i = 0; i <num; i++)
            {
                things[i] = new Thing();
            }
            return things;
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

public class Team6SortCompetition extends SortCompetition {
    @Override
    public int challengeOne(int[] arr) {
        mergeSort(arr);
        int medium = intMedian(arr);

        return medium;
    }

    @Override
    public int challengeTwo(String[] arr, String query) {
        mergeSort(arr);
        int index = biSearch(arr, query);

        return index;
    }

    @Override
    public int challengeThree(int[] arr)
    {
        insertionSort(arr);
        int medium = intMedian(arr);

        return medium;
    }

    @Override
    public int challengeFour(int[][] arr) {
        int[] medians = new int[arr.length];
        for(int i = 0; i< arr.length; i++){
            mergeSort(arr[i]);
            medians[i]= intMedian(arr[i]);
        }
        mergeSort(medians);
        int arrMedium = intMedian(medians);
        return arrMedium;
    }

    @Override
    public int challengeFive(Comparable[] arr, Comparable query) {
        insertionSort(arr);
        int index = biSearch(arr,query);

        return index;
    }

    @Override
    public String greeting() {
        return "Team 6: Wei Chen && Julius Ambroziak";
    }







    /* SortingMethods

     */

    public static void insertionSort(int[] arr){

        for (int i=1; i< arr.length; i++){
            int currentPos=i;
            while(!(currentPos==0) && arr[currentPos]< arr[currentPos-1]){
                swap(arr, currentPos, currentPos-1);
                currentPos--;

            }
        }
    }

    public static void insertionSort(Comparable[] arr){

        for (int i=1; i< arr.length; i++){
            int currentPos=i;
            while(!(currentPos==0) && arr[currentPos].compareTo(arr[currentPos-1]) < 0 ){
                swap(arr, currentPos, currentPos-1);
                currentPos--;

            }
        }
    }

    public static void mergeSort(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];
        mergeSortHelper(arr, 0 , n-1, temp);
    }

    public static void mergeSortHelper(int[] arr, int left, int right, int[] temp){
        if (left < right){
            int mid = (left + right)/2;
            mergeSortHelper(arr,left,mid,temp);
            mergeSortHelper(arr,mid + 1,right,temp);
            merge(arr,left,mid,right,temp);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        int i = left;
        int j = mid + 1;
        int k = left;

        while ( i <= mid && j <= right){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<= mid){
            temp[k] = arr[i];
            i++;
            k++;
        }

        while(j <= right){
            temp[k] = arr[j];
            j++;
            k++;
        }

        for(k = left; k <= right; k++){
            arr[k] = temp[k];
        }

    }




    public static void mergeSort(String[] arr){
        int n = arr.length;
        String[] temp = new String[n];
        mergeSortHelper(arr, 0 , n-1, temp);
    }

    public static void mergeSortHelper(String[] arr, int left, int right, String[] temp){
        if (left < right){
            int mid = (left + right)/2;
            mergeSortHelper(arr,left,mid,temp);
            mergeSortHelper(arr,mid + 1,right,temp);
            merge(arr,left,mid,right,temp);
        }
    }

    public static void merge(String[] arr, int left, int mid, int right, String[] temp) {
        int i = left;
        int j = mid + 1;
        int k = left;

        while ( i <= mid && j <= right){
            if(arr[i].compareTo(arr[j]) < 0){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<= mid){
            temp[k] = arr[i];
            i++;
            k++;
        }

        while(j <= right){
            temp[k] = arr[j];
            j++;
            k++;
        }

        for(k = left; k <= right; k++){
            arr[k] = temp[k];
        }

    }




    /* SortingUtil

     */

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    public static void swap(Comparable[] arr, int i, int j){
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static int intMedian(int[] arr){

        if(arr.length%2 == 1){
            return arr[arr.length/2 + 1];
        }
        return (arr[arr.length/2] + arr[arr.length/2 - 1])/2; //Do I need to return double?
    }



    public static int biSearch(String[] arr, String query){
        int minPos = 0;
        int maxPos = arr.length-1;

        while(maxPos>= minPos){
            int guess = (minPos + maxPos)/2;
            if(query.compareTo(arr[guess]) == 0){
                return guess;
            }
            else if(query.compareTo(arr[guess]) < 0){
                maxPos = guess - 1;
            }
            else{
                minPos = guess + 1;
            }
        }
        return -1;
    }

    public static int biSearch(Comparable[] arr, Comparable query){
        int minPos = 0;
        int maxPos = arr.length-1;

        while(maxPos>= minPos){
            int guess = (minPos + maxPos)/2;
            if(query.compareTo(arr[guess]) == 0){
                while(query.compareTo(arr[guess-1]) ==0){
                    guess--;
                }
                return guess;
            }
            else if(query.compareTo(arr[guess]) < 0){
                maxPos = guess - 1;
            }
            else{
                minPos = guess + 1;
            }
        }
        return -1;
    }
}

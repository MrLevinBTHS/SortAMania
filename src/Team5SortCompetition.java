public class Team5SortCompetition extends SortCompetition   {

    public int median(int[] arr){
        int len = arr.length;
        int median = arr[(int)(len/2)];
        if(len%2==0){
            median = arr[(len/2)-1]+arr[len/2];
            median = median/2;
        }
        return median;
    }

    public int challengeOne(int[] arr){
        return 4;
    }

    public int challengeTwo(String[] arr, String query){
        return 3;
    }

    public int challengeThree(int[] arr){
        return 2;
    }

    public int challengeFour(int[][] arr){
        return 1;
    }

    public int challengeFive(Comparable[] arr, Comparable query){
        return 0;
    }

    //Add a custom greeting so your sorter can introduce itself
    public String greeting(){
        return "";
    }

}

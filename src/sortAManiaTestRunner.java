public class sortAManiaTestRunner {


    public static int[] randIntArr(int count){
        int[] arr = new int[count];
        for(int i = 0; i<count;i++){
            arr[i] = (int)(Math.random() * 10001);
        }
        return arr;
    }

    public static String[] randomStringArr(int num, int length){
        String [] arr = new String [num];
        while (num>0){
            int i = 0;
            String s="";
            while (i<length){
                char c = (char)((Math.random()*26)+97);
                s= s+c;
                i++;
            }
            num --;
            arr[num]=s;
        }
        return arr;
    }

    public void printArr(){

    }

    public static void main(String[] args){
        SortCompetition team1 = new Team5SortCompetition();
        int[] randIntArr = randIntArr(10000);
        String[] randStringArr = randStringArr(10000, 5);

        System.out.println("Unsorted");
        printArr(randIntArr);

        long time = System.currentTimeMillis();
        int median = Team5SortCompetition.challengeOne(randIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken: "+time*0.001+" Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
        printArr(randIntArr);
    }
}

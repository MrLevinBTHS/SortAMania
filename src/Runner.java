public class Runner {
    public static void main(String[] args){
        SortCompetition team6 = new Team6SortCompetition();
        int[] randIntArr = SortingUtil.randomIntsArr(10000);

        String[] randSringArr = SortingUtil.randomStringArr(10000, 5);

        System.out.println("unsorted"); //challenge 1//
        SortingUtil.printArray(randIntArr);

        long time1 = System.currentTimeMillis();

        int median = team6.challengeOne(randIntArr);

        time1 = System.currentTimeMillis() - time1;
        System.out.println("Challenge One Time Taken: " + time1 * 0.001 + " Seconds");
        System.out.println("Median equals; " + median);

        System.out.println("Sorted");
        SortingUtil.printArray(randIntArr);
        System.out.println("\n");














        SortCompetition team6 = new Team6SortCompetition();
        int[] randIntArr = SortingUtil.randomIntsArr(10000);

        String[] randSringArr = SortingUtil.randomStringArr(10000, 5);

        System.out.println("unsorted"); //challenge 1//
        SortingUtil.printArray(randIntArr);

        long time1 = System.currentTimeMillis();

        int median = team6.challengeOne(randIntArr);

        time1 = System.currentTimeMillis() - time1;
        System.out.println("Challenge One Time Taken: " + time1 * 0.001 + " Seconds");
        System.out.println("Median equals; " + median);

        System.out.println("Sorted");
        SortingUtil.printArray(randIntArr);
        System.out.println("\n");














        randIntArr = SortingUtil.randomIntsArr(100); //challenge 3//
        System.out.println("unsorted");
        SortingUtil.printArray(randIntArr);

        long time3 = System.currentTimeMillis();

        median = team6.challengeThree(randIntArr);

        time3 = System.currentTimeMillis() - time3;
        System.out.println("Challenge Three Time Taken: " + time3 * 0.001 + " Seconds");
        System.out.println("Median equals; " + median);

        System.out.println("Sorted");
        SortingUtil.printArray(randIntArr);

    }
}

public class SortRunner {
    public static void main(String[] args) {
        SortCompetition sorter = new Team10SortCompetition();
        int[] randomInts = Team10SortCompetition.randIntArr(10000);

        //Challenge 1
        print("Challenge 1 Test");
        print("Unsorted List:");
        long time = System.nanoTime();
        print(Team10SortCompetition.print(randomInts));
        print("Median: " + sorter.challengeOne(randomInts));
        print(Team10SortCompetition.print(randomInts));
        print("Time taken: " + (System.nanoTime()-time));

        //Challenge 2
    }

    public static void print(Object o){
        System.out.println(o);
    }
}

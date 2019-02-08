public class SortRunner {
    public static void main(String[] args) {
        //Setup
        SortCompetition sorter = new Team10SortCompetition();
        int[] randomInts = Team10SortCompetition.randIntArr(10000);
        String[] randomStrings = Team10SortCompetition.randStringArr(5, 10000);
        randomStrings[69] = "abcde";
        int[] mostlySorted = new int[100000];
        for (int i = 0; i < 100000; i++){
            mostlySorted[i] = i;
            if(i>75000){
                mostlySorted[i] = (int)(Math.random()*10000);
            }
        }
        int[][] cancerArray = new int[1000][1000];
        for (int x = 0; x < cancerArray.length; x++){
            for (int y = 0; y < cancerArray[x].length; y++){
                cancerArray[x][y] = (int)(Math.random()*10001);
            }
        }
        Thing[] thingArray = new Thing[10000];
        for (int i =0; i < thingArray.length; i++){
            thingArray[i] = new Thing();
        }
        thingArray[6] = new Thing(5555);



        //Challenge 1
        print("Challenge 1 Test");
        print("Unsorted List:");
        long time = System.nanoTime();
        //print(Team10SortCompetition.print(randomInts));
        print("Median: " + sorter.challengeOne(randomInts));
        //print(Team10SortCompetition.print(randomInts));
        print("Time taken: " + (System.nanoTime()-time) + "\n\n\n");

        //Challenge 2
        print("Challenge 2 Test");
        print("Unsorted List:");
        long time2 = System.nanoTime();
        //print(Team10SortCompetition.print(randomStrings));
        print("Query found at: " + sorter.challengeTwo(randomStrings, "abcde"));
        //print(Team10SortCompetition.print(randomStrings));
        print("Time taken: " + (System.nanoTime()-time2) + "\n\n\n");

        //Challenge 3
        print("Challenge 3 Test");
        print("Unsorted List:");
        long time3 = System.nanoTime();
        //print(Team10SortCompetition.print(mostlySorted));
        print("Median: " + sorter.challengeThree(mostlySorted));
        //print(Team10SortCompetition.print(mostlySorted));
        print("Time taken: " + (System.nanoTime()-time3) + "\n\n\n");

        //Challenge 4
        print("Challenge 4 Test");
        print("Unsorted List:");
        long time4 = System.nanoTime();
        print("Median: " + sorter.challengeFour(cancerArray));
        print("Time taken: " + (System.nanoTime()-time4) + "\n\n\n");

        //Challenge 5
        print("Challenge 5 Test");
        print("Unsorted List:");
        long time5 = System.nanoTime();
        print("Query: " + sorter.challengeFive(thingArray, new Thing(5555)));
        print("Time taken: " + (System.nanoTime()-time5) + "\n\n\n");
    }

    public static void print(Object o){
        System.out.println(o);
    }
}

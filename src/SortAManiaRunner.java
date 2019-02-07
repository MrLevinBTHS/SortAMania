public class SortAManiaRunner {
    public static void main(String[] args) {
        Team0SortCompetition team0 = new Team0SortCompetition(); //create an instance of your class
        int[] randIntArr = Team0SortCompetition.randomIntsArr(10000); //initialize  a random int array
        String[] randStringArr = Team0SortCompetition.randomStringArr(10000, 5); //initialize a random string array
        int[] mostlySorted = Team0SortCompetition.mostlySorted();
        thejuice[] thejuices = Team0SortCompetition.randomJuiceArr(1000);

        System.out.println("Challenge One");
        System.out.println("Unsorted");
        Team0SortCompetition.printArr(randIntArr); //print out the unsorted array

        long time = System.currentTimeMillis(); //start the timer
        int median = team0.challengeOne(randIntArr); //run your challenge one code
        time = System.currentTimeMillis() - time; //stop the timer
        System.out.println("Sorted");
        Team0SortCompetition.printArr(randIntArr); //check if the array was sorted correctly

        System.out.println("Challenge One Time Taken: " + time * 0.001 + " Seconds"); //print the time
        System.out.println("Median equals: " + median); //print the median you found
        System.out.println();

        System.out.println("Challenge Two");
        System.out.println("Unsorted");
        Team0SortCompetition.printArr(randStringArr); //print out the unsorted array

        time = System.currentTimeMillis(); //start the timer
        System.out.println("Index: "+ team0.challengeTwo(randStringArr,"asdf")); //run your challenge two code
        time = System.currentTimeMillis() - time; //stop the timer
        System.out.println("Sorted");
        Team0SortCompetition.printArr(randStringArr); //check if the array was sorted correctly

        System.out.println("Challenge Two Time Taken: " + time * 0.001 + " Seconds"); //print the time
        System.out.println();

        System.out.println("Challenge Three");
        System.out.println("Unsorted");
        Team0SortCompetition.printArr(mostlySorted); //print out the unsorted array

        time = System.currentTimeMillis(); //start the timer
        System.out.println("Median: "+team0.challengeThree(mostlySorted)); //run your challenge two code
        time = System.currentTimeMillis() - time; //stop the timer
        System.out.println("Sorted");
        Team0SortCompetition.printArr(mostlySorted); //check if the array was sorted correctly

        System.out.println("Challenge Three Time Taken: " + time * 0.001 + " Seconds"); //print the time
        System.out.println();

        System.out.println("Challenge Five");
        System.out.println("Unsorted");
        Team0SortCompetition.printArr(thejuices); //print out the unsorted array

        time = System.currentTimeMillis(); //start the timer
        System.out.println(": "+team0.challengeThree(mostlySorted)); //run your challenge two code
        time = System.currentTimeMillis() - time; //stop the timer
        System.out.println("Sorted");
        Team0SortCompetition.printArr(thejuices); //check if the array was sorted correctly

        System.out.println("Challenge Three Time Taken: " + time * 0.001 + " Seconds"); //print the time
        System.out.println();

    }
}
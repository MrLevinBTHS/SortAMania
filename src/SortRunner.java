public class SortRunner {
    public static void main(String[] args) {
        SortCompetition sorter = new Team10SortCompetition();
        int[] randomInts = Team10SortCompetition.randIntArr(10000);
        print("Challenge 1 Test");
        print("Unsorted List:");
        print(Team10SortCompetition.print(randomInts));
        ((Team10SortCompetition) sorter).quickSort(randomInts, 0, randomInts.length-1);
        print(Team10SortCompetition.print(randomInts));
    }

    public static void print(Object o){
        System.out.println(o);
    }
}

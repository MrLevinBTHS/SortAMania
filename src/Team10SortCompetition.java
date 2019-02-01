public class Team10SortCompetition extends SortCompetition {
    @Override
    public int challengeOne(int[] arr) {
        return 0;
    }

    @Override
    public int challengeTwo(String[] arr, String query) {
        return 0;
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
        return "THIS IS TEAM 10 BITCH, WHO THE HELLA FREAKIN YOU?";
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
}

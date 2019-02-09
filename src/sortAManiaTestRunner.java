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

    public static void printArr(int[] arr){
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }

    public static void printArr(String[] arr){
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }

    public static void printArr(int[][] arr){
        for (int i = 0;i<arr.length;i++){
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println("  ");
        }
    }

    public static void main(String[] args){
        SortCompetition team5 = new Team5SortCompetition();
        /**
        // Challenge #1
        System.out.println("Challenge #1");
        int[] randIntArr1 = randIntArr(10000);

        System.out.println("Unsorted");
        printArr(randIntArr1);

        long time1 = System.currentTimeMillis();
        int median1 = team5.challengeOne(randIntArr1);
        time1 = System.currentTimeMillis() - time1;
        System.out.println();
        System.out.println("Challenge One Time Taken: "+time1*0.001+" Seconds");
        System.out.println("Median equals: " + median1);

        System.out.println("Sorted");
        printArr(randIntArr1);
        System.out.println();


        //Challenge #2
        System.out.println("Challenge #2");
        String[] randStringArr = randomStringArr(10000, 5);

        System.out.println("Unsorted");
        printArr(randStringArr);

        long time2 = System.currentTimeMillis();
        int pos = team5.challengeTwo(randStringArr, "aabxi");
        time2 = System.currentTimeMillis() - time2;
        System.out.println();
        System.out.println(pos);
        System.out.println("Challenge One Time Taken: "+time2*0.001+" Seconds");

        System.out.println("Sorted");
        printArr(randStringArr);


        // Challenge #3
        System.out.println();
        System.out.println("Challenge #3");
        int[] randIntArr2 = randIntArr(10000);

        System.out.println("Unsorted");
        printArr(randIntArr2);

        long time3 = System.currentTimeMillis();
        int median2 = team5.challengeThree(randIntArr2);
        time3 = System.currentTimeMillis() - time3;
        System.out.println();
        System.out.println("Challenge One Time Taken: "+time3*0.001+" Seconds");
        System.out.println("Median equals: " + median2);

        System.out.println("Sorted");
        printArr(randIntArr2);
        System.out.println();


        // Challenge #4
        System.out.println();
        System.out.println("Challenge #4");
        int[][] randIntArr3 = new int[10][10];
        for(int i = 0; i<randIntArr3.length;i++){
            randIntArr3[i] = randIntArr(10);
        }

        System.out.println("Unsorted");
        printArr(randIntArr3);

        long time4 = System.currentTimeMillis();
        int median3 = team5.challengeFour(randIntArr3);
        time4 = System.currentTimeMillis() - time4;
        System.out.println();
        System.out.println("Challenge Four Time Taken: "+time4*0.001+" Seconds");
        System.out.println("Median equals: " + median3);

        System.out.println("Sorted");
        printArr(randIntArr3);
        System.out.println();
         */

        // Challenge #5

        /**
        System.out.println("Challenge #5");
        int[] randIntArr1 = randIntArr(10000);

        System.out.println("Unsorted");
        printArr(randIntArr1);

        long time1 = System.currentTimeMillis();
        int median1 = team5.challengeOne(randIntArr1);
        time1 = System.currentTimeMillis() - time1;
        System.out.println();
        System.out.println("Challenge One Time Taken: "+time1*0.001+" Seconds");
        System.out.println("Median equals: " + median1);

        System.out.println("Sorted");
        printArr(randIntArr1);
        System.out.println();
        */






        String word = "query";
        Comparable[] array5 = randomStringArr(10,5);
        array5[7]=word;
        printArr(array5);

        System.out.println(team5.challengeFive(array5,word));
        printArr(array5);

    }
    public static void printArr(Comparable[] arr){
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i].toString()+"  ");
        }
        System.out.println("");
    }
}

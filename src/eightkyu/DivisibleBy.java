package eightkyu;

import java.util.ArrayList;
import java.util.Arrays;

public class DivisibleBy {
    public static void main(String[] args) {
        int[] printme = divisibleBy(new int[]{1,2,3,4,5,6,7,8,9}, 3);
       /* for (int item : printme){
            System.out.println(item);
        }*/

    }

    public static int[] divisibleBy(int[] numbers, int divider) {
        int[] noRemainderIntArray = new int[5];
        int lastIndex = 0;

        for (int x = 0; x < numbers.length; x++) {
            if (numbers[x] % divider == 0) {
                System.out.println(numbers[x]);
                noRemainderIntArray[lastIndex] = numbers[x];
                lastIndex++;
            }
        }

        int[] array = Arrays.copyOf(noRemainderIntArray, lastIndex);
        return array;
       /* return noRemainderIntArray;*/
    }
}



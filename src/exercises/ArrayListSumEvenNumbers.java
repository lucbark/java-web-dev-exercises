package exercises;

import java.util.ArrayList;

public class ArrayListSumEvenNumbers {
    public static int sumEvenNumbers(ArrayList<Integer> arrayList) {
        int total = 0;

            for (Integer i : arrayList) {
                if (i % 2 == 0) {
                    total += i;
                }
        }
        return total;
    }
}

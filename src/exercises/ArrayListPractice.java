package exercises;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(10);

        System.out.println(arrayList);
        System.out.println(ArrayListSumEvenNumbers.sumEvenNumbers(arrayList));

        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("five");
        wordList.add("four");
        wordList.add("three");
        wordList.add("seven");

        System.out.println(wordList[0]);




    }
}

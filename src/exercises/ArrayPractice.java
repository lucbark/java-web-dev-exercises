package exercises;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] numberArray = {1, 1, 2, 3, 5, 8}; //create and initialize an array
        for (int i : numberArray) {
            //int isOdd = i%2;
            if (i % 2 == 1)
                System.out.println(i); // loop through array and print odd values
        }

        String passage = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
//        for (String spaces : passage.split(" ")) {
//        System.out.println(spaces); // store each word in the above string in a new array
//        }
        for (String periods : passage.split("\\.")) {
            System.out.println(periods); //store each sentence in a new array
        }

    }
}

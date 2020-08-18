package exercises;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        int length;
        int width;
        int area;

        Scanner input = new Scanner(System.in);
        System.out.println("What's the length of the rectangle:");
        length = input.nextInt();
        System.out.println("What's the width of the rectangle?:");
        width = input.nextInt();
        input.close();


        area = length * width;

        System.out.println("The area of the rectangle is " + area);

    }

}

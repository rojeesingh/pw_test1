import java.util.Scanner;

public class AverageNum {
    public static void main(String[] args) {

        int sum = 0;
        int x = 21;
        // Do-while loop
        do {
            sum += x;
            x--;
        }
        while (x > 1);
        double average = (double) sum / x;

        // Display the average
        System.out.println("Average: " + average);
    }
}

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      //enter the number
        int n = scanner.nextInt();
         int a1 = 0;
        int a2 = 1;
        System.out.print(a1 + " " + a2);
      for (int i = 2; i <= limit; i++) {
            int a3 = a1 + a2;
            System.out.print(" " + a3);
            a1 = a2;
            a2= a3;
      }
        scanner.close();
    }
}
}

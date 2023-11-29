package comparator;

import java.util.Scanner;

public class Comparator {
    private final Scanner stream;

    public Comparator() {
        stream = new Scanner(System.in);
    }

    private static int compare(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else if (num1 == num2) {
            return 0;
        }
        return num2;
    }

    public void entryPoint() {
        int num1 = this.stream.nextInt();
        int num2 = this.stream.nextInt();

        int result = Comparator.compare(num1, num2);
        if (result == 0) {
            System.out.println("The numbers are equal");
        } else {
            System.out.println(result);
        }
    }
}

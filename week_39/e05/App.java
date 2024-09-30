package Programming_1.Excercise.week_39.e05;

import java.util.Scanner;

public class App {
    public static void main(final String[] args) {
        Scanner objScanner = new Scanner(System.in);
        double scoreInput = 0;
        double total = 0;
        int count = 0;

        while (true) {
            System.out.println("Give a test score (-1 to quit): ");
            scoreInput = objScanner.nextDouble();

            if (scoreInput == -1) {
                break;
            }

            total += scoreInput;
            count++;
            double average = total / count;
            System.out.println("Average: " + average);
        }
        System.out.println("Summary");
        System.out.println("-------");
        System.out.println("Tests: " + count);
        if (count > 0) {
            System.out.println("Average: " + (total / count));
        } else {
            System.out.println("Average: N/A");
        }
        objScanner.close();
    }
}
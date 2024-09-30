package Programming_1.Excercise.week_39.e03;

public class App {
    public static void main(final String[] args) {
        int countDown = 6; // How any rows do we want?

        for (int i = 0; i < countDown; i++) {
            // Print the blank spaces
            for (int j = 0; j < countDown - i; j++) {
                System.out.print(" ");
            }

            // Print the * icon
            for (int k = 0; k < (i + 1); k++) {
                System.out.print(i+ 1);
            }

            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
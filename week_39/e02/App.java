package Programming_1.Excercise.week_39.e02;

public class App {
    public static void main(final String[] args) {
        int rows = 4; // How any rows do we want?

        for (int i = 0; i < rows; i++) {
            // Print the blank spaces
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            // Print the * icon
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }

            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
package Excercise.week_37.e05;

class App {
    public static void main(String[] args) {
        // Define the range of numbers to check
        int[] numbers = { -1, 0, 1, 9, 10 };

        // Print the table header
        System.out.printf("%-10s %-30s %-10s%n", "Number", "Condition", "Result");

        // Iterate through each number and check the conditions
        for (int number : numbers) {
            // Check each condition for the current number
            System.out.printf("%-10d %-30s %-10b%n", number, "number > 0", (number > 0));
            System.out.printf("%-10d %-30s %-10b%n", number, "number == 0", (number == 0));
            System.out.printf("%-10d %-30s %-10b%n", number, "number < 10", (number < 10));
            System.out.printf("%-10d %-30s %-10b%n", number, "number > 0 && number < 10",
                                                                     (number > 0 && number < 10));
            System.out.printf("%-10d %-30s %-10b%n", number, "!(number > 0 && number < 10)",
                    !(number > 0 && number < 10));
        }
    }
}
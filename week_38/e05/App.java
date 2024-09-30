import java.util.Scanner;

public class App {
    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the day");

        String input = scanner.nextLine().toUpperCase(); // Convert input to uppercase to match enum

        try {
            Day day = Day.valueOf(input);

            switch (day) {
                case MONDAY:
                    System.out.println("Start of the work week!");
                    break;
                case TUESDAY:
                    System.out.println("Second day of the work week.");
                    break;
                case WEDNESDAY:
                    System.out.println("Midweek day.");
                    break;
                case THURSDAY:
                    System.out.println("Almost the weekend!");
                    break;
                case FRIDAY:
                    System.out.println("Last workday of the week!");
                    break;
                case SATURDAY:
                case SUNDAY:
                    System.out.println("Enjoy the weekend!");
                    break;
            }
        } catch (Exception exception) {
            System.out.println("Something went wrong.");
        }
    }
}
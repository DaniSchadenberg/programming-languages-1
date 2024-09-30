import java.util.Scanner; // Import the Scanner class

public class App {
    public static void main(String[] args) {
        Scanner  myObj = new Scanner(System.in);
        System.out.println("Enter a number that equeals the day day of the week");

        String myWeekDay = myObj.nextLine();
        try{
            int result = Integer.parseInt(myWeekDay);
            String dayName;

            switch (result) {
                case 1:
                    dayName = "Monday";
                    break;
                case 2:
                    dayName = "Tuesday";
                    break;
                case 3:
                    dayName = "Wednesday";
                    break;
                case 4:
                    dayName = "Thursday";
                    break;
                case 5:
                    dayName = "Friday";
                    break;
                case 6:
                    dayName = "Saturday";
                    break;
                case 7:
                    dayName = "Sunday";
                    break;
                default:
                    dayName = "Invalid input! Please enter a number between 1 and 7.";
                    break;
            }

            System.out.println("Day of the week: " + dayName);
        }catch(Exception exception){
            System.out.println("Something went wrong.");
        }
    }
}

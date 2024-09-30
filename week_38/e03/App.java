import java.util.Scanner; // Import the Scanner class

public class App {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter age:");

        String myAge = myObj.nextLine(); // read the user input for age
        System.out.println("Your age is: " + myAge);

        System.out.println("What day of the week is it?"); // read the user input for day of the week
        String getWeekDay = myObj.nextLine().toLowerCase();
        try {
            int result = Integer.parseInt(myAge); // try to cast the input age to int.
            if (getWeekDay.equals("saturday") || getWeekDay.equals("sunday")){
                System.out.println("It is weekend so we can't give discounts.");
                if(result < 18 || result > 65){
                    System.out.println("But because of your age we can give you some.");
                }
            }
            else
            {
                System.out.println("It's a normal weekday so we might have some discounts.");
                if(result < 18 || result > 65){
                    System.out.println("Because of your age we can give you a discount.");
                }else{
                    System.err.println("Unfortunately we don't have any discounts for you.");
                }
            }
        } catch (Exception exception) {
            System.out.println("Something went wrong.");
        }
        myObj.close(); // Close scanner
    }
}

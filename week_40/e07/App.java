package e07;

import java.util.Scanner; // Import the Scanner class

public class App {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // This is the scanner object
        boolean isValid = false;

        while (!isValid) {
            System.out.println("Enter a password:");
            String password = myObj.nextLine(); // Read the user input

            try {
                if (isValidPassword(password)) {
                    System.out.println("Password is valid.");
                    isValid = true;
                } else {
                    //remind the user about the rules
                    //no special characters are needed.
                    System.out.println("Invalid password. Please ensure it meets the following criteria:");
                    System.out.println("- At least 8 characters long");
                    System.out.println("- Contains at least one uppercase letter (A-Z)");
                    System.out.println("- Contains at least one lowercase letter (a-z)");
                    System.out.println("- Contains at least one digit (0-9)");
                }
            } catch (Exception exception) {
                System.out.println("Something went wrong.");
            }
        }

        myObj.close(); // Close scanner
    }


    //Function to check if the password meets the requirements
    public static boolean isValidPassword(String password) {
        //Password must be at least minim of 8 characters long.
        if (password.length() < 8) {
            return false;
        }

        //Other requirements
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;

        //loop through all the characters to find if it has the requirements
        //and mark them as pressent.
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            }

            // If all conditions are met return true
            if (hasUpperCase && hasLowerCase && hasDigit) {
                return true;
            }
        }

        return false; // Return false if any condition is not met
    }
}
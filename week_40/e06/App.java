package e06;

import java.util.Scanner; // Import the Scanner class

public class App {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); //This is the scanner obj
        System.out.println("Palindrome test, please enter some text:");
        String myName = myObj.nextLine(); //read the user input
        try{
            // Clean the input by removing spaces and characters and converting to lowercase
            String cleanedInput = myName.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

            // Reverse the cleaned string
            String reversedInput = new StringBuilder(cleanedInput).reverse().toString();

            // Check if the cleaned string is equal to the reversed string
            if (cleanedInput.equals(reversedInput)) {
                System.out.println(myName + " is a palindrome.");
            } else {
                System.out.println(myName + " is not a palindrome.");
            }
        }
        catch(Exception exception){
            System.out.println("Something went wrong.");
        }
    }
}

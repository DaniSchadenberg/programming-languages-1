package week_40.e02;

import java.util.Scanner; // Import the Scanner class

public class App {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); //This is the scanner obj
        System.out.println("What is your name?");

        String myName = myObj.nextLine(); //read the user input
        System.out.println("Your entered: " + myName);
        try{
        for (int i = 0; i < myName.length(); i++) {
            System.out.println(myName.charAt(myName.length()- 1 -i));
        }
        }
        catch(Exception exception){
            System.out.println("Something went wrong.");
        }
        myObj.close(); // Close scanner
    }
}

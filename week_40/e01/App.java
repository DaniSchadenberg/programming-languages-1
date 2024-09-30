package week_40.e01;

import java.util.Scanner; // Import the Scanner class

public class App {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); //This is the scanner obj
        System.out.println("What is your name?");

        String myName = myObj.nextLine(); //read the user input
        System.out.println("Your name is: " + myName);
        try{
        if(myName.equals("Louis")) {
            System.out.println("Are you French?");
        }else{
            System.out.println("You have a great name!");
        }
        }
        catch(Exception exception){
            System.out.println("Something went wrong.");
        }
        myObj.close(); // Close scanner
    }
}

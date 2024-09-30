package e05;

import java.util.Scanner; // Import the Scanner class

public class App {
    public static void main(String[] args) {
        String names = new String();
        while (true) {
            Scanner myObj = new Scanner(System.in); //This is the scanner obj
            System.out.println("What is your name?");
            String myName = myObj.nextLine(); //read the user input
            System.out.println("Your entered: " + myName);
            names += myName;
            try{
            if (myName.equals("Quit")) {
                myObj.close(); // Close scanner
                break;
            }else{
                System.out.println(names);
            }
            }
            catch(Exception exception){
                System.out.println("Something went wrong.");
            }
        }
    }
}

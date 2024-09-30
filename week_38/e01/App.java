package Programming_1.Excercise.week_38.e01;

import java.util.Scanner; // Import the Scanner class

public class App {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); //This is the scanner obj
        System.out.println("Enter age:");

        String myAge = myObj.nextLine(); //read the user input
        System.out.println("Your age is: " + myAge);
        try{
        int result = Integer.parseInt(myAge); //try to cast the input age to int.
        if(result < 18) {  //check if lower that 18
            System.out.println("You are not allowed to vote.");
        }else{
            System.out.println("You are allowed to vote!");
        }
        }
        catch(Exception exception){
            System.out.println("Something went wrong.");
        }
        myObj.close(); // Close scanner
    }
}

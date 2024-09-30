package Programming_1.Excercise.week_39.e04;

import java.util.Scanner;

public class App {
    public static void main(final String[] args) {
        Scanner objScanner = new Scanner(System.in);
        int parsedInput = 1;
        while(parsedInput != 0){
            System.out.println("Enter a number to check if it's even or uneven.");
            System.out.println("Press 0 to exit the program.");

            String input = objScanner.nextLine();
            try{
                parsedInput = Integer.parseInt(input);

                oddOrEven(parsedInput);

            } catch (Exception exception) {
                System.out.println("Something went wrong.");
            }
        }
        objScanner.close();
    }

     static void oddOrEven(int x){
        if(x % 2 == 1)
        {
            System.out.println("Odd number");
        }else{
            System.out.println("Even number");
        }
    }
}
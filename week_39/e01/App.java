package Programming_1.Excercise.week_39.e01;

import java.util.Scanner;

public class App {
    public static void main(final String[] args) {
        Scanner objScanner = new Scanner(System.in);
        System.out.println("What multiplication table would you like to see?");

        String input = objScanner.nextLine();
        try{
            int parsedInput = Integer.parseInt(input);

            showMulitplicationTable(parsedInput);

        } catch (Exception exception) {
            System.out.println("Something went wrong.");
        }
        objScanner.close();
    }

     static void showMulitplicationTable(int x){
        for (int i = 0; i < 11; i++) {
            System.out.println(i + " x " + x + " = " + i*x);
        }
    }
}
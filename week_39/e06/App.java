package Programming_1.Excercise.week_39.e06;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(final String[] args) {
    Scanner objScanner = new Scanner(System.in);
    Random rand = new Random();
    int tries = 1;
    int rand_int = rand.nextInt(20);
    System.out.println("Welcome to the higher or lower game.");
    System.out.println("Try to guess the number I have in mind with the lowest amount of tries.");

        while (true) {
            System.out.print("Guess a number: ");
            int Input = objScanner.nextInt();

            if (Input == rand_int) {
                System.out.println("SUCCESS!");
                System.out.println("You only had to guess " + tries + " times.");
                if (tries > 4) {
                    System.out.println("Better luck next time.");
                }else{
                    System.out.println("You did a good guessing job!");
                }
                if (tries == 1) {
                    System.out.println("AMAZING!!! you got it in one try!!!");
                }
                break;
            }

            if(Input > rand_int){
                System.out.println("Your guess was too high.");
                tries++;
            }else{
                System.out.println("Your guess was too low.");
                tries++;
            }
        }
        objScanner.close();
    }
}
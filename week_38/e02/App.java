import java.util.Scanner; // Import the Scanner class

public class App {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create scanner Obj
        System.out.println("Enter your score:");

        String myScore = myObj.nextLine(); //get the first line of input
        System.out.println("The submitted score was: " + myScore);
        try{
            int result = Integer.parseInt(myScore);
            if(result >= 90)
            {
                System.out.println("You scored EXELENT!");
            }
            else if(result <= 89 && result >= 70)
            {
                System.out.println("Your score is GOOD");
            }
            else if(result <= 69 && result >= 50)
            {
                System.out.println("Your score Needs Improvement");
            }
            else
            {
                System.out.println("You FAILED");
            }
        } catch(Exception exception)
        {
            System.out.println("Something went wrong.");
        }
    }
}

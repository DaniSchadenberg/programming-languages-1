import java.util.Arrays;
import java.util.Random;

class Code {
    public static void main(String[] args) {
        System.out.println("***************");
        System.out.println("* Java Rocks! *"); //printing the text "Hello World! nvm."
        System.out.println("***************");

        //Programming 3
        MyClass myObject = new MyClass();
        int[] random_numbers = gen_random_array(50);
        myObject.setValue(5);
        System.err.println(myObject.toString());
        System.err.println(find_largest_element(random_numbers));
    }

    //generates an array with random numbers
    static int[] gen_random_array(int length){
        //int[] predefined_array = {5,20,45,1,2,4,91,50,43,76,88,22,10};
        int[] new_number_array = new int[length];
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            new_number_array[i] = rand.nextInt(500);
        }
        return new_number_array;
    }

    //function that will take an array and return the highest value.
    static int find_largest_element(int[] number_array){
        System.err.println("The array I got was: " + 
                            Arrays.toString(number_array));
        int highest_number = number_array[0];
        //basic for loop that loops through all the values
        for (int i = 0; i < number_array.length; i++) {
            if(highest_number < number_array[i]){
                highest_number = number_array[i];
            }
        }
        return highest_number;
    }
}
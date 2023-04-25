import com.bridgelabz.MaxNumber;

public class Main {
    /*
    main method started
     */
    public static void main(String[] args) {
        // Test cases
        // Test case 1: max word is at 1st position
            System.out.println("Test case 1: max number is at 1st position");
            System.out.println(new MaxNumber<String>().findMax("c","a","b")); // expected output: c

            // Test case 2: max word is at 2nd position
            System.out.println("Test case 2: max number is at 2nd position");
            System.out.println(new MaxNumber<String>().findMax("atul","prafull","akku")); // expected output: prafull

            // Test case 3: max word is at 3rd position
            System.out.println("Test case 3: max number is at 3rd position");
            System.out.println(new MaxNumber<String>().findMax("apple","banana","mango")); // expected output: mango
        }
    }

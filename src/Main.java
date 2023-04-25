import com.bridgelabz.MaxNumber;

public class Main {
    public static void main(String[] args) {
        // Test cases
        // Test case 1: max number is at 1st position
            System.out.println("Test case 1: max number is at 1st position");
            System.out.println(new MaxNumber<Integer>().findMax(70, 50, 77)); // expected output: 77

            // Test case 2: max number is at 2nd position
            System.out.println("Test case 2: max number is at 2nd position");
            System.out.println(new MaxNumber<Integer>().findMax(111, 125, 95)); // expected output: 25

            // Test case 3: max number is at 3rd position
            System.out.println("Test case 3: max number is at 3rd position");
            System.out.println(new MaxNumber<Integer>().findMax(445, 225, 555)); // expected output: 555
        }
    }

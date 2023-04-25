import com.bridgelabz.MaxNumber;

public class Main {
    /*
    main method started
     */
    public static void main(String[] args) {
        // Test cases
        // Test case 1: max number is at 1st position
            System.out.println("Test case 1: max number is at 1st position");
            System.out.println(new MaxNumber<Float>().findMax(70.3f, 65.7f, 71.2f)); // expected output: 77

            // Test case 2: max number is at 2nd position
            System.out.println("Test case 2: max number is at 2nd position");
            System.out.println(new MaxNumber<Float>().findMax(11.7f, 12.9f, 9.3f)); // expected output: 25

            // Test case 3: max number is at 3rd position
            System.out.println("Test case 3: max number is at 3rd position");
            System.out.println(new MaxNumber<Float>().findMax(77.3f, 35.4f, 87.3f)); // expected output: 555
        }
    }

import com.bridgelabz.MaxNumber;

public class Main {
    /*
    main method started
     */
    public static void main(String[] args) {
        // Test cases
        // for integer
        MaxNumber<Integer> integerFinder = new MaxNumber<>();
        System.out.println(integerFinder.findMax(75, 59, 31)); // Output: 75;

        // for float
        MaxNumber<Float> floatFinder = new MaxNumber<>();
        System.out.println(floatFinder.findMax(4.1f, 1.9f, 4.6f)); // Output: 4.6

        MaxNumber<String> stringFinder = new MaxNumber<>();
        System.out.println(stringFinder.findMax("apple", "banana", "pear")); // Output: pear

    }
}

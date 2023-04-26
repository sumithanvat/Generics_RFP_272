import com.bridgelabz.MaxNumber;
import com.bridgelabz.MaximumFinder;

public class Main {
    /*
    main method started
     */
    public static void main(String[] args) {

        // Integer Test Cases
        MaximumFinder<Integer> intMaxFinder1 = new MaximumFinder<>(7, 3, 5);
        System.out.println("Max Integer: " + intMaxFinder1.testMaximum());

        MaximumFinder<Integer> intMaxFinder2 = new MaximumFinder<>(10, 15, 8);
        System.out.println("Max Integer: " + intMaxFinder2.testMaximum());

        MaximumFinder<Integer> intMaxFinder3 = new MaximumFinder<>(20, 18, 25);
        System.out.println("Max Integer: " + intMaxFinder3.testMaximum());

        // Float Test Cases
        MaximumFinder<Float> floatMaxFinder1 = new MaximumFinder<>(3.5f, 7.2f, 5.1f);
        System.out.println("Max Float: " + floatMaxFinder1.testMaximum());

        MaximumFinder<Float> floatMaxFinder2 = new MaximumFinder<>(10.5f, 15.3f, 8.7f);
        System.out.println("Max Float: " + floatMaxFinder2.testMaximum());

        MaximumFinder<Float> floatMaxFinder3 = new MaximumFinder<>(20.1f, 18.6f, 25.9f);
        System.out.println("Max Float: " + floatMaxFinder3.testMaximum());

        // String Test Cases
        MaximumFinder<String> strMaxFinder1 = new MaximumFinder<>("apple", "peach", "banana");
        System.out.println("Max String: " + strMaxFinder1.testMaximum());

        MaximumFinder<String> strMaxFinder2 = new MaximumFinder<>("dog", "cat", "fish");
        System.out.println("Max String: " + strMaxFinder2.testMaximum());

        MaximumFinder<String> strMaxFinder3 = new MaximumFinder<>("orange", "lemon", "grape");
        System.out.println("Max String: " + strMaxFinder3.testMaximum());
    }
}
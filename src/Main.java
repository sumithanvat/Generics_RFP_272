
import com.bridgelabz.MaximumFinder;


public class Main {
    /*
    main method started
     */
    public static void main(String[] args) {

        Integer[] a = {20, 52, 83};
        Double[] b = {5.6, 32.6, 99.9};
        String[] c = {"apple", "banana", "orange"};

        MaximumFinder.max(a); // Output: Maximum element: 3
        MaximumFinder.max(b); // Output: Maximum element: 3.3
        MaximumFinder.max(c); // Output: Maximum element: orange
    }
}

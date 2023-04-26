
import com.bridgelabz.MaximumFinder;


public class Main {
    /*
    main method started
     */
    public static void main(String[] args) {

        int a = 1, b = 2, c = 3,d = 4;
        System.out.println(MaximumFinder.max(a, b, c, d)); // Output: 4

        double v = 0.7,x = 1.1, y = 2.2, z = 3.3;
        System.out.println(MaximumFinder.max(v,x, y, z)); // Output: 3.3

        String s1 = "apple", s2 = "banana", s3 = "orange", s4 = "papaya";
        System.out.println(MaximumFinder.max(s1, s2, s3,s4)); // Output: papaya
    }
}
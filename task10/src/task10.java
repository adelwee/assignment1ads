public class task10 {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a; // Base case: GCD(a, 0) = a
        } else {
            return gcd(b, a % b); // Recursive call: GCD(a, b) = GCD(b, a % b)
        }
    }

    public static void main(String[] args) {
        // Test cases
        int a1 = 32;
        int b1 = 48;
        System.out.println("GCD(" + a1 + ", " + b1 + ") = " + gcd(a1, b1));

        int a2 = 10;
        int b2 = 7;
        System.out.println("GCD(" + a2 + ", " + b2 + ") = " + gcd(a2, b2));

        // Measure execution time of gcd function
        double startTime = System.nanoTime();
        gcd(a1, b1); // Call gcd function with test case values
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000; // Convert to milliseconds
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}


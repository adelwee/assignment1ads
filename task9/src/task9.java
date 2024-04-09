public class task9 {
    public static int calculate(int n, int k) {
        if (k == 0 || k == n) {
            return 1; // Base case: C(n, 0) = C(n, n) = 1
        } else {
            return calculate(n - 1, k - 1) + calculate(n - 1, k);
        }
    }

    public static void main(String[] args) {
        // Test cases
        int n1 = 2;
        int k1 = 1;
        System.out.println("C(" + n1 + ", " + k1 + ") = " + calculate(n1, k1));

        int n2 = 7;
        int k2 = 3;
        System.out.println("C(" + n2 + ", " + k2 + ") = " + calculate(n2, k2));

        // Measure execution time of calculate function
        double startTime = System.nanoTime();
        calculate(n1, k1); // Call calculate function with test case values
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000; // Convert to milliseconds
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}


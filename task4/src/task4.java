public class task4 {
    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Base case: 0! = 1
        } else {
            return n * factorial(n - 1); // Recursive call: n! = n * (n-1)!
        }
    }

    public static void main(String[] args) {
        int n = 5;

        // Measure execution time of factorial function
        double startTime = System.nanoTime();
        int result = factorial(n); // Call factorial function with test case value
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000; // Convert to milliseconds

        // Print the result and the time taken
        System.out.println(n + "! = " + result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}



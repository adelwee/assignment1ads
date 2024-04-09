public class task5 {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base case: F0 = 0, F1 = 1
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Recursive call: Fn = Fn-1 + Fn-2
        }
    }

    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 17;

        // Measure execution time of fibonacci function for n1
        double startTime1 = System.nanoTime();
        int result1 = fibonacci(n1); // Call fibonacci function with n1
        double endTime1 = System.nanoTime();
        double duration1 = (endTime1 - startTime1) / 1000000; // Convert to milliseconds

        // Print the result and the time taken for n1
        System.out.println("Fibonacci(" + n1 + ") = " + result1);
        System.out.println("Time taken for n1: " + duration1 + " milliseconds");

        // Measure execution time of fibonacci function for n2
        double startTime2 = System.nanoTime();
        int result2 = fibonacci(n2); // Call fibonacci function with n2
        double endTime2 = System.nanoTime();
        double duration2 = (endTime2 - startTime2) / 1000000; // Convert to milliseconds

        // Print the result and the time taken for n2
        System.out.println("Fibonacci(" + n2 + ") = " + result2);
        System.out.println("Time taken for n2: " + duration2 + " milliseconds");
    }
}


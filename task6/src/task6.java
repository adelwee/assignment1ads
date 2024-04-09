public class task6 {
    public static double calculatePower(double a, int n) {
        return Math.pow(a, n);
    }

    public static void main(String[] args) {
        double a = 2;
        int n = 10;

        // Measure execution time of calculatePower function
        double startTime = System.nanoTime();
        double result = calculatePower(a, n); // Call calculatePower function with test case values
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000; // Convert to milliseconds

        // Print the result and the time taken
        System.out.println(a + " raised to the power of " + n + " is: " + result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}

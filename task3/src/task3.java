public class task3 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        // Check for divisibility by numbers from 2 to sqrt(n)
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // Not a prime number
            }
        }

        return true; // Prime number
    }

    public static void main(String[] args) {
        int number1 = 7;
        int number2 = 10;

        // Measure execution time of isPrime function for number1
        double startTime1 = System.nanoTime();
        boolean result1 = isPrime(number1); // Call isPrime function with number1
        double endTime1 = System.nanoTime();
        double duration1 = (endTime1 - startTime1) / 1000000; // Convert to milliseconds

        // Print the result and the time taken for number1
        System.out.println(number1 + " " + (result1 ? "Prime" : "Composite"));
        System.out.println("Time taken for number1: " + duration1 + " milliseconds");

        // Measure execution time of isPrime function for number2
        double startTime2 = System.nanoTime();
        boolean result2 = isPrime(number2); // Call isPrime function with number2
        double endTime2 = System.nanoTime();
        double duration2 = (endTime2 - startTime2) / 1000000; // Convert to milliseconds

        // Print the result and the time taken for number2
        System.out.println(number2 + " " + (result2 ? "Prime" : "Composite"));
        System.out.println("Time taken for number2: " + duration2 + " milliseconds");
    }
}


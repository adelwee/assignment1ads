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

        System.out.println(number1 + " " + (isPrime(number1) ? "Prime" : "Composite"));
        System.out.println(number2 + " " + (isPrime(number2) ? "Prime" : "Composite"));
    }
}


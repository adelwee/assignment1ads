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
        int result = factorial(n);
        System.out.println(n + "! = " + result);
    }
}


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

        System.out.println("Fibonacci(" + n1 + ") = " + fibonacci(n1));
        System.out.println("Fibonacci(" + n2 + ") = " + fibonacci(n2));
    }
}

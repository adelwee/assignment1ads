public class task6 {
    public static double calculatePower(double a, int n) {
        return Math.pow(a, n);
    }

    public static void main(String[] args) {
        double a = 2;
        int n = 10;

        double result = calculatePower(a, n);
        System.out.println(a + " raised to the power of " + n + " is: " + result);
    }
}

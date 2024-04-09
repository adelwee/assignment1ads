public class task8 {
    public static boolean isAllDigits(String s) {
        // Check if the string is null or empty
        if (s == null || s.isEmpty()) {
            return false;
        }

        // Iterate through each character of the string
        for (char c : s.toCharArray()) {
            // Check if the character is not a digit
            if (!Character.isDigit(c)) {
                return false; // If any character is not a digit, return false
            }
        }

        return true; // All characters are digits
    }

    public static void main(String[] args) {
        String s1 = "123456";
        String s2 = "123a12";

        System.out.println(s1 + " " + (isAllDigits(s1) ? "Yes" : "No"));
        System.out.println(s2 + " " + (isAllDigits(s2) ? "Yes" : "No"));

        // Measure execution time of isAllDigits function
        double startTime = System.nanoTime();
        isAllDigits(s1); // Call isAllDigits function with test case value
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000; // Convert to milliseconds
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}

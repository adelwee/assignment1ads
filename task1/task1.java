public class task1 {
    public static int findMinimum(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }

        int min = array[0]; // Assume the first element is the minimum

        // Iterate through the array to find the actual minimum
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] numbers = {9, 5, 7, 3, 11, 2};

        // Measure execution time of findMinimum function
        double startTime = System.nanoTime();
        int min = findMinimum(numbers); // Call findMinimum function with test case array
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000; // Convert to milliseconds

        // Print the result and the time taken
        System.out.println("The minimum element is: " + min);
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}



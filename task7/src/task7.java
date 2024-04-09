public class task7 {
    public static void reverse(int[] array, int start, int end) {
        if (start >= end) {
            return; // Base case: array is reversed
        }

        // Swap elements at start and end indices
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;

        // Recur for the rest of the array
        reverse(array, start + 1, end - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 2};

        // Measure execution time of reverse function
        double startTime = System.nanoTime();
        reverse(arr, 0, arr.length - 1); // Call reverse function with array
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000; // Convert to milliseconds

        // Print the reversed array
        System.out.println("Reversed array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nTime taken: " + duration + " milliseconds");
    }
}



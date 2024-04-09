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

        // Call the reverse function with start index 0 and end index n-1
        reverse(arr, 0, arr.length - 1);

        // Print the reversed array
        System.out.println("Reversed array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


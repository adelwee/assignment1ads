public class task1 {
    public static int findMinimum(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] numbers = {9, 5, 7, 3, 11, 2};
        int min = findMinimum(numbers);
        System.out.println("The minimum element is: " + min);
    }
}

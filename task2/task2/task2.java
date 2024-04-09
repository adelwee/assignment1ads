public class task2 {
    public static double calculateAverage(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        return (double) sum / array.length;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 2, 4};
        double average = calculateAverage(numbers);
        System.out.println("The average of the elements is: " + average);
    }
}

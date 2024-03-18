public class index {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int index = findIndex(numbers, 5);
        if (index != -1) {
            System.out.println("The index of the target element is: " + index);
        } else {
            System.out.println("The target element is not in the array");
        }
    }

    public static int findIndex(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
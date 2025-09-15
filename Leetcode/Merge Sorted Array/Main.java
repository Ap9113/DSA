import java.util.Arrays;

class Main {

    public static void merge(int[] arr1, int m, int[] arr2, int n) {
        int i = m - 1; // Last valid element in arr1
        int j = n - 1; // Last element in arr2
        int k = m + n - 1; // End of arr1

        // Merge from the back
        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[k--] = arr1[i--];
            } else {
                arr1[k--] = arr2[j--];
            }
        }

        // Copy any remaining elements from arr2 (if any)
        while (j >= 0) {
            arr1[k--] = arr2[j--];
        }

        // No need to copy arr1's remaining elements — they’re already in place
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 0, 0, 0};
        int[] arr2 = {2, 4, 6};
        int m = 3, n = 3;
        merge(arr1, m, arr2, n);
        System.out.println("Merged In-Place: " + Arrays.toString(arr1));
    }
}

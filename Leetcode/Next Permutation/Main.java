import java.util.*;

public class Main {

    static List<List<Integer>> permutations = new ArrayList<>();

    public static void nextPermutationBrute(int[] arr) {
        List<Integer> input = new ArrayList<>();
        for (int num : arr) 
            input.add(num);
        permute(input, 0);
        Collections.sort(permutations, (a, b) -> {
            for (int i = 0; i < a.size(); i++) {
                if (!a.get(i).equals(b.get(i))) return a.get(i) - b.get(i);
            }
            return 0;
        });

        for (int i = 0; i < permutations.size(); i++) {
            if (permutations.get(i).equals(input) && i + 1 < permutations.size()) {
                List<Integer> next = permutations.get(i + 1);
                for (int j = 0; j < arr.length; j++) {
                    arr[j] = next.get(j);
                }
                return;
            }
        }
        Arrays.sort(arr);
    }

    static void permute(List<Integer> arr, int start) {
        if (start == arr.size()) {
            permutations.add(new ArrayList<>(arr));
            return;
        }
        for (int i = start; i < arr.size(); i++) {
            Collections.swap(arr, i, start);
            permute(arr, start + 1);
            Collections.swap(arr, i, start);
        }
    }


    public static void nextPermutationOptimal(int[] arr) {
        int n = arr.length;
        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i + 1])
            i--;

        if (i >= 0) {
            int j = n - 1;
            while (arr[j] <= arr[i])
                j--;
            swap(arr, i, j);
        }
        reverse(arr, i + 1, n - 1);
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start++, end--);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arr1 = {3, 2, 1};
        nextPermutationBrute(arr);
        System.out.println(Arrays.toString(arr));
        nextPermutationOptimal(arr1);
        System.out.println(Arrays.toString(arr1));
    }

}

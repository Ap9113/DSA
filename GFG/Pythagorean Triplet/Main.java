import java.util.*;

class Main {
    static boolean pythagoreanTripletBrute(int[] arr) {
        // code here
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int a2 = arr[i] * arr[i];
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                int b2 = arr[j] * arr[j];
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;
                    int c2 = arr[k] * arr[k];
                    if (a2 + b2 == c2) return true;
                }
            }
        }
        return false;
    }

    static boolean pythagoreanTripletBetter(int[] arr) {
        int n = arr.length;
        HashSet<Integer> squares = new HashSet<>();
        for (int num : arr) {
            squares.add(num * num);
        }
        for (int i = 0; i < n; i++) {
            int a2 = arr[i] * arr[i];
            for (int j = i + 1; j < n; j++) {
                int b2 = arr[j] * arr[j];
                int sum = a2 + b2;

                if (squares.contains(sum)) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean pythagoreanTripletOptimal(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] * arr[i];
        }
        Arrays.sort(arr);

        for (int i = n - 1; i >= 2; i--) {
            int c2 = arr[i];
            int left = 0, right = i - 1;
            while (left < right) {
                int sum = arr[left] + arr[right];
                if (sum == c2) 
                    return true;
                else if (sum < c2) 
                    left++;
                else 
                    right--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
    }
}

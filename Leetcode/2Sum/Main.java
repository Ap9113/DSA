import java.util.Arrays;
import java.util.HashMap;

class Main {

    public static int[] twoSumBrute(int[] arr, int target) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        return new int[] {};
    }

    public static int[] twoSumOptimal(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int rem = target - arr[i];
            if(map.containsKey(rem))
                return new int[] {map.get(rem), i};
            map.put(arr[i], i);
        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args) {
        int[] arr = {6,2,7,11,15};
        int target = 13;

        System.out.println(Arrays.toString(twoSumBrute(arr, target)));
        System.out.println(Arrays.toString(twoSumOptimal(arr, target)));
    }
}

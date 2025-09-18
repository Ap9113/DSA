import java.util.*;

public class Main {

    public static int subarraySumBrute(int[] arr, int k){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            int sum = 0;
            for (int j = i; j < arr.length; j++){
                sum += arr[j];
                if (sum == k)
                    count++;
            }
        }
        return count;
    }

    public static int subarraySumBetter(int[] arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0;
        int prefixSum = 0;
        for (int num : arr){
            prefixSum += num;
            if (map.containsKey(prefixSum - k))
                count += map.get(prefixSum - k);
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }

    public static int subarraySumOptimal(int[] arr, int k){ // only for non-negative array elements
        int count = 0;
        int j = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
            while (sum > k && j <= i)
                sum -= arr[j++];
            if (sum == k)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 1};
        int k = 2;
        System.out.println(subarraySumBrute(arr, k));
        System.out.println(subarraySumBetter(arr, k));
        System.out.println(subarraySumOptimal(arr, k));
    }
}

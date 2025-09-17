import java.util.*;

public class Main {

    public static List<List<Integer>> threeSumBrute(int[] arr){
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n - 2; i++){
            for (int j = i + 1; j < n - 1; j++){
                for (int k = j + 1; k < n; k++){
                    if (arr[i] + arr[j] + arr[k] == 0){
                        List<Integer> triplet = Arrays.asList(arr[i], arr[j], arr[k]);
                        Collections.sort(triplet);
                        if (!result.contains(triplet))
                            result.add(triplet);
                    }
                }
            }
        }
        return result;
    }

    public static List<List<Integer>> threeSumBetter(int[] arr){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++){
            if (i > 0 && arr[i] == arr[i - 1])
                continue;
            int l = i + 1;
            int r = arr.length - 1;
            while (l < r){
                int sum = arr[i] + arr[l] + arr[r];
                if (sum == 0){
                    result.add(Arrays.asList(arr[i], arr[l], arr[r]));
                    while (l < r && arr[l] == arr[l + 1]) 
                        l++;
                    while (l < r && arr[r] == arr[r - 1]) 
                        r--;
                    l++;
                    r--;
                } 
                else if (sum < 0)
                    l++;
                else
                    r--;
            }
        }
        return result;
    }

    public static List<List<Integer>> threeSumOptimal(int[] arr){
        List<List<Integer>> result = new ArrayList<>();
        if (arr == null || arr.length < 3)
            return result;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1])
                continue;
            int target = -arr[i];
            Set<Integer> seen = new HashSet<>();

            for (int j = i + 1; j < arr.length; j++){
                int complement = target - arr[j];
                if (seen.contains(complement)) {
                    result.add(Arrays.asList(arr[i], arr[j], complement));
                    while (j < arr.length - 1 && arr[j] == arr[j + 1])
                        j++;
                }
                seen.add(arr[j]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(threeSumBrute(arr));
        System.out.println(threeSumBetter(arr));
        System.out.println(threeSumOptimal(arr));
    }

}

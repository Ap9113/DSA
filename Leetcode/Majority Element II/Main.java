import java.util.*;

public class Main {


    public static List<Integer> majorityElementBrute(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++){
            int count = 0;
            for (int j = 0; j < n; j++){
                if (arr[i] == arr[j])
                    count++;
            }
            if (count > n / 3 && !ans.contains(arr[i])){
                ans.add(arr[i]);
            }
        }
        return ans;
    }

    public static List<Integer> majorityElementBetter(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);
        int count = 1;
        for (int i = 1; i < n; i++){
            if (arr[i] == arr[i - 1]){
                count++;
            } 
            else{
                if (count > n / 3){
                    ans.add(arr[i - 1]);
                }
                count = 1;
            }
        }
        // Last element check
        if (count > n / 3){
            ans.add(arr[n - 1]);
        }        
        return ans;
    }

    public static List<Integer> majorityElementBetter1(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int ele : arr){
            freqMap.put(ele, freqMap.getOrDefault(ele, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            if (entry.getValue() > n / 3){
                ans.add(entry.getKey());
            }
        }        
        return ans;
    }

    public static List<Integer> majorityElementOptimal(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        if (n == 0) 
            return ans;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;
        int count1 = 0, count2 = 0;        
        for (int ele : arr) {
            if (ele == ele1){
                count1++;
            } 
            else if (ele == ele2){
                count2++;
            }
            else if (count1 == 0){
                ele1 = ele;
                count1 = 1;
            } 
            else if (count2 == 0){
                ele2 = ele;
                count2 = 1;
            } 
            else{
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int ele : arr) {
            if (ele == ele1) count1++;
            else if (ele == ele2) count2++;
        }
        if (count1 > n / 3) 
            ans.add(ele1);
        if (count2 > n / 3) 
            ans.add(ele2);
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(majorityElementBrute(nums));
        System.out.println(majorityElementBetter(nums));
        System.out.println(majorityElementBetter1(nums));
        System.out.println(majorityElementOptimal(nums));
    }
}

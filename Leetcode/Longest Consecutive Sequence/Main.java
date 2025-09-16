import java.util.*;

public class Main {
    
    public static int longestConsecutiveBrute(int[] nums){
        int maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int count = 1;

            while (hasEle(nums, current + 1)) {
                current++;
                count++;
            }

            maxLen = Math.max(maxLen, count);
        }

        return maxLen;
    }

    public static int longestConsecutiveBetter(int[] nums){
        if (nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int maxLen = 1, count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            } else if (nums[i] == nums[i - 1] + 1) {
                count++;
            } else {
                count = 1;
            }
            maxLen = Math.max(maxLen, count);
        }

        return maxLen;
    }

    public static int longestConsecutiveOptimal(int[] nums){
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        int maxLen = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int current = num;
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                maxLen = Math.max(maxLen, count);
            }
        }

        return maxLen;
    }

    private static boolean hasEle(int[] nums, int target){
        for (int num : nums) {
            if (num == target) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 4, 3, 1, 3, 2};
        System.out.println(longestConsecutiveBrute(nums));
        System.out.println(longestConsecutiveBetter(nums));
        System.out.println(longestConsecutiveOptimal(nums));
    }
}

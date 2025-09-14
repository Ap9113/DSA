

class Main {
    public static int maxSubarraySumBrute(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int n = arr.length;
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    sum += arr[k];
                }
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    public static int maxSubArraySumBetter(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int n = nums.length;
        for (int start = 0; start < n; start++) {
            int currentSum = 0;
            for (int end = start; end < n; end++) {
                currentSum += nums[end];
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }

    public static int maxSubArraySumOptimal(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int num : nums) {
            currentSum += num;
            maxSum = Math.max(maxSum, currentSum);
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubarraySumBrute(arr));
        System.out.println(maxSubArraySumBetter(arr));
        System.out.println(maxSubArraySumOptimal(arr));
    }
}

public class Main {

    public static int maxProductBrute(int[] nums) {
        int n = nums.length;
        int maxProd = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = i; j < n; j++) {
                product *= nums[j];
                maxProd = Math.max(maxProd, product);
            }
        }
        return maxProd;
    }

    public static int maxProductOptimal(int[] nums) {
        if (nums == null || nums.length == 0)
             return 0;
        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }
            maxSoFar = Math.max(nums[i], maxSoFar * nums[i]);
            minSoFar = Math.min(nums[i], minSoFar * nums[i]);
            result = Math.max(result, maxSoFar);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println(maxProductBrute(nums));
        System.out.println(maxProductOptimal(nums));
    }
}

import java.util.*;

public class Main {

    public static int smallestDivisorBrute(int[] nums, int threshold) {
        int maxNum = Arrays.stream(nums).max().getAsInt();
        for (int i = 1; i <= maxNum; i++) {
            int sum = 0;
            for (int num : nums) {
                sum += (num + i - 1) / i;
            }
            if (sum <= threshold) {
                return i;
            }
        }        
        return -1;
    }

    public static int smallestDivisorOptimal(int[] nums, int threshold) {
        int maxNum = Arrays.stream(nums).max().getAsInt();
        int low = 1, high = maxNum;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int sum = 0;
            for (int num : nums) {
                sum += (num + mid - 1) / mid;
            }
            if (sum <= threshold) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 9};
        int threshold = 6;
        System.out.println(smallestDivisorBrute(nums, threshold));
        System.out.println(smallestDivisorOptimal(nums, threshold));
    }
}

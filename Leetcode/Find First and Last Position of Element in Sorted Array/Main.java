
public class Main {

    public static int[] searchRangeBrute(int[] nums, int target) {
        int first = -1;
        int last = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (first == -1) first = i;
                last = i;
            }
        }
        return new int[]{first, last};
    }

    public int lowerBound(int[] nums, int target){
        int l=0, h=nums.length-1, ans = nums.length;
        while(l<=h){
            int mid = (l+h)/2;
            if(nums[mid]  >= target){
                ans = mid;
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return ans;
    }

    public int upperBound(int[] nums, int target){
        int l=0, h=nums.length-1, ans = nums.length;
        while(l<=h){
            int mid = (l+h)/2;
            if(nums[mid]  > target){
                ans = mid;
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int lb = lowerBound(nums, target);
        if(lb==nums.length|| nums[lb] != target) return new int[] {-1,-1};
        return new int[] {lb, upperBound(nums, target)-1};
    }

}


public class Main {

    public static boolean searchBrute(int[] nums, int target) {
        for (int num : nums) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static boolean searchOptimal(int[] nums, int target) {
        int l=0, h=nums.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]==target)
                return true;
            if (nums[l] == nums[mid] && nums[mid] == nums[h]) {
                l = l + 1;
                h = h - 1;
                continue;
            }
            if(nums[l]<=nums[mid]){
                if(nums[mid]>=target && nums[l]<=target)
                    h=mid-1;
                else
                    l=mid+1;
            }
            else{
                if(nums[mid]<=target && nums[h]>=target)
                    l=mid+1;
                else
                    h=mid-1;
            }
        }
        return false;
    }
}

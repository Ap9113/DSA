
public class Main {

    public static int searchInsertBrute(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == target){
                return i;
            }
            if (nums[i] > target){
                return i;
            }
        }
        return nums.length;
    }

    public static int searchInsertOptimal(int[] nums, int target){
        int l=0,h=nums.length-1,ans=nums.length;
        while(l<=h){
            int mid = (l+h)/2;
            if(nums[mid]>=target){
                ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        System.out.println(searchInsertBrute(nums,target));
        System.out.println(searchInsertOptimal(nums,target));
    }
}

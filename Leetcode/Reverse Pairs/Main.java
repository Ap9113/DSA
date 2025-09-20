
public class Main {

    public static int reversePairsBrute(int[] nums){
        int count = 0;
        for(int i = 0; i< nums.length;i++){
            for(int j = i+1; j<nums.length;j++){
                if((long)nums[i] > (2 * (long)nums[j])){
                    count++;
                }
            }
        }
        return count;
    }

    public static int reversePairsOptimal(int[] nums){
        return mergeSort(nums, 0, nums.length - 1);
    }

    private static int mergeSort(int[] nums, int i, int j){
        int count = 0;
        if(i >= j)
            return 0;
        int mid = i + (j - i) / 2;
        count += mergeSort(nums, i, mid);
        count += mergeSort(nums, mid + 1, j);
        count += countPairs(nums, i, mid, j);
        merge(nums, i, mid, j);
        return count;
    }

    private static int countPairs(int[] nums, int i, int mid, int j) {
        int count = 0;
        int right = mid + 1;
        for (int left = i; left <= mid; left++) {
            while (right <= j && (long)nums[left] > 2 * (long)nums[right]) {
                right++;
            }
            count += (right - (mid + 1));
        }
        return count;
    }

    private static void merge(int[] nums, int i, int mid, int j) {
        int[] temp = new int[j - i + 1];
        int left = i;
        int right = mid + 1;
        int k = 0;
        while (left <= mid && right <= j) {
            if (nums[left] <= nums[right]) {
                temp[k++] = nums[left++];
            } 
            else {
                temp[k++] = nums[right++];
            }
        }
        while (left <= mid) {
            temp[k++] = nums[left++];
        }
        while (right <= j) {
            temp[k++] = nums[right++];
        }
        for (int a = i; a <= j; a++) {
            nums[a] = temp[a - i];
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,3,2,3,1};
        System.out.println(reversePairsBrute(nums));
        System.out.println(reversePairsOptimal(nums));
    }
}

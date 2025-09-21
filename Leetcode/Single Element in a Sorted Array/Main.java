
public class Main {

    public static int singleNonDuplicateBrute(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i += 2) {
            if (arr[i] != arr[i + 1]) {
                return arr[i];
            }
        }
        return arr[n - 1];
    }

    public static int singleNonDuplicateOptimal(int[] arr){
        int low = 0;
        int high = arr.length-1;
        if (arr.length == 1)
            return arr[0];
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (mid % 2 == 1)
                mid--;
            if (arr[mid] == arr[mid + 1])
                low = mid + 2;
            else
                high = mid;
        }
        return arr[low];
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicateBrute(arr));
        System.out.println(singleNonDuplicateOptimal(arr));
    }
}

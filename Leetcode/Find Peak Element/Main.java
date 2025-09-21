public class Main {

    public static int findPeakElementBrute(int[] arr) {
        int n = arr.length;
        if (n == 1 || arr[0] > arr[1]) {
            return 0;
        }
        if (arr[n - 1] > arr[n - 2]) {
            return n - 1;
        }
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return i;
            }
        }
        return -1; 
    }

    public static int findPeakElementOptimal(int[] arr) {
        int l = 0;
        int h = arr.length - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if ((mid == 0 || arr[mid - 1] <= arr[mid]) && 
                (mid == arr.length - 1 || arr[mid + 1] <= arr[mid])) {
                return mid;
            }
            if (mid > 0 && arr[mid - 1] > arr[mid]) {
                h = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 5, 6, 4};
        System.out.println(findPeakElementBrute(arr));
        System.out.println(findPeakElementOptimal(arr));    
    }

}

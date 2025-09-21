
public class Main {

    public static int findMinBrute(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findMinOptimal(int[] arr) {
        if(arr[0] < arr[arr.length-1]) 
            return arr[0];
        int l = 0, h = arr.length - 1;
        while (l < h) {
            int m = (l + h) / 2;
            if (arr[m] == arr[h])
                h--;
            else if (arr[m] < arr[h])
                h = m;
            else
                l = m + 1;
        }
        return arr[l];
    }

    public static void main(String[] args) {
        int[] arr = {2,2,2,0,1};
        System.out.println(findMinBrute(arr));
        System.out.println(findMinOptimal(arr));
    }
}

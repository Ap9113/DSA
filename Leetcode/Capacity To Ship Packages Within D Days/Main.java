import java.util.Arrays;

public class Main {

    public static int findDays(int[] weights, int cap) {
        int days = 1; //First day.
        int load = 0;
        int n = weights.length; //size of array.
        for (int i = 0; i < n; i++) {
            if (load + weights[i] > cap) {
                days += 1; //move to next day
                load = weights[i]; //load the weight.
            } else {
                //load the weight on the same day.
                load += weights[i];
            }
        }
        return days;
    }

    public static int leastWeightCapacityBrute(int[] weights, int d) {
        int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();
        for (int i = low; i <= high; i++) {
            if (findDays(weights, i) <= d) {
                return i;
            }
        }
        return -1;
    }

    public static int shipWithinDaysOptimal(int[] weights, int d) {
        int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();
        while (low <= high) {
            int mid = (low + high) / 2;
            int numberOfDays = findDays(weights, mid);
            if (numberOfDays <= d) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int d = 5;
        System.out.println(leastWeightCapacityBrute(weights, d));
        System.out.println(shipWithinDaysOptimal(weights, d));
    }
}

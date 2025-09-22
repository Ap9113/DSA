import java.util.*;

public class Main {

    public static int minEatingSpeedBrute(int[] piles, int H) {
        int maxPile = Arrays.stream(piles).max().getAsInt();
        for (int speed = 1; speed <= maxPile; speed++) {
            int hours = 0;
            for (int pile : piles) {
                hours += (pile + speed - 1) / speed;
            }
            if (hours <= H) {
                return speed;
            }
        }
        return -1;
    }

    public static int minEatingSpeedOptimal(int[] piles, int H) {
        int left = 1, right = Arrays.stream(piles).max().getAsInt();
        while (left < right) {
            int mid = left + (right - left) / 2;
            int hours = 0;            
            for (int pile : piles) {
                hours += (pile + mid - 1) / mid;
            }            
            if (hours > H) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }        
        return left;
    }

    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int H = 8;
        System.out.println(minEatingSpeedBrute(piles, H));
        System.out.println(minEatingSpeedOptimal(piles, H));
    }
}

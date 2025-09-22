import java.util.*;

public class Main {
    
    private static boolean possible(int[] arr, int day, int m, int k){
        int n = arr.length;
        int count = 0, noOfBou = 0;
        for(int i=0; i<n; i++){
            if(arr[i]<=day)
                count++;
            else{
                noOfBou += count/k;
                count = 0;
            }
        }
        noOfBou += count/k;
        if(noOfBou >= m)
            return true;
        return false;
    }
    public static int minDaysBrute(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if(n<(m*k))
            return -1;
        int l = Arrays.stream(bloomDay).min().getAsInt();
        int h = Arrays.stream(bloomDay).max().getAsInt();
        for(int i = l; i<=h; i++){
            if(possible(bloomDay, i, m, k)){
                return i;
            }
        }
        return -1;
    }

    public static int minDaysOptimal(int[] bloomDay, int m, int k) {
        int n = bloomDay.length, ans= -1;
        if(n<(m*k))
            return -1;
        int l = Arrays.stream(bloomDay).min().getAsInt();
        int h = Arrays.stream(bloomDay).max().getAsInt();
        while(l<=h){
            int mid = l+(h-l)/2;
            if(possible(bloomDay,mid,m,k)){
                ans = mid;
                h = mid-1;
            }
            else
                l = mid+1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] bloomDay = {1,10,3,10,2};
        int m = 3, k = 1;
        System.out.println(minDaysBrute(bloomDay, m, k));
        System.out.println(minDaysOptimal(bloomDay, m, k));
    }
}

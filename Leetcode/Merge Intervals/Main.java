import java.util.*;

public class Main {

    public static int[][] mergeBrute(int[][] intervals) {
        int n = intervals.length;
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean merged = false;
            for (int j = 0; j < result.size(); j++){
                if (intervals[i][0] <= result.get(j)[1] && intervals[i][1] >= result.get(j)[0]) {
                    result.get(j)[1] = Math.max(result.get(j)[1], intervals[i][1]);
                    merged = true;
                    break;
                }
            }
            if (!merged) {
                result.add(intervals[i]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }

    public static int[][] mergeOptimal(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> merged = new ArrayList<>();
        for (int[] ele : intervals){
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < ele[0]){
                merged.add(ele);
            } 
            else{
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], ele[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] mergedBrute = mergeBrute(intervals);
        for (int[] ele : mergedBrute) {
            System.out.println(Arrays.toString(ele));
        }
        int[][] mergedOptimal = mergeOptimal(intervals);
        for (int[] ele : mergedOptimal) {
            System.out.println(Arrays.toString(ele));
        }
    }
}

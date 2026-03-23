import java.util.ArrayList;
import java.util.List;

public class leetcode_57 {
    public static void main(String[] args) {
        int[][] intervals = { { 1, 5 }, {6,8} }; // { 1, 2 }, { 3, 5 }, { 6, 7 }, { 8, 10 }, { 12, 14 }
        int[] newInterval = { 9, 16 };  // { 4, 8 }
        int [] [] result = insert_Interval(intervals, newInterval);
        for (int[] is : result) {
            System.out.println(is[0] + " " + is[1]);
        }
    }

    public static int[][] insert_Interval(int[][] intervals, int[] newInterval) {

        List<int[]> list = new ArrayList<>();
        int i = 0;
       // Step 1: non-overlapping before newInterval
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
           list.add(intervals[i++]);
        }

        // Step 2: merge overlapping intervals
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        // Step 3. Add merged interval
        list.add(newInterval);

        // Step 4. Add remaining intervals
        while (i < intervals.length) {
            list.add(intervals[i++]);
        }

        // return output
        return list.toArray(new int[list.size()][]);
    }
}

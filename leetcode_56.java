import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode_56 {
    public static void main(String[] args) {
        int[][] arr = { { 1, 3 }, { 8, 10 }, { 2, 6 }, { 15, 18 } };

        int[][] result = merger_Intervals(arr);
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }

    public static int[][] merger_Intervals(int[][] intervals) {
        // sort_Array(intervals);
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> list = new ArrayList<>();
        int[] newInterval = intervals[0];
        list.add(newInterval);

        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];

            if (interval[0] <= newInterval[1]) {
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            } else {
                newInterval = interval;
                list.add(newInterval);
            }
        }

        return list.toArray(new int[list.size()][]);
    }

    // Bubble Sort
    public static void sort_Array(int[][] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j][0] > arr[j + 1][0]) {
                    int[] temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

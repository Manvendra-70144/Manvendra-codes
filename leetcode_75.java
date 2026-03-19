public class leetcode_75 {
    public static void main(String[] args) {
        int[] arr = { 2, 0, 2, 1, 1, 0 };
        sort_color(arr);
    }

    public static void sort_color(int[] nums) {

        int start = 0, mid = 0, end = nums.length - 1;
        while (mid <= end) {
            switch (nums[mid]) {
                case 0:
                    swap(nums, start, mid);
                    start++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    swap(nums, mid, end);
                    end--;
                    break;
            }
        }
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    public static void swap(int[] nums, int s, int e) {
        int temp = nums[s];
        nums[s] = nums[e];
        nums[e] = temp;
    }

}

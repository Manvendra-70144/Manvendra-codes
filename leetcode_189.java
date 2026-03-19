public class leetcode_189 {
    public static void main(String[] args) {
        int[] arr = { -1 };
        int k = 2;
        rotate_Array_k_times(arr, k);
    }

    public static void rotate_Array_k_times(int[] nums, int k) {

        k %= nums.length;
        rotate(0, nums.length-1, nums);
        rotate(0, k-1, nums);
        rotate(k, nums.length-1, nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    public static void rotate(int s, int e, int[] arr) {
        while (s < e) {
            int temp = arr[s];
            arr[s++] = arr[e];
            arr[e--] = temp;
        }
    }
}
